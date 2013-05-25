/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 3.
 * Thaumcraft 3 � Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [25 May 2013, 11:06:00 (GMT)]
 */
package vazkii.tinkerer.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.common.MinecraftForge;
import vazkii.tinkerer.lib.LibEnchantmentIDs;
import vazkii.tinkerer.lib.LibEnchantmentNames;
import cpw.mods.fml.common.registry.LanguageRegistry;

public final class ModEnchantments {

	public static Enchantment freezing;
	public static Enchantment soulbringer;
	public static Enchantment vampirism;
	public static Enchantment ashes;

	public static void initEnchantments(){
		freezing = new EnchantmentFreezing(LibEnchantmentIDs.freezing).setName(LibEnchantmentNames.FREEZING);
		soulbringer = new EnchantmentSoulbringer(LibEnchantmentIDs.soulbringer).setName(LibEnchantmentNames.SOULBRINGER);
		vampirism = new EnchantmentVampirism(LibEnchantmentIDs.vampirism).setName(LibEnchantmentNames.VAMPIRISM);
		ashes = new EnchantmentAshes(LibEnchantmentIDs.ashes).setName(LibEnchantmentNames.ASHES);

		nameEnchantments();

		MinecraftForge.EVENT_BUS.register(new ModEnchantmentHandler());
	}

	private static void nameEnchantments() {
		nameEnchant(freezing, LibEnchantmentNames.FREEZING_D);
		nameEnchant(soulbringer, LibEnchantmentNames.SOULBRINGER_D);
		nameEnchant(vampirism, LibEnchantmentNames.VAMPIRISM_D);
		nameEnchant(ashes, LibEnchantmentNames.ASHES_D);
	}

	private static void nameEnchant(Enchantment enchant, String name) {
		LanguageRegistry.instance().addStringLocalization(enchant.getName(), name);
	}
}
