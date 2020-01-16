package programacion.Capitulo6.Arkanoid.version1;


import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class SpritesRepository {
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	private static SpritesRepository instance = null;
	private static String RESOURCES_FOLDER = "../res/";
	public static String NAVE_IMAGE = "nave-50x15.png";
	

	/**
	 * 
	 */
	public SpritesRepository() {
		this.getSprite(NAVE_IMAGE);		
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
