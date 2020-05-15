import java.applet.Applet;
import java.applet.AudioClip;

class AudioPlayer {

	private static AudioClip clip = Applet.newAudioClip(AudioPlayer.class.getResource("run.wav"));

	public static void play() {
		clip.play();
	}
}
