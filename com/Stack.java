package com;

import java.util.Scanner;

public class Stack {
	static int [] stack;
	static int top;  // at starting top is always pointing to -1.

	static void createStack(int size) {
		stack=new int[size];
		top=-1;
		System.out.println("Stack has created successfully with size "+ size);
	}
	static void push(int ele) {
		if(top==stack.length-1){
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			stack[top]=ele;
			System.out.println(ele+" Has Inserted Successfully...!");
		}
	}
	static void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow...!");
		}
		else {
			System.out.println("Element "+ stack[top]+" Reinitialized to zero(0) Successfully...!");
			stack[top]=0;
			top--;

			for(int ele:stack) {
				System.out.println(ele);
			}
		}
	}

	static boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}

	static boolean isFull() {
		if(top==stack.length-1) {
			return true;
		}
		return false;
	}
	static void display() {
		if(isEmpty()) {
			System.out.println("Stack Is Empty...!");
		}
		else {
			System.out.println("Stack Elements");
			for(int i=top-1;i>=0;i--) {
				System.out.println(stack[i]);
			}
		}
	}

	static void clear() {
		top=-1;
		System.out.println("All Elements Deleted...!");
	}

	public static void main(String[] args) {
//		createStack(5);
//		push(10);
//		push(20);
//		push(30);
//		push(40);
//		push(50);
//		push(60);
//		display();
//		System.out.println(isFull());
//		System.out.println(isEmpty());
//		pop();
//		pop();
//		pop();
//		pop();
//		pop();
//		pop();
//		System.out.println(isEmpty());
//		System.out.println(isFull());
//
//		System.out.println("");

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcom To Stack DataStructure.");
		while(true) {
			System.out.println("----MENU----");
			System.out.println("1. Create Stack\n2. Push\n3. Pop\n4. Display\n5. isEmpty\n6. isFull\n7. Clear\n8. Exit");
			System.out.println("Enter the Choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("----Stack Creation----");
				System.out.println("Enter The Size: ");
				int size=sc.nextInt();
				createStack(size);
				break;
			case 2:
				System.out.println("Enter The Element: ");
				int ele=sc.nextInt();
				push(ele);
				break;
			case 3:
				System.out.println("----Pop----");
				pop();
				break;
			case 4:
				System.out.println("----Display----");
				display();
				break;
			case 5:
				boolean ans=isEmpty();
				if(ans==true) {
					System.out.println("Stack Is Empty");
				}
				else {
					System.out.println("Stack Is Not Empty");
				}
				break;
			case 6:
				boolean ans1=isFull();
				if(ans1==true) {
					System.out.println("Stack Is Full");
				}
				else {
					System.out.println("Stack Is Not Full");
				}
				break;
			case 7:
				clear();
				break;
			case 8:
				System.out.println("Thank You Visit Again...!");
				System.exit(0);
				break;
			default:
				System.out.println("Enter The Valid Choice...! ");
			}
		}



	}

}
