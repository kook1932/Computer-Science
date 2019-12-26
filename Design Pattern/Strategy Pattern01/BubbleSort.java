public class BubbleSort implements Sorter
{
	public void sort(FileInfo[] fi, String sortingBase)
	{
		for(int i=0;i<fi.length-1;i++)
		{
			for(int j=0;j<fi.length-1;j++)
			{
				switch(sortingBase)		// Sorting 기준이 무엇이냐에 따라 Swap 방식이 달라짐
				{
					case "size":		// Sorting 기준이 size인 경우 정렬
						if(fi[j].getSize() > fi[j+1].getSize())
							{
								FileInfo temp = fi[j];
								fi[j] = fi[j+1];
								fi[j+1] = temp;
							}
						break;
						
					case "name":		// name기준으로 정렬
						if((fi[j].getName()).compareTo(fi[j+1].getName())>0)
						{
							FileInfo temp = fi[j];
							fi[j] = fi[j+1];
							fi[j+1] = temp;
						}
						break;	

					case "type":		// type기준으로 정렬
						if((fi[j].getType()).compareTo(fi[j+1].getType())>0)
						{
							FileInfo temp = fi[j];
							fi[j] = fi[j+1];
							fi[j+1] = temp;
						}
						break;
						
					case "date":		// date기준으로 정렬
						if((fi[j].getModifiedDate()).compareTo(fi[j+1].getModifiedDate())>0)
						{
							FileInfo temp = fi[j];
							fi[j] = fi[j+1];
							fi[j+1] = temp;
						}
						break;
						
					default:
						System.out.println("잘못된 정렬 기준 입니다. 다시 입력하세요.");			
							
				}
			}
		}
		
		// FileInfo 출력
		for(int i=0;i<fi.length;i++)
			fi[i].toString();
	}
}
