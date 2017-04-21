package de.ellpeck.skygroups;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SkyGroups.MOD_ID, name = SkyGroups.NAME, version = SkyGroups.VERSION)
public class SkyGroups{

    public static final String MOD_ID="skygroups";
    public static final String NAME = "SkyGroups";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance
    public static SkyGroups instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
}
