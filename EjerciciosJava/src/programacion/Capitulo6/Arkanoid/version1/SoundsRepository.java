package programacion.Capitulo6.Arkanoid.version1;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;

public class SoundsRepository {
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	private static SoundsRepository instance = null;
	private static String RESOURCES_FOLDER = "../res/sounds/";
	public static String START_SOUND = "Arkanoid-start-of-stage.wav";
	public static String EXPLOSION = "explosion.wav";
	public static String COLISION = "Arkanoid-SFX-01.wav";
	public static String SOUND_START_MOVE_BALL = "Arkanoid-SFX-02.wav";
	public static String BRICK_HARD_SOUND = "Arkanoid-SFX-08.wav";
	/**
	 * 
	 */
	public SoundsRepository() {
		this.getAudioClip(START_SOUND);
		this.getAudioClip(EXPLOSION);
		this.getAudioClip(COLISION);
		this.getAudioClip(SOUND_START_MOVE_BALL);
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
