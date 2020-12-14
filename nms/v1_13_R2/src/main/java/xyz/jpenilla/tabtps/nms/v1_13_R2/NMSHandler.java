package xyz.jpenilla.tabtps.nms.v1_13_R2;

import net.minecraft.server.v1_13_R2.MathHelper;
import net.minecraft.server.v1_13_R2.MinecraftServer;
import org.bukkit.craftbukkit.v1_13_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;
import xyz.jpenilla.tabtps.nms.api.NMS;

public class NMSHandler implements NMS {

    @SuppressWarnings("deprecation")
    @Override
    public double[] getTps() {
        return MinecraftServer.getServer().recentTps;
    }

    @SuppressWarnings("deprecation")
    @Override
    public double getMspt() {
        return MathHelper.a(MinecraftServer.getServer().d) * 1.0E-6D;
    }

    @Override
    public int getPing(Player player) {
        return ((CraftPlayer) player).getHandle().ping;
    }
}