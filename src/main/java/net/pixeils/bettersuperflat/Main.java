package net.pixeils.bettersuperflat;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.registry.Registry;

import net.pixeils.bettersuperflat.gen.ChunkGenerator;
import net.pixeils.bettersuperflat.gen.GenerationSettings;

public class Main implements ModInitializer {

  @Override
  public void onInitialize() {
    Registry.register(
        Registry.CHUNK_GENERATOR, GenerationSettings.NAME, ChunkGenerator.CODEC);
  }


}
