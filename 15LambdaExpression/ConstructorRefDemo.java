class ConstructorRefDemo{
	public static void main(String [] args){

		MyFunc f = MyClass::new;
		MyClass myClass = f.func(34);
		System.out.println(myClass.getVal());

	}
}

interface MyFunc{
	MyClass func(int v);
}

class MyClass{
	int val;
	MyClass(int v){
		val = v;
	}
	int getVal(){
		return val;
	}
}
