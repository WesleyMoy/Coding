package Chapter2;

public class SingleLinkedListV {

	private NodeV head;
	private int size;
	
	public SingleLinkedListV()
	{
		head = null;
		size = 0;
	}
	
	public NodeV getHead()
	{
		return head;
	}
	
	public void insertNodeVAtHead(int data)
	{
		NodeV newNode = new NodeV(data);
		if(head == null)
			head = newNode;
		else
		{
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}
	
	public void insertNodeAtTail(int data)
	{
		if(head == null)
			head = new NodeV(data);
		else
		{
			NodeV newNode = new NodeV(data);
			NodeV temp = head;
			while(temp.getNext() != null)
			{
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}
	
	public void deleteNodeAtHead()
	{
		if(head != null)
			head = head.getNext();
	}
	
	public void deleteNodeAtTail()
	{
		if(head == null || head.getNext() == null)
			head = null;
		else
		{
			NodeV temp = head;
			while(temp.getNext() != null)
			{
				if(temp.getNext().getNext() == null)
					temp.setNext(null);
				else	
					temp = temp.getNext();
			}
			
		}
	}
	
	public void deleteRandomNodeV(int data)
	{
		NodeV temp = head;
		NodeV previousNode = null;
		if(temp.getData() == data)
		{
			head = null;
		}
		else
		{
			while(temp.getNext() != null)
			{
				if(temp.getData() == data)
				{
					previousNode.setNext(temp.getNext());
					break;
				}
				previousNode = temp;
				temp = temp.getNext();
			}
		}
	}
	
	public void printout()
	{
		NodeV temp = head;
		while(temp.getNext() != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
}
