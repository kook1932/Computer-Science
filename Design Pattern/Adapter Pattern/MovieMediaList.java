import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MovieMediaList {
    ArrayList<MovieMedia> list;
    MovieMedia movieMedia;
    BufferedReader reader;
    int idx;  // 추가

    MovieMediaList() {
        list = new ArrayList<MovieMedia>();
    }

    void add(MovieMedia o) {
        list.add(o);
    }

    void load(String fileName) {
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String s = reader.readLine();
            int nums = Integer.parseInt(s);
            for (int i = 0; i < nums; i++) {
                MovieMedia movieMedia = new MovieMedia();
                readMediaDatum(movieMedia);
                list.add(movieMedia);
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error: reading the media file");
            e.printStackTrace();
        }
    }
    
    public void print(int index) // 추가
    {
    	System.out.println(list.get(index));
    }
    
    public int find(String title) // 추가
    {
    	int i=0;
    	for(MovieMedia m : list)
    	{
    		if(m.getKoreanTitle().equals(title)) {
    			return i;
    		}
    		i++;
    	}
    	return -1;
    }
    
    public void printAll() {
        for (MovieMedia m : list) {
            System.out.println(m);
        }
    }
    
    private void readMediaDatum(MovieMedia mm) {
        try {
            mm.setType(reader.readLine());
            mm.setTitle(reader.readLine());
            mm.setKoreanTitle(reader.readLine());
            mm.setDirector(reader.readLine());
            mm.setActors(reader.readLine());
            String s = reader.readLine();
            mm.setYear(Integer.parseInt(s));
            mm.setSubtitle(reader.readLine());
            mm.setFileName(reader.readLine());
            mm.setResolution(reader.readLine());
        }
        catch (IOException e) {
            System.out.println("Error: reading the media file");
            e.printStackTrace();
        }
    }
}
