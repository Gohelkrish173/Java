/*Define a class A in package apack. In class A, three variables are defined
of access modifiers protected, private and public. Define class B in package bpack which extends 
A and write display method which accesses variables of class A. Define class C in package cpack which has one method display() in that create one object of class A and 
display its variables. Define class ProtectedDemo in package dpack in which write main () method. Create objects of class B and C and class display method for both these 
objects.*/

package bpack;
import apack.*;

public class B extends A{
	public void display(){
		String n1=x1;
		String n3=x3;

		System.out.println("n -1:"+n1);
		System.out.println("n -3:"+n3);
	}
}