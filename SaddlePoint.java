import java.util.*;
public class SaddlePoint {
	public static void saddlepoint(int a[][],int s)
	{
		for(int i=0;i<s;i++)
		{
			boolean flag=false;
			int min_row=a[i][0],c_index=0;
			for(int j=1;j<s;j++)
			{
				if(min_row>a[i][j])
				{
					min_row=a[i][j];
					c_index=j;
				}
				//System.out.println(min_row);
			}
			for(int k=1;k<s;k++)
			{
				if(min_row>a[k][c_index])
				{
					flag=true;	
				}
			}
			if(flag==true)
			{
				System.out.println("matrix have saddle point");
				System.out.println(min_row);
			}
			else
			{
				System.out.println("matrix does not have saddle point");
			}
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows and coloumns of square matrix");
		int n=sc.nextInt();
		int arr[][]=new int [n][n];
		System.out.println("enter elements of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of matrix are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		saddlepoint(arr,n);
		sc.close();

	}

}
