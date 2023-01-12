class LinkedList
{
	public Node head;
	
	LinkedList()
	{
		this.head=head;
	}
	
	public Node insertData(int data)
	{
		if(head==null)
		{
			head=new Node(data);
		}
		else
		{
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
		}
		return head;
	}
	
	public void print()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void middleElement()
	{
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}	
		System.out.println(slow.data);
	}
	
	public static void main(String [] args)
	{
		LinkedList ll=new LinkedList();
		ll.insertData(4);
		ll.insertData(5);
		ll.insertData(7);
		ll.insertData(8);
		ll.insertData(4);
		ll.insertData(8);
		ll.insertData(9);
		
		
		ll.middleElement();
		
		
		
	}
}