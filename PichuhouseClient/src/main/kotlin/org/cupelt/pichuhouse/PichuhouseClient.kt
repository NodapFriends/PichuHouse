package org.cupelt.pichuhouse

import com.mojang.logging.LogUtils
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import org.slf4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

const val MOD_ID = "pichuhouse_client"

@Mod(MOD_ID)
object PichuhouseClient {
    val LOGGER: Logger = LogUtils.getLogger()

    init {
        LOGGER.info("$MOD_ID has started!")
        MOD_BUS.addListener(::onClientSetup)
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.info("Initializing PichuhouseClient...")
    }
}