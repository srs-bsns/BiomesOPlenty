package biomesoplenty.integration;

import net.minecraft.item.ItemStack;
import biomesoplenty.api.BlockReferences;
import biomesoplenty.api.Blocks;
import biomesoplenty.api.BlockReferences.EnumBlocks;
import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;

public class ThaumcraftIntegration {

	protected static void init()
	{
		addAspects();
	}

	private static void addAspects()
	{
		
		//TODO: Ensure all tags are balanced (Logs shouldn't give more light when turned into planks)
		
		//Woods
		
		ThaumcraftApi.registerObjectTag(getBID("acaciaLog"), getBMeta("acaciaLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(getBID("cherryLog"), getBMeta("cherryLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(getBID("darkLog"), getBMeta("darkLog"), (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.DARK, 2));
		ThaumcraftApi.registerObjectTag(getBID("firLog"), getBMeta("firLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		
		ThaumcraftApi.registerObjectTag(getBID("holyLog"), getBMeta("holyLog"), (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.LIGHT, 2));
		ThaumcraftApi.registerObjectTag(getBID("magicLog"), getBMeta("magicLog"), (new ObjectTags()).add(EnumTag.WOOD, 8).add(EnumTag.MAGIC, 2));
		ThaumcraftApi.registerObjectTag(getBID("mangroveLog"), getBMeta("mangroveLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(getBID("palmLog"), getBMeta("palmLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		
		ThaumcraftApi.registerObjectTag(getBID("redwoodLog"), getBMeta("redwoodLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(getBID("willowLog"), getBMeta("willowLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(getBID("deadLog"), getBMeta("deadLog"), (new ObjectTags()).add(EnumTag.WOOD, 8));
		ThaumcraftApi.registerObjectTag(getBID("bigFlowerStem"), getBMeta("bigFlowerStem"), (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));	

		//Planks
		/*ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 0, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 1, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 2, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.DARK, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 3, (new ObjectTags()).add(EnumTag.WOOD, 2));		
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 4, (new ObjectTags()).add(EnumTag.WOOD, 2).add(EnumTag.LIGHT, 2));		
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 5, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 6, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 7, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 8, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 9, (new ObjectTags()).add(EnumTag.WOOD, 2));
		ThaumcraftApi.registerObjectTag(Blocks.planks.get().blockID, 10, (new ObjectTags()).add(EnumTag.WOOD, 2));


		//Leaves
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.blueLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.DARK, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.DEATH, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIFE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.autumnLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleLeavesFruitless.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redLeaves.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));

		//Saplings
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holySapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.LIGHT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.magicSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.MAGIC, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.darkSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.DARK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.brownSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2).add(EnumTag.DEATH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.acaciaSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.firSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mangroveSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.palmSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redwoodSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.willowSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.appleSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.yellowSapling.blockID, -1, (new ObjectTags()).add(EnumTag.WOOD, 4).add(EnumTag.PLANT, 2));

		//Blocks
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mud.blockID, -1, (new ObjectTags()).add(EnumTag.WATER, 3).add(EnumTag.EARTH, 6));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.driedDirt.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.EARTH, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redRock.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ash.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 3).add(EnumTag.EXCHANGE, 3));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ashStone.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EXCHANGE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardIce.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2).add(EnumTag.COLD, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.originGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardSand.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hardDirt.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.EARTH, 2).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyStone.blockID, -1, (new ObjectTags()).add(EnumTag.LIGHT, 1).add(EnumTag.ROCK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cragRock.blockID, -1, (new ObjectTags()).add(EnumTag.ROCK, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.quicksand.blockID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.TRAP, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.smolderingGrass.blockID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.FIRE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooThatching.blockID, -1, (new ObjectTags()).add(EnumTag.WATER, 14).add(EnumTag.PLANT, 14));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethystBlock.blockID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 58).add(EnumTag.PURE, 58).add(EnumTag.CRYSTAL, 87));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethystOre.blockID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 6).add(EnumTag.PURE, 6).add(EnumTag.CRYSTAL, 14).add(EnumTag.ROCK, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.redRockCobble.blockID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.ROCK, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerRed.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerStem.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.giantFlowerYellow.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.MAGIC, 1));

		//Items
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.amethyst.itemID, -1, (new ObjectTags()).add(EnumTag.VALUABLE, 8).add(EnumTag.PURE, 8).add(EnumTag.CRYSTAL, 16));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.barleyItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.LIFE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.ashes.itemID, -1, (new ObjectTags()).add(EnumTag.DESTRUCTION, 1).add(EnumTag.EXCHANGE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.cattailItem.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 1).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bambooItem.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 2).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mudBrick.itemID, -1, (new ObjectTags()).add(EnumTag.EARTH, 2).add(EnumTag.FIRE, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mudBall.itemID, -1, (new ObjectTags()).add(EnumTag.WATER, 1).add(EnumTag.EARTH, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.shroomPowder.itemID, -1, (new ObjectTags()).add(EnumTag.FUNGUS, 2).add(EnumTag.DESTRUCTION, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bopDisc.itemID, -1, (new ObjectTags()).add(EnumTag.SOUND, 12).add(EnumTag.VALUABLE, 4).add(EnumTag.CROP, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bopDiscMud.itemID, -1, (new ObjectTags()).add(EnumTag.SOUND, 12).add(EnumTag.VALUABLE, 4).add(EnumTag.EARTH, 2).add(EnumTag.WATER, 2));

		//Plants
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.toadstool.blockID, -1, (new ObjectTags()).add(EnumTag.FUNGUS, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.tinyCactus.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2).add(EnumTag.WEAPON, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.holyTallGrass.blockID, -1, (new ObjectTags()).add(EnumTag.WIND, 1).add(EnumTag.PLANT, 1).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.desertSprouts.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.duneGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1).add(EnumTag.WIND, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.thorn.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2).add(EnumTag.WEAPON, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.desertGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deadGrass.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.treeMoss.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.moss.blockID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.sproutItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.bushItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 2));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.mediumGrassItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.shortGrassItem.itemID, -1, (new ObjectTags()).add(EnumTag.PLANT, 1));

		//Flowers
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.violet.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.hydrangea.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.deathbloom.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.DEATH, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.glowFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4).add(EnumTag.LIGHT, 1));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.whiteFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.blueFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.purpleFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.orangeFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.pinkFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 4));
		ThaumcraftApi.registerObjectTag(mod_BiomesOPlenty.tinyFlower.blockID, -1, (new ObjectTags()).add(EnumTag.FLOWER, 1).add(EnumTag.PLANT, 1));*/
		
	}
	
	private static int getBID(String name) {
		return BlockReferences.getBlockID(name);
	}
	
	private static int getBMeta(String name) {
		return BlockReferences.getBlockMeta(name);
	}
}
