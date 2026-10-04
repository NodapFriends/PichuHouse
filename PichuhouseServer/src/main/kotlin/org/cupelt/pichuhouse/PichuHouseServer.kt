package org.cupelt.pichuhouse

import com.mojang.logging.LogUtils
import net.neoforged.bus.api.IEventBus
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.neoforge.common.NeoForge
import net.neoforged.neoforge.event.server.ServerStartingEvent
import org.slf4j.Logger

@Mod(value = PichuHouseServer.MOD_ID)
class PichuHouseServer {
    companion object {
        const val MOD_ID = "pichuhouse_client"
        var LOGGER: Logger = LogUtils.getLogger()
    }

    constructor(modEventBus: IEventBus, modContainer: ModContainer) {
        modEventBus.addListener { event: FMLCommonSetupEvent ->
            // Register ourselves for server and other game events we are interested in.
            // Note that this is necessary if and only if we want *this* class (PichuhouseClient) to respond directly to events.
            // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
            NeoForge.EVENT_BUS.register(this)
        }
    }

    @SubscribeEvent
    fun onClientSetup(event: ServerStartingEvent) {
        // Some common server code
    }
}