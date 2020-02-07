package programacion.Capitulo6b.Arkanoid.version1;


import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class SpritesRepository {
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	private static SpritesRepository instance = null;
	private static String RESOURCES_FOLDER = "../res/images/";
	public static String NAVE_IMAGE = "nave-50x15.png";
	public static String WALLPAPER_LEVEL1 = "level1.jpg";
	public static String WALLPAPER_LEVEL2 = "level2.jpg";
	public static String LIFE = "life.png";
	public static String GAME_OVER_IMAGE = "game-over.png";
	

	/**
	 * 
	 */
	public SpritesRepository() {
		this.getSprite(NAVE_IMAGE);	
		this.getSprite(WALLPAPER_LEVEL1);
		this.getSprite(WALLPAPER_LEVEL2);
		this.getSprite(LIFE);
		this.getSprite(GAME_OVER_IMAGE);
	}

	/**
	 * 
	 */
	/**
	 * @return the instance
	 */
	public static SpritesRepository getInstance() {
		if (instance == null) {
			instance = new SpritesRepository();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	private BufferedImage loadImage (String resourceName) {
		URL url = null;
		
		try {
			url = getClass().getResource(resourceName);
			return ImageIO.read(url);
			
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + resourceName + " de "+ url);
			System.out.println("El error fue : " + e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
		}
		return null;
	}	
	
	/**
	 * 
	 */

	public BufferedImage getSprite (String resourceName) {
		BufferedImage img = sprites.get(resourceName);
		if (img == null) {
			img = loadImage(RESOURCES_FOLDER + resourceName);
			sprites.put(resourceName, img);
		}
		return img;
	
	}
	

}
