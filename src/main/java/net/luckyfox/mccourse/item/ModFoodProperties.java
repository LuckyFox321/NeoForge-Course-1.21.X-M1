package net.luckyfox.mccourse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.35f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2000), 0.65f).build();

}
