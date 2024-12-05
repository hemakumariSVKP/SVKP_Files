package org.tnsif.capgemini.c2tc.collections;

//import java.util.List;
import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack=new Stack<Integer>();
		
		//Push operation :add the elements
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		//Display the stack 
		
		System.out.println("stack after pushes "+stack);
		
		//top element viewing without removing it 
		System.out.println("Top element "+ stack.peek());
		
		//pop operation to remove an element
		System.out.println("POP operation "+stack.pop());
		System.out.println(stack);
		
		//Checking if stack is empty
		System.out.println("Stack is empty "+stack.isEmpty());
		
		//Search
		int position =stack.search(2);
		if(position !=-1)
		{
			System.out.println("Element found in "+position+" Index position");
		}
		else
		{
			System.out.println("Element not Found "+position);
		}
	}

}
