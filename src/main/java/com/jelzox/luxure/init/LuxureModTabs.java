
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.jelzox.luxure.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import com.jelzox.luxure.LuxureMod;

public class LuxureModTabs {
	public static ResourceKey<CreativeModeTab> TAB_LUXURE = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(LuxureMod.MODID, "luxure"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_LUXURE, FabricItemGroup.builder().title(Component.translatable("item_group." + LuxureMod.MODID + ".luxure")).icon(() -> new ItemStack(LuxureModItems.BACKPACK)).build());
	}
}
