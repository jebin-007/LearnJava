package dataStructures;



class Stack{
	
	int top;
	int size;
	int[] a;
	
	Stack(int s){
		
		top = -1;
		size = s;
		a = new int[s];		
		
	}
	
	public void push(int x) {
		if(top+1 == size) {
			System.out.println("Stack is full");
		
		}
		else {
			a[++top] = x;
		}
	}
	
	public void pop() {
		if(top<0) {
			System.out.println("Stack is empty!");
		}
		else {
			top--;
		}
		
	}
	
	public void display() {
		System.out.println("Stack size is " + (top+1));
		System.out.println("Stack elements are -> ");
		for(int i=0;i<=top;i++) {
			System.out.println(a[i]);
		}
	}
}

public class StackArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack(10);
		myStack.push(20);
		myStack.push(45);
		myStack.push(35);
		myStack.push(15);
		myStack.push(75);
		myStack.display();
		System.out.println("Popping two items from stack");
		myStack.pop();
		myStack.pop();
		myStack.display();

	}

}
