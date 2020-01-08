package programacion.Capitulo6.Videojuego_Formula1.game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;

public class SoundsRepository {
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	private static SoundsRepository instance = null;
	private static String RESOURCES_FOLDER = "../resources/sounds/";
	public static String BACKGROUND_SOUND;
	public static String sonido_avanzar = "avanzar.wav";
	public static String sonido_rampa = "rampa.wav";
	public static String sonido_mancha = "mancha.wav";
	/**
	 * 
	 */
	public SoundsRepository() {
		this.getAudioClip(BACKGROUND_SOUND);
		this.getAudioClip(sonido_avanzar);
		this.getAudioClip(sonido_rampa);	
		this.getAudioClip(sonido_mancha);
	}
	/**
	 * 
	 * @return
	 */	
	public static SoundsRepository getInstance() {
		if (instance == null) {
			instance = new SoundsRepository();			
		}
		return instance;
	}
	/**
	 * 
	 * @param name
	 * @return
	 */
	private AudioClip loadResource(String name) {
		URL url = null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	/**
	 * 
	 * @param resourceName
	 * @return
	 */
	private AudioClip getAudioClip(String resourceName) {
		AudioClip clip = sounds.get(resourceName);
		
		if (clip == null) {
			clip = loadResource(RESOURCES_FOLDER + resourceName);
			sounds.put(resourceName, clip);
		}
		return clip;
	}
	/**
	 * 
	 * @param name
	 */
	public void playSound (final String name) {
		getAudioClip(name).play();
	}
	/**
	 * 
	 * @param name
	 */
	public void loopSound (final String name) {
		getAudioClip(name).loop();
	}
	
	

}
