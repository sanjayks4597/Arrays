
public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				if(i==j)
//				{
//					sum=sum+arr[i][j];
//				}
//			}
//		}
//		System.out.println(sum);
//		int len=0;
//		for(int i=0;i<arr[i].length;i++)
//		{
//			len=arr[i].length;
//		}
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				if(j+i==arr.length-1)
//				{
//					sum=sum+arr[i][j];
//					
//				}
//			}
//
//		}
//		System.out.println(sum);
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i][i];

		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[arr.length-1][arr.length-i-1];
		}
		System.out.println(sum1);
	}

}
