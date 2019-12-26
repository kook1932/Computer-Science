public class FileMain {

	public static void main(String[] args) {
		
		FileInfo[] fi = new FileInfo[4];	// FileInfo 4개 생성
		fi[0] = new FileInfo("BubbleSort","java",4,"2016-05-23T21:59:00");
		fi[1] = new FileInfo("SelectionSort","txt",1,"2015-01-16T21:59:00");
		fi[2] = new FileInfo("QuickSort","cpp",3,"2019-02-02T21:59:00");
		fi[3] = new FileInfo("InsertSort","pi",2,"2018-09-01T21:59:00");
		
		System.out.println("<원본 리스트>");
		for(int i=0;i<fi.length;i++)
			fi[i].toString();
		
		System.out.println("<< 정렬 기준은 : size, type, name, date 중 하나를 선택! >>\n");
		
		// BubbleSort Algorithm
		fi[0].setSorter(new BubbleSort());	// FileInfo 배열 중 1개 FileInfo 객체의
		System.out.println("<size로 정렬>");	// sorter만 선택해서 정렬 알고리즘을 설정
		fi[0].sorting.sort(fi, "size");
		
		fi[0].setSorter(new BubbleSort());
		System.out.println("<name으로 정렬>");
		fi[0].sorting.sort(fi, "name");
		
		// SelectionSort Algorithm
		fi[0].setSorter(new SelectionSort());
		System.out.println("<type으로 정렬>");
		fi[0].sorting.sort(fi, "type");
		
		fi[0].setSorter(new SelectionSort());
		System.out.println("<date로 정렬>");
		fi[0].sorting.sort(fi, "date");
		
	}

}
