import java.awt.*;
import java.net.*;
import java.applet.*;

public class AudioSound extends Applet
{
	public void start()
	{
		try{
			play(getCodeBase(),"Kaththi_Theme.mp3");
		}	
		catch(Exception e){}
	}
	
}