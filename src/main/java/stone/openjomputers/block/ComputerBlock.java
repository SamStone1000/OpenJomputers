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
package stone.openjomputers.block;

import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import stone.openjomputers.block.entity.ComputerBlockEntity;

/**
 * @author SamSt
 *
 */
public class ComputerBlock extends BlockWithEntity implements BlockEntityProvider {

	/**
	 * @param settings
	 */
	protected ComputerBlock(Settings settings) {
		super(settings);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BlockEntity createBlockEntity(BlockView world) {
		return new ComputerBlockEntity();
	}

}
