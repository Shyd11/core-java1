package nit.com;

public class A01 {
	void m1() {
		int a = 10;
		int b = 20;
		
		int c = a + b;
		System.out.println(a+b);
		
		System.out.println(c+c);
	}
	void m2()
	{
		System.out.println("method calling");
		A01 obj2 = new A01();
		System.out.println(50);
		obj2.m1();
	}
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("java is awsome");
		A01 obj2 = new A01();
		obj2.m2();
		System.out.println("end");
	}

}
