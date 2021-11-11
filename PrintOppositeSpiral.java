
public class PrintOppositeSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int top=0,bottom=3,left=0,right=3,direction=0;
		
		while(top<=bottom && left<=right)
		{
			if(direction==0)
			{
				for(int i=top;i<=bottom;i++)
				{
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
			else if(direction ==1)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(arr[bottom][i]+" ");
				}
				bottom--;
				
			}
			else if(direction ==2)
			{
				for(int i=bottom;i>=top;i--)
				{
					System.out.print(arr[i][right]+" ");
				}
				right--;
			}
			else if(direction == 3)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(arr[top][i]+" ");
				}
				top++;
			}
			
			direction =(direction+1)%4;
		}
		
	}

}
