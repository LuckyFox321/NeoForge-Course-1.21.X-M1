package net.luckyfox.mccourse.item;

import net.luckyfox.mccourse.util.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier BLACK_OPAL = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BLACK_OPAL_TOOL,
            600, 4f, 1.5f, 20,
            () -> Ingredient.of(ModItems.BLACK_OPAL.get()));

}
