public class SelectionSort implements Sorter{
	public void sort(FileInfo[] fi, String sortingBase)
	{
		for(int i=0;i<fi.length-1;i++)
		{
			int minIdx = i;
			for(int j=i+1;j<fi.length;j++)
			{
				switch(sortingBase)		// Sorting 기준이 무엇이냐에 따라 Swap 방식이 달라짐
				{
					case "size":		// Sorting 기준이 size인 경우 정렬
						if(fi[j].getSize() < fi[minIdx].getSize())
							minIdx = j;
						break;
						
					case "name":		// name기준으로 정렬
						if((fi[j].getName()).compareTo(fi[minIdx].getName()) < 0)
							minIdx = j;
						break;	

					case "type":		// type기준으로 정렬
						if((fi[j].getType()).compareTo(fi[minIdx].getType()) < 0)
							minIdx = j;
						break;
						
					case "date":		// date기준으로 정렬
						if((fi[j].getModifiedDate()).compareTo(fi[minIdx].getModifiedDate()) < 0)
							minIdx = j;
						break;
						
					default:
						System.out.println("잘못된 정렬 기준 입니다. 다시 입력하세요.");			
							
				}
			}
			FileInfo temp = fi[minIdx];
			fi[minIdx] = fi[i];
			fi[i] = temp;
		}
		
		// FileInfo 출력
		for(int i=0;i<fi.length;i++)
			fi[i].toString();
	}
}
