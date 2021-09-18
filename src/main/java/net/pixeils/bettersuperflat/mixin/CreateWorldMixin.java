package net.pixeils.bettersuperflat.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.CreateWorldScreen;
import net.minecraft.client.gui.screen.world.MoreOptionsDialog;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreateWorldScreen.class)
public abstract class CreateWorldMixin extends Screen {
    @Shadow private GameRules gameRules;
    @Shadow @Final public MoreOptionsDialog moreOptionsDialog;
    @Shadow public boolean hardcore;

    protected CreateWorldMixin(Text title) {super(title);}

    @Inject(method = "createLevel",at = @At("HEAD"))
    private void createLevelMix(CallbackInfo ci) {
        if(/*True iff is special world type*/) {
            this.gameRules.get(GameRules./*key*/).setValue(/*value*/,null);
            //repeat ad-hoc
        }
    }
}
