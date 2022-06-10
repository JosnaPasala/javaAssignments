package calsi111;
class Calculator1 {
  static int powerInt(int num1,int num2)
  {
	return (int)Math.pow(num1, num2);
  }
	static double powerDouble(double num1,double num2)
	{
	 return Math.pow(num1, num2);
  }
}
public class Calculator{
	public static void main(String[] args) {
	Calculator1 c=new Calculator1();
	System.out.println("the value of 2 power 3 is:" +c.powerInt(2, 3));
	System.out.println("the value of 3 power 4 is:" +c.powerInt(3, 4));
	
}
}