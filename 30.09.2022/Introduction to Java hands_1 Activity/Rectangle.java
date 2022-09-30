package com.cognizant.shapes;

public class Rectangle {
int length;
int breadth;
Rectangle(int length,int breadth){
this.length=length;
this.breadth=breadth;
}
void calculateArea() {
	double area=this.length*this.breadth;
	System.out.println("The area of rectangle using the formula length*breadth="+area);
}}
