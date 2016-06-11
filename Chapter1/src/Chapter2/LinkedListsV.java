package Chapter2;

import java.util.HashMap;

public class LinkedListsV {

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
	
}
