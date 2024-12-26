
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.jelzox.luxure.init;

import net.minecraft.client.gui.screens.MenuScreens;

import com.jelzox.luxure.client.gui.CustInvScreen;

public class LuxureModScreens {
	public static void load() {
		MenuScreens.register(LuxureModMenus.CUST_INV, CustInvScreen::new);
	}
}
