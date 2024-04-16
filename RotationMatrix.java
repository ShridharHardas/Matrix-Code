package DSA;

public class RotationMatrix {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		//Tranpose matrix 2D array
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for( int j=i;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
		}
		//Swapping Column of a Matrix 
		for(int i=0;i<n;i++)
		{
			int li=0;
			int ri=n-1;
			while(li<ri)
			{
				int temp=arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=temp;
				li++;
				ri--;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}

	}

}
