import Chapter1.ArrayAndStringV;
import Chapter2.LinkedListsV;
import Chapter2.SingleLinkedListV;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//------- Problem 5 Test -------------
		/*
		int [][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[0][2] = 1;
		matrix[1][0] = 1;
		matrix[1][1] = 0;
		matrix[1][2] = 0;
		matrix[2][0] = 1;
		matrix[2][1] = 1;
		matrix[2][2] = 1;
		
		System.out.println("Before the optimize");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		ArrayAndStringV temp = new ArrayAndStringV();
		temp.optimizeMatrix(matrix);
		
		System.out.println("After the optimize");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		SingleLinkedListV test = new SingleLinkedListV();
		test.insertNodeAtTail(1);
		test.insertNodeAtTail(2);
		test.insertNodeVAtHead(0);
		test.insertNodeAtTail(1);
		test.printout();
		
		System.out.println();
		
		LinkedListsV temp = new LinkedListsV();
		temp.removeDuplicates(test);
		test.printout();
		
	}

}
