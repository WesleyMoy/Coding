package Chapter2;

public class NodeV {
	private NodeV next;
	private int data;
	
	public NodeV(int data)
	{
		this.data = data;
		next = null;
	}
	
	public void setNext(NodeV next)
	{
		this.next = next;
	}
	
	public NodeV getNext()
	{
		return next;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	
}
