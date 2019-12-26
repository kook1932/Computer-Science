public class FileMain {

	public static void main(String[] args) {
		
		FileInfo[] fi = new FileInfo[4];	// FileInfo 4�� ����
		fi[0] = new FileInfo("BubbleSort","java",4,"2016-05-23T21:59:00");
		fi[1] = new FileInfo("SelectionSort","txt",1,"2015-01-16T21:59:00");
		fi[2] = new FileInfo("QuickSort","cpp",3,"2019-02-02T21:59:00");
		fi[3] = new FileInfo("InsertSort","pi",2,"2018-09-01T21:59:00");
		
		System.out.println("<���� ����Ʈ>");
		for(int i=0;i<fi.length;i++)
			fi[i].toString();
		
		System.out.println("<< ���� ������ : size, type, name, date �� �ϳ��� ����! >>\n");
		
		// BubbleSort Algorithm
		fi[0].setSorter(new BubbleSort());	// FileInfo �迭 �� 1�� FileInfo ��ü��
		System.out.println("<size�� ����>");	// sorter�� �����ؼ� ���� �˰������� ����
		fi[0].sorting.sort(fi, "size");
		
		fi[0].setSorter(new BubbleSort());
		System.out.println("<name���� ����>");
		fi[0].sorting.sort(fi, "name");
		
		// SelectionSort Algorithm
		fi[0].setSorter(new SelectionSort());
		System.out.println("<type���� ����>");
		fi[0].sorting.sort(fi, "type");
		
		fi[0].setSorter(new SelectionSort());
		System.out.println("<date�� ����>");
		fi[0].sorting.sort(fi, "date");
		
	}

}