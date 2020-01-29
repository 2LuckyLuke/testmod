package com.luke.testmod.init;

import java.util.ArrayList;
import java.util.List;

import com.luke.testmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OBSIDIAN_GLASS_BLOCK = new BlockBase("obsidian_glass_block", Material.ANVIL);
	

}
