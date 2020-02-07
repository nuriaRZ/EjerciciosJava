package programacion.Capitulo6b.Videojuego_Formula1.game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;

public class SoundsRepository {
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	private static SoundsRepository instance = null;
	private static String RESOURCES_FOLDER = "../resources/sounds/";
	
	public static String sonido_avanzar = "avanzar.wav";
	public static String sonido_rampa = "rampa.wav";
	public static String sonido_mancha = "mancha.wav";
	/**
	 * 
	 */
	public SoundsRepository() {
		
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
	/**
	 * @return the sounds
	 */
	public HashMap<String, AudioClip> getSounds() {
		return sounds;
	}
	/**
	 * @param sounds the sounds to set
	 */
	public void setSounds(HashMap<String, AudioClip> sounds) {
		this.sounds = sounds;
	}
	/**
	 * @return the rESOURCES_FOLDER
	 */
	public static String getRESOURCES_FOLDER() {
		return RESOURCES_FOLDER;
	}
	/**
	 * @param rESOURCES_FOLDER the rESOURCES_FOLDER to set
	 */
	public static void setRESOURCES_FOLDER(String rESOURCES_FOLDER) {
		RESOURCES_FOLDER = rESOURCES_FOLDER;
	}
	/**
	 * @return the sonido_avanzar
	 */
	public static String getSonido_avanzar() {
		return sonido_avanzar;
	}
	/**
	 * @param sonido_avanzar the sonido_avanzar to set
	 */
	public static void setSonido_avanzar(String sonido_avanzar) {
		SoundsRepository.sonido_avanzar = sonido_avanzar;
	}
	/**
	 * @return the sonido_rampa
	 */
	public static String getSonido_rampa() {
		return sonido_rampa;
	}
	/**
	 * @param sonido_rampa the sonido_rampa to set
	 */
	public static void setSonido_rampa(String sonido_rampa) {
		SoundsRepository.sonido_rampa = sonido_rampa;
	}
	/**
	 * @return the sonido_mancha
	 */
	public static String getSonido_mancha() {
		return sonido_mancha;
	}
	/**
	 * @param sonido_mancha the sonido_mancha to set
	 */
	public static void setSonido_mancha(String sonido_mancha) {
		SoundsRepository.sonido_mancha = sonido_mancha;
	}
	/**
	 * @param instance the instance to set
	 */
	public static void setInstance(SoundsRepository instance) {
		SoundsRepository.instance = instance;
	}


}
