import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface 
{
	String fileName;

	LoadHudDisplays(String filename) 
	{
		this.fileName = filename;
	}

	public ArrayList<String> load() 
	{
		try 
		{
			ArrayList<String> list = new ArrayList<String>();
			BufferedReader Reeded = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

			for (String str = Reeded.readLine(); str != null; str = Reeded.readLine())
				list.add(str);

			return list;
		} 
		catch (Exception excp) 
		{
			excp.printStackTrace();
			return null;
		}
	}
}