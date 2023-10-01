package katebulka.pigment.datagen;

import katebulka.pigment.ExampleMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModTagGenerator extends FabricTagProvider.BlockTagProvider {
    public ModTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        Registries.BLOCK.forEach(block -> {
            Identifier id = Registries.BLOCK.getId(block);
            if (id.getNamespace().equals(ExampleMod.ID)) {
                if (block instanceof WallBlock) this.getOrCreateTagBuilder(BlockTags.WALLS).add(block);
                if (block instanceof SlabBlock) this.getOrCreateTagBuilder(BlockTags.SLABS).add(block);
                if (block instanceof StairsBlock) this.getOrCreateTagBuilder(BlockTags.STAIRS).add(block);

                if (block.toString().contains("terracotta")) this.getOrCreateTagBuilder(BlockTags.TERRACOTTA).add(block);

                if (!block.toString().contains("wool")) {
                    this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block);
                } else {
                    if (block instanceof DyedCarpetBlock) {
                        this.getOrCreateTagBuilder(BlockTags.WOOL_CARPETS).add(block);
                    }
                    this.getOrCreateTagBuilder(BlockTags.WOOL).add(block);
                }
            }
        });
    }
}
