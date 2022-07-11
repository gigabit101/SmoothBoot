package net.gigabit101.smoothboot.mixins;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SharedConstants.class)
public class MixinSharedConstants
{
    @Inject(method = "enableDataFixerOptimizations", at = @At("HEAD"), cancellable = true)
    private static void main2(CallbackInfo ci)
    {
        System.out.println("[SmoothBoot] Disabled DataFixerOptimizations");
        ci.cancel();
    }
}
