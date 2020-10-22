public class MylinkedList<E> {

	 static class Node<E>
	{
		 E data=null;
		 Node<E> next=null;
		public Node(E data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	 
	 Node<E> head;
	 //===============================================================
	 void add(E data)
	 {
		 Node<E> toadd=new Node<E>(data);
		 Node<E> temp=head;
		 if(temp==null)
		 {
			 head=toadd;
			 return;
		 }
		 while(temp.next!=null)
		 {
			 temp=temp.next;
		 }
		 temp.next=toadd;
	 }
	 //================================================================
	 void add(int pos, E data)
	 {
		 Node<E> toadd=new Node<E>(data);
		 Node<E> temp=head;
		 if(temp==null||pos>size())
		 {
			 System.out.println("Position does not exist");
			 return;
		 }
		 for(int i=0;(i+1)<pos;i++)
			{
				temp=temp.next;
			}
		 toadd.next=temp.next;
		 temp.next=toadd;
	 }
	//=================================================================
	 
	boolean isEmpty()
	{
		if(head== null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//====================================================================
	
	void print()
	{
		Node<E> temp=head;
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	//====================================================================
	void print(int pos)
	{
		Node<E> temp=head;
		if(head==null)
		{
			System.out.println("List empty");
			return;
		}
		else if(pos>size())
		{
			System.out.println("Position does mpt exist");
			return;
		}
		for(int i=0;(i+1)<pos;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.next.data);
	}
	//====================================================================
	void remove(int pos)
	{
		Node<E>temp=head;
		if(pos==0)
		{
			head=temp.next;
			return;
		}
		if(pos<size())
		{
			for(int i=0;(i+1)<pos;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		else if(pos+1==size())
		{
			for(int i=0;(i+1)<pos;i++)
			{
				temp=temp.next;
			}
			temp.next=null;
		}
	}
	//====================================================================
	int size()
	{
		Node<E>temp=head;
		int i=0;
		while(temp!=null)
		{
			temp=temp.next;
			i++;
		}
		return i;
	}
	//====================================================================
	E get(int pos)
	{
		Node<E> temp=head;
		if(head==null)
		{
			System.out.println("List empty");
			return null;
		}
		else if(pos>size())
		{
			System.out.println("Position does mpt exist");
			return null;
		}
		else
		{
			if(pos==0) return temp.data;
			for(int i=0;(i+1)<pos;i++)
			{
				temp=temp.next;
			}
			return(temp.next.data);
		}
	}
	//====================================================================
}
