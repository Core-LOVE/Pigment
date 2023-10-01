package katebulka.pigment.datagen;

import katebulka.pigment.ExampleMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.DyedCarpetBlock;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public static final TagKey<Item> PATTERNED_WOOLS = TagKey.of(RegistryKeys.ITEM, new Identifier(ExampleMod.ID, "patterned_wools"));
    public static final TagKey<Item> PATTERNED_WOOL_CARPETS = TagKey.of(RegistryKeys.ITEM, new Identifier(ExampleMod.ID, "patterned_wool_carpets"));

    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        Registries.BLOCK.forEach(block -> {
            Identifier id = Registries.BLOCK.getId(block);

            if (id.getNamespace().equals(ExampleMod.ID)) {
                if (block.toString().contains("wool")) {
                    if (block instanceof DyedCarpetBlock) {
                        this.getOrCreateTagBuilder(PATTERNED_WOOL_CARPETS).add(block.asItem());
                    }
                    this.getOrCreateTagBuilder(PATTERNED_WOOLS).add(block.asItem());
                }
            }
        });
    }
}
