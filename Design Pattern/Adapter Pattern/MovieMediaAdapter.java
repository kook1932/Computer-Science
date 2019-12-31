// MovieMediaManagerFile 인터페이스를 쓰지만 실제로는 MovieMediaList 객체를 사용하고 싶음

public class MovieMediaAdapter implements MovieMediaManager{
	MovieMediaList list;
	String file;
    private boolean loaded = false;
	
	public MovieMediaAdapter(String fileName) {
		list = new MovieMediaList();
		file = fileName;
		load();
	}
	
	@Override
	public void load() {
		list.load(file);
		loaded = true;
	}

	@Override
	public boolean isLoaded() {
		return loaded;
	}

	@Override
	public void print(int index) {
		list.print(index);
	}

	@Override
	public void printAll() {
		list.printAll();
	}

	@Override
	public int find(String str) {
		return list.find(str);
	}

}
