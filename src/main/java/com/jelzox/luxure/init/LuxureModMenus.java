
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.jelzox.luxure.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import com.jelzox.luxure.world.inventory.CustInvMenu;
import com.jelzox.luxure.LuxureMod;

public class LuxureModMenus {
	public static MenuType<CustInvMenu> CUST_INV;

	public static void load() {
		CUST_INV = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(LuxureMod.MODID, "cust_inv"), new ExtendedScreenHandlerType<>(CustInvMenu::new));
		CustInvMenu.screenInit();
	}
}
