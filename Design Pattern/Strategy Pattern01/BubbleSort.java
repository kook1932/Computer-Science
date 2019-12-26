public class BubbleSort implements Sorter
{
	public void sort(FileInfo[] fi, String sortingBase)
	{
		for(int i=0;i<fi.length-1;i++)
		{
			for(int j=0;j<fi.length-1;j++)
			{
				switch(sortingBase)		// Sorting ������ �����̳Ŀ� ���� Swap ����� �޶���
				{
					case "size":		// Sorting ������ size�� ��� ����
						if(fi[j].getSize() > fi[j+1].getSize())
							{
								FileInfo temp = fi[j];
								fi[j] = fi[j+1];
								fi[j+1] = temp;
							}
						break;
						
					case "name":		// name�������� ����
						if((fi[j].getName()).compareTo(fi[j+1].getName())>0)
						{
							FileInfo temp = fi[j];
							fi[j] = fi[j+1];
							fi[j+1] = temp;
						}
						break;	

					case "type":		// type�������� ����
						if((fi[j].getType()).compareTo(fi[j+1].getType())>0)
						{
							FileInfo temp = fi[j];
							fi[j] = fi[j+1];
							fi[j+1] = temp;
						}
						break;
						
					case "date":		// date�������� ����
						if((fi[j].getModifiedDate()).compareTo(fi[j+1].getModifiedDate())>0)
						{
							FileInfo temp = fi[j];
							fi[j] = fi[j+1];
							fi[j+1] = temp;
						}
						break;
						
					default:
						System.out.println("�߸��� ���� ���� �Դϴ�. �ٽ� �Է��ϼ���.");			
							
				}
			}
		}
		
		// FileInfo ���
		for(int i=0;i<fi.length;i++)
			fi[i].toString();
	}
}