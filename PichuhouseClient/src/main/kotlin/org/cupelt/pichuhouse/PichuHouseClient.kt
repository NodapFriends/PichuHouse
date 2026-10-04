package org.cupelt.pichuhouse

import com.mojang.logging.LogUtils
import net.neoforged.bus.api.IEventBus
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.neoforge.common.NeoForge
import org.slf4j.Logger

@Mod(value = PichuHouseClient.MOD_ID)
class PichuHouseClient {
    companion object {
        const val MOD_ID = "pichuhouse_client"
        var LOGGER: Logger = LogUtils.getLogger()
    }

    constructor(modEventBus: IEventBus, modContainer: ModContainer) {
        modEventBus.addListener { event: FMLCommonSetupEvent ->
            this.commonSetup(event)
            // Register ourselves for server and other game events we are interested in.
            // Note that this is necessary if and only if we want *this* class (PichuhouseClient) to respond directly to events.
            // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
            NeoForge.EVENT_BUS.register(this)
        }
    }

    fun commonSetup(event: FMLCommonSetupEvent) {
        // Some common setup code
    }

    @SubscribeEvent
    fun onClientSetup(event: FMLClientSetupEvent) {
        // Some common client code
    }
}