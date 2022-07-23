/**
 * This file is part of OpenJomputers. 
 * Copyright (c) 2022, Stone, All rights reserved.
 * 
 * OpenJomputers is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenJomputers is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with OpenJomputers. If not, see <https://www.gnu.org/licenses/>.
 */
package stone.openjomputers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import stone.openjomputers.block.entity.ComputerBlockEntity;

/**
 * @author SamSt
 *
 */
public class Main implements ModInitializer {

	public static final String MOD_ID = "openjomputers";
	public static final Block COMPUTER_BLOCK = new Block(
			FabricBlockSettings.of(Material.STONE));
	public static BlockEntityType<ComputerBlockEntity> COMPUTER_ENTITY_TYPE;
	// public static final BlockEntityType<JomputerBlockEntity>
	// JOMPUTER_ENTITY_TYPE = new BlockEntityType;

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK,
				new Identifier(MOD_ID, "jomputer"), COMPUTER_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jomputer"),
				new BlockItem(COMPUTER_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE)));
		COMPUTER_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "jomputer"),
				BlockEntityType.Builder.create(ComputerBlockEntity::new, COMPUTER_BLOCK).build(null));
	}

}
