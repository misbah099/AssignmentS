package com.cognizant.shapes;


import assignments.*;

public class Shapes {
	int numberOfSides;
	void calculateShapeArea(int ns,int sl) {	
		if(ns==1) {
			Circle ob1=new Circle(sl);
			ob1.calculateArea();
		}
		else if(ns==3) {
			Triangle t =new Triangle(sl);
			t.calculateArea();
		}
		else if(ns==4) {
			Square s =new Square(sl);
			s.calculateArea();
		}
		else {
		
			System.out.println("No Shapes Present.");
		}
			
	}
	public static void main(String[] args) {
		new Shapes().calculateShapeArea (1,5);
		new Shapes().calculateShapeArea (3,4);
		new Shapes().calculateShapeArea (4,6);
	}
}