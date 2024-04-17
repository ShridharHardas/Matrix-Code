package DSA;

public class Missing_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7};
		int n=arr.length;
		int sum_of_Natural_num=((n+1)*(n+2))/2;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		int Missing_value=sum_of_Natural_num-sum;
		System.out.println("Missing value is"+ " : "+Missing_value);

	}

}
