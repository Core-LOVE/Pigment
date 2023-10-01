package katebulka.pigment.datagen;

import katebulka.pigment.ExampleMod;
import katebulka.pigment.register.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.nio.file.Path;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataGenerator) {
        // Specifying en_us is optional, by default is is en_us.
        super(dataGenerator, "en_us");
    }

    // totally didn't copy that from Nature's Spirit
    // https://github.com/Team-Hibiscus/NatureSpirit/blob/dev/remappedSrc/net/hibiscus/naturespirit/datagen/NatureSpiritDataGen.java

    private static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for(int i = 0; i < chars.length; i++) {
            if(!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            }
            else if(Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    private void generateBlockTranslations(Block block, TranslationBuilder translationBuilder) {
        String temp = capitalizeString(block.toString().replace("Block{pigment:", "").replace("_", " ").replace("}", ""));
        translationBuilder.add(block, temp);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        Registries.BLOCK.forEach(block -> {
            Identifier id = Registries.BLOCK.getId(block);

            if (id.getNamespace().equals(ExampleMod.ID)) {
                generateBlockTranslations(block, translationBuilder);
            }
        });
    }
}
