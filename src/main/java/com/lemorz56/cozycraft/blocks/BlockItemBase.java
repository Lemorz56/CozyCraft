package com.lemorz56.cozycraft.blocks;

import com.lemorz56.cozycraft.CozyCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem
{
    public BlockItemBase(Block block, Properties group)
    {
        super(block, new Item.Properties().group(CozyCraft.TAB));
    }
}
