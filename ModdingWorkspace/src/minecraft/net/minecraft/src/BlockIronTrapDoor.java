package net.minecraft.src;

public class BlockIronTrapDoor extends BlockTrapDoor {
	protected BlockIronTrapDoor(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(10.0F);
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9){
		return true;
    }
}
