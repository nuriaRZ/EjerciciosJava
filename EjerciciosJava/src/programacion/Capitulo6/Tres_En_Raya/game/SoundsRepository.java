package programacion.Capitulo6.Tres_En_Raya.game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;

public class SoundsRepository {
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	private static SoundsRepository instance = null;
	private static String RESOURCES_FOLDER = "../resources/sounds/";
	public static String BACKGROUND_SOUND = "musica.wav";
	public static String SOUND_PLAYER_1 = "missile.wav";
	public static String SOUND_PLAYER_2 = "photon.wav";
	/**
	 * 
	 */
	public SoundsRepository() {
		this.getAudioClip(BACKGROUND_SOUND);
		this.getAudioClip(SOUND_PLAYER_1);
		this.getAudioClip(SOUND_PLAYER_2);		
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
