abstract class Shape{
	int d1,d2;
	void print()
	{
		System.out.println("i am in shape");
	}
	abstract void area();
}
class circle extends Shape
{
	void area()
	{
		System.out.println(3.14*d1*d1);
	}
}
class demo
{
	public static void main(String a[])
	{
		circle c=new circle();
		c.d1=8;
		c.area();
	}
}

