package space.codekingdoms.russspruce.sheepcity2;

import org.bukkit.DyeColor;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import com.codekingdoms.nozzle.base.BaseSheep;

public class Sheep extends BaseSheep {

	public void onSpawn() {

		setMaxHealth(20);
		setHealth(20);
		setColor(DyeColor.RED);
		applyPotionEffect(PotionEffectType.SPEED);

	}

	public void onDeath() {

		world.dropItem(getLocation(), new ItemStack(Material.GOLD_BLOCK));

	}


}
