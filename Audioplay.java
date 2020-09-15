import java.net.*;
import java.applet.*;

public class Audioplay extends Applet
{
	AudioClip clip;
	public void init()
	{
		clip=getAudioClip(getCodeBase(),"Kaththi_Theme.mp3");
		clip.play();
	}
	public void start()
	{
		clip.loop();
	}	
	public void stop()
	{
		clip.stop();
	}		
	
}