public class SpiralMatrix {
	public static void spiral(int ar[][],int row,int col)
	{
		int colstart=0,colend=col-1;
		int rowstart=0,rowend=row-1;
		
		while(colstart<=colend && rowstart<=rowend)
		{
			for(int i=colstart;i<=colend;i++)
			{
				System.out.println(ar[rowstart][i]);
			}
			rowstart=rowstart+1;
			
			for(int i=rowstart;i<=rowend;i++)
			{
				System.out.println(ar[i][colend]);
			}
			colend=colend-1;
			if(rowstart<=rowend)
			{
				for(int i=colend;i>=colstart;i--)
				{
					System.out.println(ar[rowend][i]);
				}
				rowend=rowend-1;
			}
			for(int i=rowend;i>=rowstart;i--)
			{
				System.out.println(ar[i][colstart]);
			}
			colstart=colstart+1;
		}
		
	}

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter no of rows  of matrix");
		int n=sc.nextInt();
		System.out.println("enter no of coloumns of matrix");
		int a=sc.nextInt();
		int arr[][]=new int [n][a];
		System.out.println("enter elements of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<a;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of matrix are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		spiral(arr,n,a);
		sc.close();

	}
}

