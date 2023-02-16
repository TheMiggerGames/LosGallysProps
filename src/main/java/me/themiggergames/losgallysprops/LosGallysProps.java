package me.themiggergames.losgallysprops;

import me.themiggergames.losgallysprops.block.ModBlockEntities;
import me.themiggergames.losgallysprops.block.ModBlocks;
import me.themiggergames.losgallysprops.debugtools.DebugLogger;
import me.themiggergames.losgallysprops.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LosGallysProps implements ModInitializer {
    protected static final boolean onDebugTools = true;

    public static final String MOD_ID = "losgallysprops";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("LosGallysProps v1.0.0. Init.");
        ModItems.registerItems();
        DebugLogger.sendMessage("Items Initialized");
        ModBlocks.registerBlocks();
        DebugLogger.sendMessage("Blocks Initialized");
        ModSounds.registerSounds();
        DebugLogger.sendMessage("Sounds Initialized");
        ModBlockEntities.registerBlockEntities();
        DebugLogger.sendMessage("Block Entities Initialized");
        LOGGER.info("Hey stranger! Yes, you. HELLO!!!!!");
        LOGGER.info("What's gonna ruin this game, nothing right?");
        LOGGER.info("LOL NOT. I'm gonna do this 😈");
    }
    public static boolean isDebugEnabled(){
        return onDebugTools;
    }
}
