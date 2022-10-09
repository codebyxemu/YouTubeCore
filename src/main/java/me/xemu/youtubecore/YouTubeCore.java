package me.xemu.youtubecore;

import org.bukkit.plugin.java.JavaPlugin;

public class YouTubeCore extends JavaPlugin {

	private static YouTubeCore instance;

	@Override
	public void onEnable() {
		instance = this;
	}

	@Override
	public void onDisable() {
		instance = null;
	}

	public static YouTubeCore getInstance() {
		if (instance == null) {
			throw new NullPointerException("The instance is not yet valid. That means that getInstance() has been called" +
					"before the plugin starts.");
		}
		return instance;
	}
}
