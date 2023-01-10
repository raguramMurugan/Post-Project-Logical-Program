package logicalProgram;

public class Duplicate
{
	public static void main(String[] args)
	{
		int[] a={1,1,2,2,3,3,4,5,6,6,7,7,8};
		int length=a.length;
		int j=0;
		int [] temp=new int[a.length];
		
		for(int i=0; i< length-1; i++) //i=0, i=1, i=2, i=3
		{
			if(a[i]!=a[i+1]) //1!=1--> Fails, 1!=2-->True, 2!=2--> Fails, 2!=3-->True
			{
				temp[j]=a[i]; //Failed, temp=1, Failed, temp=3 
				j++; // Failed, j=1, Failed, j=2
			}
			temp[j]=a[length-1];
		}
		
		for(int k=0; k<j;k++)
		{
			System.out.print(temp[k]+" ");
		}
	}
}
