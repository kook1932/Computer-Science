public class SelectionSort implements Sorter{
	public void sort(FileInfo[] fi, String sortingBase)
	{
		for(int i=0;i<fi.length-1;i++)
		{
			int minIdx = i;
			for(int j=i+1;j<fi.length;j++)
			{
				switch(sortingBase)		// Sorting ������ �����̳Ŀ� ���� Swap ����� �޶���
				{
					case "size":		// Sorting ������ size�� ��� ����
						if(fi[j].getSize() < fi[minIdx].getSize())
							minIdx = j;
						break;
						
					case "name":		// name�������� ����
						if((fi[j].getName()).compareTo(fi[minIdx].getName()) < 0)
							minIdx = j;
						break;	

					case "type":		// type�������� ����
						if((fi[j].getType()).compareTo(fi[minIdx].getType()) < 0)
							minIdx = j;
						break;
						
					case "date":		// date�������� ����
						if((fi[j].getModifiedDate()).compareTo(fi[minIdx].getModifiedDate()) < 0)
							minIdx = j;
						break;
						
					default:
						System.out.println("�߸��� ���� ���� �Դϴ�. �ٽ� �Է��ϼ���.");			
							
				}
			}
			FileInfo temp = fi[minIdx];
			fi[minIdx] = fi[i];
			fi[i] = temp;
		}
		
		// FileInfo ���
		for(int i=0;i<fi.length;i++)
			fi[i].toString();
	}
}