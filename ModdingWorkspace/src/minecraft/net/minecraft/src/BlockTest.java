package net.minecraft.src;

import java.util.Random;

public class BlockTest extends Block {

	protected BlockTest(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(2.0f);
		this.setLightValue(1.0f);
	}
	
	public int idDropped(int par1, Random par2Random, int par3){
        return(Item.pickaxeDiamond.itemID);
    }
}
