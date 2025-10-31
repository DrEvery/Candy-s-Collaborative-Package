package net.mudhut.example_addon;

import net.mudhut.ffpackage.registries.FFPRegistries;
import net.mudhut.ffpackage.util.AnimatronicSuit;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleSuitRegistry {
    // The registry for suits
    public static final DeferredRegister<AnimatronicSuit> SUITS =
            DeferredRegister.create(FFPRegistries.SUIT_REGISTRY, FFPExample.MODID);

    // Here's where you register your suits, first you define the model like so, and then you register
    // the normal, damaged, and withered textures, for the withering system the suits have
    public static final Supplier<AnimatronicSuit> BAG_FREDDY_SUIT = SUITS.register("bag_freddy_suit", () ->
            new AnimatronicSuit(FFPExample.resource("textures/model/bag_freddy.png"),
                    FFPExample.resource("textures/model/bag_freddy_damaged.png"),
                    FFPExample.resource("textures/model/bag_freddy_withered.png")));
}
