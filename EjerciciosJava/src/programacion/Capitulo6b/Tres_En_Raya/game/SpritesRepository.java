package programacion.Capitulo6b.Tres_En_Raya.game;


import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class SpritesRepository {
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	private static SpritesRepository instance = null;
	private static String RESOURCES_FOLDER = "../resources/images/";
	public static String IMAGE_PLAYER_1 = "vader.png";
	public static String IMAGE_PLAYER_2 = "yoda.png";

	/**
	 * 
	 */
	public SpritesRepository() {
		this.getSprite(IMAGE_PLAYER_1);
		this.getSprite(IMAGE_PLAYER_2);
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
