package com.homebrewCult.TheBigBang.gui.quests;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.homebrewCult.TheBigBang.lists.ItemList;

public enum Quest {
	BlankQuest("TITLE", 100,
			"QUEST_DESCRIPTION"
			),
	ArwensPaint("Arwen's Paint", 100,
			"Arwen was assigned to draw a mural for the Ellinia Magic School Festival, " 
			+ "but she can't finish her mural, because she has run out of yellow and green paint. Find Evil and Curse Eye Tails, which can be used to make paint.",
			ImmutableMap.of(ItemList.EVIL_EYE_TAIL, 20, ItemList.CURSE_EYE_TAIL, 20)
			),
	LazyLittleCalico("Lazy Little Calico", 100,
			"All Calico ever does is sleep, sleep, sleep, when he should be keeping an eye out on the crews bedrooms. "
			+ "Bartol thinks it would be funny to throw an Evil Eye Tail at Calico and see how he reacts. You think it might be a fun little prank..",
			ImmutableMap.of(ItemList.EVIL_EYE_TAIL, 10)
			),
	CutthroatMannysRequest("Cutthroat Manny's Request", 100,
			"A request from Nella. Cutthroat Manny needs to get #item_amount# #item#s so he can make a nice dinner of Evil Eye Stew. Now, that sounds delicious...in a gross, disgusting, putrid type of way!",
			ImmutableMap.of(ItemList.EVIL_EYE_TAIL, 100)
			),
	Polluted("POLLUTED!", 100,
			"Eliminate #kill_amount# #entity# for the Rememberer.",
			1
			),
	Polluted2("POLLUTED! Part 2", 1000,
			"Eliminate #kill_amount# #entity# for the Rememberer.",
			2
			),
	StrangeDish_EvilEye("Strange Dish", 100,
			"Tangyoon has been experimenting with a new dish recently, using an ingredient that no one has ever used before. "
			+ "He's been working with #item0#s and says that he could make something new and fresh if only you would bring him #item_amount0# #item0#s...",
			ImmutableMap.of(ItemList.EVIL_EYE_TAIL, 20)
			),
	StrangeDish_CurseEye("Strange Dish", 100,
			"Tangyoon has been experimenting with a new dish recently, using an ingredient that no one has ever used before. "
			+ "He's been working with #item0#s and says that he could make something new and fresh if only you would bring him #item_amount0# #item0#s...",
			ImmutableMap.of(ItemList.CURSE_EYE_TAIL, 20)
			),
	StrangeDish_ColdEye("Strange Dish", 100,
			"Tangyoon has been experimenting with a new dish recently, using an ingredient that no one has ever used before. "
			+ "He's been working with #item0#s and says that he could make something new and fresh if only you would bring him #item_amount0# #item0#s...",
			ImmutableMap.of(ItemList.COLD_EYE_TAIL, 20)
			),
	AlexTheRunawayKid("Alex the Runaway Kid", 100,
			"On a lonely rooftop in Kerning City, sits a boy named Alex who ran away from home, he�s become exhausted from being on the run with no money. " 
			+ "He wants to return home, but needs Evil Eye Tails and Red Ribbons to persuade his father not to punish him.",
			ImmutableMap.of(ItemList.EVIL_EYE_TAIL, 30, ItemList.PIGS_RIBBON, 5)
			);
	
	private final String TITLE;
	private final int EXP_REWARD;
	private final String DESCRIPTION;
	private final int REQUIRED_KILLS;
	private final Map<Item, Integer> REQUIRED_ITEMS;
	
	private Quest(String title,  int expReward, String description) {
		this(title, expReward, description, 0, ImmutableMap.of());
	}
	
	private Quest(String title,  int expReward, String description, int requiredKills) {
		this(title, expReward, description, requiredKills, ImmutableMap.of());
	}
	
	private Quest(String title,  int expReward, String description, Map<Item, Integer> requiredItems) {
		this(title, expReward, description, 0, requiredItems);
	}
	
	private Quest(String title,  int expReward, String description, int requiredKills, Map<Item, Integer> requiredItems) {
		TITLE = title;
		EXP_REWARD = expReward;
		DESCRIPTION = description;
		REQUIRED_KILLS = requiredKills;
		REQUIRED_ITEMS = requiredItems;
	}
	
	public String getTitle() {
		return TITLE;
	}
	
	public int getExpReward() {
		return EXP_REWARD;
	}
	
	public String getDescription() {
		String format = DESCRIPTION;
		for(int i = 0; i < REQUIRED_ITEMS.size(); i++) {
			String key = "#item" + i + "#";
			String key2 = "#item_amount" + i + "#";
			if(format.contains(key)) {
				Item item = getRequiredItemByIndex(i);
				String name = item.getDisplayName(new ItemStack(item)).getString();
				format = format.replaceAll(key, name);
			}
			if(format.contains(key2)) {
				String amount = "" + getRequiredItemAmountByIndex(i);
				format = format.replaceAll(key2, amount);
			}
		}
		if(REQUIRED_KILLS > 0) {
			String key3 = "#kill_amount#";
			if(format.contains(key3)) {
				String amount = "" + getRequiredKills();
				format = format.replaceAll(key3, amount);
			}
		}	
		return format;
	}
	
	public int getRequiredKills() {
		return REQUIRED_KILLS;
	}
	
	public Map<Item, Integer> getRequiredItems() {
		return REQUIRED_ITEMS;
	}
	
	public int[] getRequiredItemAmounts() {
		int i = 0;
		int[] itemAmounts = new int[REQUIRED_ITEMS.size()];
		for(Map.Entry<Item, Integer> entry : REQUIRED_ITEMS.entrySet()) {
			itemAmounts[i] = entry.getValue();
			i++;
		}
		return itemAmounts;
	}
	
	public Item getRequiredItemByIndex(int index) {
		int i = 0;
		for(Map.Entry<Item, Integer> entry : REQUIRED_ITEMS.entrySet()) {
			if(i == index) {
				return entry.getKey();
			}
			i++;
		}
		return Items.AIR;
	}
	
	public int getRequiredItemAmountByIndex(int index) {
		int i = 0;
		for(Map.Entry<Item, Integer> entry : REQUIRED_ITEMS.entrySet()) {
			if(i == index) {
				return entry.getValue();
			}
			i++;
		}
		return 0;
	}
}
