package net.luckyfox.mccourse.datagen;

import net.luckyfox.mccourse.MCCourseMod;
import net.luckyfox.mccourse.block.custom.MagicBlock;
import net.luckyfox.mccourse.item.ModItems;
import net.luckyfox.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {


    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.BLACK_OPAL.get())
                .add(Items.COAL)
                .add(Items.DANGER_POTTERY_SHERD)
                .add(Items.CYAN_WOOL);

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLACK_OPAL_HELMET.get())
                .add(ModItems.BLACK_OPAL_CHESTPLATE.get())
                .add(ModItems.BLACK_OPAL_LEGGINGS.get())
                .add(ModItems.BLACK_OPAL_BOOTS.get());

        this.tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.BLACK_OPAL.get());

        this.tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.KAUPEN_SMITHING_TEMPLATE.get());

    }
}
