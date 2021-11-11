
public class Traversing2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26},{27,28,29,30}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
