package com;

import java.util.Stack;

/*Creating an DeclareClass used to Declare stack*/
class DeclareStack {
	private Stack<Integer> stack;

	/*-- Constructor to initialize the stack---*/
	public DeclareStack() {
		stack = new Stack<>();
	}

	/*--- Method to push elements onto the stack---*/
	public void pushElements(int[] elements) {
		for (int element : elements) {
			stack.push(element);
		}
	}

	/*--- Method to pop a specified number of elements from the stack--*/
	public void popElements(int count) {
		for (int i = 0; i < count; i++) {
			if (!stack.isEmpty()) {
				int removedElement = stack.pop();
				System.out.println("Removed element: " + removedElement);
			} else {
				System.out.println("Stack is empty No more elements to remove");
				break;
			}
		}
	}

	/*-- Method to display the elements in the stack--*/
	public void displayStack() {
		System.out.println("Current elements in the stack: " + stack);
	}
}

/*--Class That Perform Operation on stack--*/
public class StackOperation {

	public static void main(String[] args) {
		/*-- Create an object of DeclareStack--*/
		DeclareStack customStack = new DeclareStack();

		/*--Array of elements to be add into the stack--*/
		int[] elementsToAdd = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		/*---Push 10 elements onto the stack---*/
		customStack.pushElements(elementsToAdd);

		System.out.println("Stack before removing elements:");
		customStack.displayStack(); // Display stack before removing elements

		/*--- Remove 4 elements from the stack--*/
		customStack.popElements(4);

		/*----Final Stack After Removing---*/
		System.out.println("Stack after removing elements:");
		customStack.displayStack();
	}
}
