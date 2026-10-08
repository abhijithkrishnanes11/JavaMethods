package methods;

import java.util.Scanner;

public class Shapesof {

	public static void main(String[] args) {
    
	Scanner sc=new Scanner(System.in);
	Shapesof obj = new Shapesof();
	
	System.out.print("Enter radius :");
	int radius=sc.nextInt();
	obj.areaofCircle(radius);
	System.out.println();
	
	System.out.print("Enter breadth and height :");
	int breadth=sc.nextInt();
	int height=sc.nextInt();
	obj.areaTriangle(breadth,height);
	System.out.println();
	
	obj.areaRectangle();
	obj.areaSquare();

	}

	//area of rectangle
	public void areaRectangle()
	{
		int length=15,breadth=10,area;
		area=length*breadth;
		System.out.println("Area of rectangle : " +area);
	}
	//area of square
	public void areaSquare()
	{
		int side=10,area;
		area=side*side;
		System.out.println("Area of square : " +area);
	}
	//area of circle
	public void areaofCircle(int radius)
	{
		double area = (3.14)*radius*radius;
		System.out.println("Area of circle is :" +area);
	}
	//area of triangle
	public void areaTriangle(int breadth,int height)
	{
		double area = (0.5)*breadth*height;
		System.out.println("Area of traingle is :"+area);
	}
	
}
