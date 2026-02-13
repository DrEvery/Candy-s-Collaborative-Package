package com.hamburger.ccp.registries;

import com.hamburger.ccp.CCP;
import net.mudhut.ffpackage.registries.FFPRegistries;
import net.mudhut.ffpackage.util.AnimatronicSuit;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CCPSuitRegistry {
    // The registry for suits
    public static final DeferredRegister<AnimatronicSuit> SUITS =
            DeferredRegister.create(FFPRegistries.SUIT_REGISTRY, CCP.MODID);

    //Replace with Rat when you have model :D
    public static final Supplier<AnimatronicSuit> BAG_FREDDY_SUIT = SUITS.register("bag_freddy_suit", () ->
            new AnimatronicSuit(CCP.resource("textures/model/bag_freddy.png"),
                    CCP.resource("textures/model/bag_freddy_damaged.png"),
                    CCP.resource("textures/model/bag_freddy_withered.png")));
}
