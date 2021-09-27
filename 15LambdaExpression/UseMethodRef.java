import java.util.*;
class UseMethodRef{

	static int compareMC(MyClass a, MyClass b){
		return a.getVal() - b.getVal();
	}

	public static void main(String [] args){
		List<MyClass> mc = new ArrayList<>();
		mc.add(new MyClass(3));
		mc.add(new MyClass(344));
		mc.add(new MyClass(33));
		mc.add(new MyClass(42));
		mc.add(new MyClass(48));
		System.out.println("Max value is:" + Collections.max(mc, UseMethodRef::compareMC).getVal());
	}
}

class MyClass {
	int val;
	MyClass(int v){
		val = v;
	}
	public int getVal(){
		return val;
	}
}
