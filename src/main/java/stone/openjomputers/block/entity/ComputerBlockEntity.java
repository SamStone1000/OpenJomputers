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
package stone.openjomputers.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import stone.openjomputers.Main;

/**
 * @author SamSt
 *
 */
public class ComputerBlockEntity extends BlockEntity {

	/**
	 * @param type
	 */
	public ComputerBlockEntity(BlockEntityType<?> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public ComputerBlockEntity() {
		super(Main.COMPUTER_ENTITY_TYPE);
	}

	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
			BlockHitResult hit) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		player.openHandledScreen(null);
	}
}
