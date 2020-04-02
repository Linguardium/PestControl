log.info("Loading the LibCD compatible recipe table");

var RecipeTweaker = libcd.require("libcd.recipe.RecipeTweaker");
var TweakerUtils = libcd.require("libcd.util.TweakerUtils");
RecipeTweaker.addDictShaped([" L ","LTL"," L "],{"T":"minecraft:torch","L":"pestcontrol:spider_leg"},"pestcontrol:spider_repellent");
RecipeTweaker.addDictShaped(["ST","SL"],{"T":"minecraft:torch","L":"minecraft:bone","S":"minecraft:rotten_flesh"},"pestcontrol:undead_repellent");
RecipeTweaker.addDictShaped([" T"," L"],{"T":"minecraft:torch","L":"pestcontrol:creeper_skin"},"pestcontrol:creeper_repellent");
RecipeTweaker.addShapeless(["pestcontrol:spider_repellent","pestcontrol:undead_repellent","pestcontrol:creeper_repellent"],"pestcontrol:monster_repellent");
RecipeTweaker.addShapeless(["pestcontrol:spider_leg","minecraft:bone","minecraft:rotten_flesh","minecraft:rotten_flesh","pestcontrol:creeper_skin","minecraft:torch"],"pestcontrol:monster_repellent");


var LootTweaker = libcd.require("libcd.loot.LootTweaker");
var Conditions = libcd.require("libcd.loot.Conditions");
var Functions = libcd.require("libcd.loot.Functions");
var Entries = libcd.require("libcd.loot.Entries");

var creeperTable = LootTweaker.getTable("minecraft:entities/creeper");
var creeperPool = creeperTable.addPool(1,1,0,2);
var creeperSkinEntry = Entries.item("pestcontrol:creeper_skin")
    .addFunctions(Functions.countExact(1))
    .addConditions(Conditions.killedByPlayer());
creeperPool.addEntries(creeperSkinEntry);

var spiderTable = LootTweaker.getTable("minecraft:entities/spider")
var spiderPool = spiderTable.addPool(1);
var spiderLegEntry = Entries.item("pestcontrol:spider_leg")
     .addFunctions(Functions.countRange(3, 8))
     .addConditions(Conditions.killedByPlayer());
spiderPool.addEntries(spiderLegEntry);
spiderTable = LootTweaker.getTable("minecraft:entities/cave_spider")
spiderPool = spiderTable.addPool(1);
spiderPool.addEntries(spiderLegEntry);

