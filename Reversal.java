package DSA;

public class Reversal {

	public static void main(String[] args) {
		int arr[]= {12,56,90,87,56,34};
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			if(arr[i]!=arr[n-i-1])
			{
				int temp=arr[i];
				arr[i]=arr[n-i-1];
				arr[n-i-1]=temp;
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
