package com;

public class BalancedBrackets {
	static char [] stack;
	static int top; 
	static void push(char ele) {
		top ++;
		stack[top]=ele;
	}
	static void pop() {
		top--;
	}
	static boolean balanced(String s) {
		stack= new char[s.length()];
		top = -1;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				push(s.charAt(i));
			}
			else if(s.charAt(i)==')') {
				if(top!=-1 && stack[top]=='(') {
					pop();
				}
			}
		}
		if(top==-1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println(balanced(")("));
		
	}
}
