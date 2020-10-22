package Datastructures;

public class MyStack<E> {

	private MylinkedList<E> stack=new MylinkedList<>();
	
	void push(E data)
	{
		stack.add(data);
	}
	E pop()
	{
		E ret;
		if(size()==0) return null;
		ret=stack.get(stack.size()-1);
		stack.remove((stack.size()-1));
		return ret;
	}
	E peek()
	{
		return (stack.get((stack.size()-1)));
	}
	
	int size()
	{
		return stack.size();
	}

}
