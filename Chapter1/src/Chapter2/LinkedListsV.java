package Chapter2;

import java.util.HashMap;

public class LinkedListsV {

	
	//Problem 1 
	//Write code to remove duplicates from an unsorted linked list
	public SingleLinkedListV removeDuplicates(SingleLinkedListV linkedlist)
	{
		HashMap<Integer, Boolean> hashMap = new HashMap();
		if(linkedlist.getSize() <= 1)
			return linkedlist;
		NodeV temp = linkedlist.getHead();
		NodeV previous = null;
		while(temp != null)
		{
			Integer data = temp.getData();
			if(hashMap.containsKey(temp.getData()) == true)
			{
				previous.setNext(temp.getNext());
			}
			else
			{
				hashMap.put(temp.getData(), true);
				previous = temp;
			}
			
			temp = temp.getNext();
		}
		
		return linkedlist;
	}
	
	//Follow up 
	//How would you solve this problem if a temporary buffer is not allowed.
	
	public SingleLinkedListV removeDuplicates1 (SingleLinkedListV linkedList)
	{
		if(linkedList == null)
			return linkedList;
		
		NodeV currentNode = linkedList.getHead();
		while(currentNode != null)
		{
			NodeV temp = currentNode.getNext();
			NodeV previous = currentNode;
			while(temp != null)
			{
				if(currentNode.getData() == temp.getData())
				{
					previous.setNext(temp.getNext());
				}
				else
					previous = temp;
					temp = temp.getNext();	
			}
			currentNode = currentNode.getNext();
		}
		
		return linkedList;
	}
	
	//Problem 2 
	//Implement an algorithm to find the kth element to last of a singly linked list.
	//The problem is not quite clear so I will implement it later
	
	//Problem 3
	//Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
	//Example
	//Input: the node c from linked list a->b->c->d->e
	//Result: nothing is returned but the new lnikedlist look likes a->b->d->e
	
	//If the node is at the end. We cant delete at all
	//Solution: just set data and pointer equal next node
	
	public boolean removeMiddleNodeV (NodeV node)
	{
		if(node == null || node.getNext() == null)
			return false;
		
		NodeV next = node.getNext();
		node.setData(next.getData());
		node.setNext(next.getNext());
			
		return true;
	}
	
	//Problem 4
	//Skip
	
	//Problem 5
	//You have two number represented by a linked list, where each node contains a single digit.
	//The digits are stored in reverse order, such that the 1's digit is at the head of the list. 
	//Write a function that adds the two numbers and returns the sum as a linked list.
	//Example 
	//Input: (7->1->6) + (5->9->2). That is 617 + 295
	//Output: 2->1->9 That is 912
	
	public SingleLinkedListV sumLinkedList(SingleLinkedListV list1, SingleLinkedListV list2)
	{
		SingleLinkedListV result = new SingleLinkedListV();
		NodeV list1NodeV = list1.getHead();
		NodeV list2NodeV = list2.getHead();
		
		if(list1NodeV == null)
			return list2;
		else if(list2NodeV == null)
			return list1;
		else
		{
			int carry = 0;
			while(list1NodeV != null || list2NodeV != null)
			{
				int tempResult = carry;
				if(list1NodeV != null)
				{
					tempResult += list1NodeV.getData();
					list1NodeV = list1NodeV.getNext();
				}
				if(list2NodeV != null)
				{
					tempResult += list2NodeV.getData();
					list2NodeV = list2NodeV.getNext();
				}
				
				int data = tempResult%10;
				result.insertNodeAtTail(data);
				if(tempResult >= 10)
					carry = 1;
				else
					carry = 0;
			}
		}
		return result;
	}
	//Follow up
	//Suppose the digits are stored in forward order. Repeat the above problem
	//Example
	//Input: (6->1->7) + (2->9->5). That is 617 + 295
	//Output: (9->1->2) That is 912.
	
	public SingleLinkedListV sumLinkedList1(SingleLinkedListV list1, SingleLinkedListV list2)
	{
		SingleLinkedListV result = new SingleLinkedListV();
		NodeV list1NodeV = list1.getHead();
		NodeV list2NodeV = list2.getHead();
		
		if(list1NodeV == null)
			return list2;
		else if(list2NodeV == null)
			return list1;
		else
		{
			String firstNumber = "";
			String secondNumber = "";
			while(list1NodeV != null || list2NodeV != null)
			{
				if(list1NodeV != null)
				{
					firstNumber += list1NodeV.getData();
					list1NodeV = list1NodeV.getNext();
				}
				if(list2NodeV != null)
				{
					secondNumber += list2NodeV.getData();
					list2NodeV = list2NodeV.getNext();
				}
			}
			String total = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber) + "";
			for(int i = 0; i < total.length(); i++)
			{
				result.insertNodeAtTail(Integer.parseInt(total.charAt(i)+""));
			}
		}
	
		return result;
	}
	
	//Problem 6
	//Given a circular linked list, implement an algorithm which returns the node at the beginning of the loop.
	//Example
	//Input: A->B->C->D->E->C [the same C as earlier ]
	//Output: C
	
	public NodeV detectCircular(SingleLinkedListV linkedList)
	{
		HashMap <Integer, NodeV>hashMap = new HashMap();
		NodeV temp = linkedList.getHead();
		while(temp != null)
		{
			if(hashMap.containsKey(temp.getData()) == true && hashMap.containsValue(temp.getNext()) == true)
			{
				return temp;
			}
			else
			{
				hashMap.put(temp.getData(), temp);
				temp = temp.getNext();
			}
		}
		
		return null;
	}
	
	//Problem 7
	//Implement a function to check if a linked list is a palindrome.
	
}
