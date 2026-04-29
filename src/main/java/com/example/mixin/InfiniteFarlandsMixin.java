package com.example.mixin;

import net.minecraft.util.math.noise.OctavePerlinNoiseSampler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(OctavePerlinNoiseSampler.class)
public class InfiniteFarlandsMixin {
    @Overwrite
    public static double maintainPrecision (double d) {return d;}

}
