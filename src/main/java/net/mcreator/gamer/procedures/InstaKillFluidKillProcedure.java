package net.mcreator.gamer.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.gamer.GamerModElements;

import java.util.Map;

@GamerModElements.ModElement.Tag
public class InstaKillFluidKillProcedure extends GamerModElements.ModElement {
	public InstaKillFluidKillProcedure(GamerModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure InstaKillFluidKill!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 0);
	}
}
