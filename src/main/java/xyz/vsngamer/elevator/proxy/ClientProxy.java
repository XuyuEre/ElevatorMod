package xyz.vsngamer.elevator.proxy;

import xyz.vsngamer.elevator.init.ModBlocks;
import xyz.vsngamer.elevator.init.ModSounds;

public class ClientProxy implements CommonProxy{

	@Override
	public void preInit() {
		ModBlocks.registerRenders();

	}

}