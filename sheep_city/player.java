package space.codekingdoms.russspruce.sheepcity2;

import org.bukkit.Location;
import org.bukkit.World;
import com.codekingdoms.nozzle.utils.Direction;
import org.bukkit.Material;
import org.bukkit.block.Block;
import com.codekingdoms.nozzle.utils.Random;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Float;
import com.codekingdoms.nozzle.base.BasePlayer;

public class Player extends BasePlayer {

	public void onProjectileHitTarget( String projectileType, Location hitZone ) {

		world.createExplosion(hitZone, 2f);

	}

	public void onMove( Direction direction ) {

		if (getMaterialUnder() == Material.GOLD_BLOCK) {

			jump(1);

		}


	}

	public void onMine( Block block ) {

		if (block.getType() == Material.WOOL) {

			Sheep newSheep = new Sheep();
			newSheep.spawn(world, block.getLocation());

		}


	}


}
