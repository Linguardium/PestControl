log.info("Loading the LibCD compatible recipe table");

var RecipeTweaker = libcd.require("libcd.recipe.RecipeTweaker");
var TweakerUtils = libcd.require("libcd.util.TweakerUtils");
RecipeTweaker.addDictShaped([" T"," L"],{"T":"minecraft:torch","L":"pestcontrol:spider_leg"},"pestcontrol:spider_repellent");
RecipeTweaker.addDictShaped(["ST","SL"],{"T":"minecraft:torch","L":"minecraft:bone","S":"minecraft:rotten_flesh"},"pestcontrol:undead_repellent");
RecipeTweaker.addDictShaped([" T"," L"],{"T":"minecraft:torch","L":"pestcontrol:creeper_skin"},"pestcontrol:creeper_repellent");
RecipeTweaker.addShapeless(["pestcontrol:spider_repellent","pestcontrol:undead_repellent","pestcontrol:creeper_repellent"],"pestcontrol:monster_repellent");
RecipeTweaker.addShapeless(["pestcontrol:spider_leg","minecraft:bone","minecraft:rotten_flesh","minecraft:rotten_flesh","pestcontrol:creeper_skin","minecraft:torch"],"pestcontrol:monster_repellent");
