import java.io.*;

class PushBreaderArr
{
	public static void main(String args[])
	{
		if(args.length<1)
		{
			System.out.println("Usage : java<PBreaderArr3><filename>");
			System.exit(1);
		}
		try
		{
			FileReader r=new FileReader(args[0]);
			FileWriter w=new FileWriter("writer.txt");        	// Create write.txt file and write data to that file
			PushbackReader get_push=new PushbackReader(r,6);
			char cbuf[]=new char[6];	
			int i;
			get_push.read(cbuf,0,3);				// read the data in buffer
			for(int j=0;j<cbuf.length;j++)
				w.write(cbuf[j]);
			w.flush();
			get_push.unread(cbuf,0,3);				// pushing back to the stream
			while((i=get_push.read())!=-1)	
			{
				System.out.print((char)i);
				w.write((char)i);
			}
			w.flush();
		}
		catch(FileNotFoundException f)	{f.printStackTrace();}
		catch(IOException i)	{i.printStackTrace();}
	
		
	}
}