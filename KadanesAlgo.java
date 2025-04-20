
import java.util.*;

public class KadanesAlgo {
	static public int subArrMax(int arr[])
	{
		int sum=0;
		int max=0;
		for(int x:arr)
		{
		    if(x>=sum+x)
		    {
		    	sum=x;
		    	max=Math.max( max,sum);
		    }
		    else
		    {
		    	sum=sum+x;
		    	max=Math.max(max, sum);
		    	
		    }
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {2,-5,6,6,6,-4,-6,6,5,-9,9};
		//int n=arr.length-1;
		int a=subArrMax(arr);
		System.out.println(a);
		

	}

}