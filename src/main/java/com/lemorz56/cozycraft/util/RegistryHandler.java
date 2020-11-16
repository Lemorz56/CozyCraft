package com.lemorz56.cozycraft.util;
import com.lemorz56.cozycraft.CozyCraft;
import com.lemorz56.cozycraft.blocks.BlockItemBase;
import com.lemorz56.cozycraft.blocks.Oven;
// MINECRAFT RELATED
import net.minecraft.block.Block;
import net.minecraft.item.Item;
// FORGE RELATED
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    // DEFERRED REGISTERS
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CozyCraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CozyCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // Items

    // Blocks
    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);

    // Block Items
    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven", () -> new BlockItemBase(OVEN.get(), new Item.Properties().group(CozyCraft.TAB)));
}
