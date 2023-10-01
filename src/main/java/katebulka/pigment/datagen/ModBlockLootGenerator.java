package katebulka.pigment.datagen;

import katebulka.pigment.ExampleMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

public class ModBlockLootGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate() {
        Registries.BLOCK.forEach(block -> {
            Identifier id = Registries.BLOCK.getId(block);

            if (id.getNamespace().equals(ExampleMod.ID)) {
                this.addDrop(block);
            }
        });
    }
}
