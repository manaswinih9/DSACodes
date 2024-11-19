// Java program to count frequencies of array items 
import java.util.*;

class Main
{
	static void countFreq(int arr[], int n) 
	{
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++)
		{
			mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
		}
		for (int i = 0; i < n; i++) 
		{
			if (mp.get(arr[i]) != -1) 
			{
				System.out.println(arr[i] + " occurs " + mp.get(arr[i])+" times ");
				mp.put(arr[i], -1);
			}
		}
	}
	public static void main(String[] args) 
	{   
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
		int len = arr.length;
		countFreq(arr, len);
	}
}

