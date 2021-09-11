public class InstanceOf{
	public static void main(String[] args){
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		if(a instanceof A){ System.out.println("a is an instance of A");}
		if(b instanceof B){ System.out.println("b is an instance of B");}
		if(c instanceof C){ System.out.println("c is an instance of C");}
		if(d instanceof D){ System.out.println("d is an instance of D");}
		if(c instanceof A){ System.out.println("c can be casted to A");}
		if(d instanceof A){ System.out.println("d can be casted to A");}
		if(a instanceof C){ System.out.println("a can be casted to C");} else { System.out.println("a can't be casted to C");}

		A ob;
		ob = d;
		System.out.println("on now refers to d");
		if(ob instanceof D){ System.out.println("ob can be casted to D");}
		
		ob = c;
		System.out.println("ob now refer to c");
		if(ob instanceof C){ System.out.println("ob can be casted to C");}

		System.out.println("All objects can be casted to Object");
		if(a instanceof Object){ System.out.println("a can be casted to Object");}
		if(b instanceof Object){ System.out.println("b can be casted to Object");}
		if(c instanceof Object){ System.out.println("c can be casted to Object");}
		if(d instanceof Object){ System.out.println("d can be casted to Object");}
	
	}
}
class A{ int i, j;}
class B{ int i, j;}
class C extends A{ int k;}
class D extends A{ int k;}
