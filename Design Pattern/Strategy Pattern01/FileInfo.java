import java.util.Date;

public class FileInfo {
	private String name;
	private String type;
	private int size;
	private Date modifiedDate;
	public Sorter sorting;		// Sorting 방식을 결정
	
	public FileInfo(String name,String type,int size, String modifiedDate)
	{
		this.name = name;
		this.type = type;
		this.size = size;
		this.modifiedDate = MyDate.creMyDate(modifiedDate);
	}
	
	public String getName() { return name; }
	public String getType() { return type; }
	public int getSize() { return size;}
	public Date getModifiedDate() { return modifiedDate; }
	public void setSorter(Sorter sorting) { this.sorting = sorting;}
	
	public String toString()
	{
		String str = "name : " + getName() + "\ntype : " + getType() + "\nsize : " + getSize() + 
			   "\nmodifiedDate : " + getModifiedDate() + "\n";
		System.out.println(str);
		return str;
	}
	
}
