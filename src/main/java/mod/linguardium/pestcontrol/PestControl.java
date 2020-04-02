package mod.linguardium.pestcontrol;

import mod.linguardium.pestcontrol.blocks.initBlocks;
import mod.linguardium.pestcontrol.items.initItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.launch.common.FabricLauncher;
import net.fabricmc.loader.launch.common.FabricLauncherBase;
import net.fabricmc.loader.launch.server.FabricServerLauncher;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PestControl implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();
    public static boolean CreeperSporesLoaded = false;
    public static final String MOD_ID = "pestcontrol";
    public static final String MOD_NAME = "PestControl";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        CreeperSporesLoaded=FabricLoader.getInstance().isModLoaded("creeperspores");
        initBlocks.init();
        initItems.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}