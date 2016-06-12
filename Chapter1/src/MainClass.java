import Chapter1.ArrayAndStringV;
import Chapter2.LinkedListsV;
import Chapter2.NodeV;
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
		
		/* ------------------- Chapter 2 ----------------------*/
		
		/*
		//Problem 1 Test
		SingleLinkedListV test = new SingleLinkedListV();
		test.insertNodeAtTail(1);
		test.insertNodeAtTail(2);
		test.insertNodeVAtHead(0);
		test.insertNodeAtTail(2);
		test.insertNodeAtTail(1);
		test.insertNodeAtTail(3);
		test.insertNodeAtTail(4);
		test.printout();
		
		System.out.println();
		
		LinkedListsV temp = new LinkedListsV();
		temp.removeDuplicates(test);
		test.printout();
		*/
		
		//Problem 5 a
		/*
		SingleLinkedListV test1 = new SingleLinkedListV();
		test1.insertNodeAtTail(1);
		test1.insertNodeAtTail(1);
		test1.insertNodeAtTail(1);
		test1.insertNodeAtTail(1);
		
		SingleLinkedListV test2 = new SingleLinkedListV();
		test2.insertNodeAtTail(2);
		test2.insertNodeAtTail(2);
		test2.insertNodeAtTail(2);
		
		LinkedListsV temp = new LinkedListsV();
		SingleLinkedListV test3 = temp.sumLinkedList(test1, test2);
		test3.printout();
		*/
		
		//Problem 5 b
		/*
		SingleLinkedListV test1 = new SingleLinkedListV();
		test1.insertNodeAtTail(3);
		test1.insertNodeAtTail(1);
		test1.insertNodeAtTail(4);
		test1.insertNodeAtTail(1);
		
		SingleLinkedListV test2 = new SingleLinkedListV();
		test2.insertNodeAtTail(2);
		test2.insertNodeAtTail(2);
		test2.insertNodeAtTail(2);
		
		LinkedListsV temp = new LinkedListsV();
		SingleLinkedListV test3 = temp.sumLinkedList1(test1, test2);
		test3.printout();
		*/
		
		//Problem 6
		
		SingleLinkedListV test1 = new SingleLinkedListV();
		test1.insertNodeAtTail(1);
		test1.insertNodeAtTail(2);
		test1.insertNodeAtTail(3);
		test1.circular(4);
		//test1.printCircular();
		LinkedListsV temp = new LinkedListsV();
		NodeV result = temp.detectCircular(test1);
		System.out.println(result.getData());
	}

}
