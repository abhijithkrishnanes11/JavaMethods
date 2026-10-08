package methods;

public class MethodsTypes {

	public static void main(String[] args) {
		
	MethodsTypes obj = new MethodsTypes();
	obj.addNumbers();
	int subres=obj.subtractNumbers();
	System.out.println("result of subtraction :"+subres);
    obj.multipleNumbers(15,3);
    double divres=obj.divideNumber(14,2);
	System.out.println("result of division :"+divres);
    
    
	}	
	//without return type without parameter
	//addition
	
	public void addNumbers()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("result of addition :"+c);	
	}
	
	//with return type without parameter
	//subtraction
	
	public int subtractNumbers()
	{
		int a=40,b=20,c;
		c=a-b;
		return c;
	}
	
	//without return type with parameter
	//multiplication
	
	public void multipleNumbers(int a,int b)
	{
		int c =a*b;
		System.out.println("result of multiplication :"+c);
	}
	
	//with return type with parameter
    //division
	
	public double divideNumber(double a,double b)
	{
		double c=a/b;
		return c;
	}
	
	

}
