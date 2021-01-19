package io.github.marcus8448.mods.nodiscord.mixin;

import mindustry.desktop.DesktopLauncher;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DesktopLauncher.class)
@Environment(EnvType.CLIENT)
public class DesktopLauncherMixin {
	@Redirect(at = @At(value = "INVOKE", target = "Larc/util/OS;hasProp(Ljava/lang/String;)Z", remap = false), method = "<init>", remap = false)
	private boolean init(String name) {
		return true;
	}
}
