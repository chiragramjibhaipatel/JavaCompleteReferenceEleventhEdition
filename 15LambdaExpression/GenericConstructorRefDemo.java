class ConstructorRefDemo{

	static <R, T> R myOp(MyFunc<R, T> f, T v){
		return f.func(v);
	}

	public static void main(String [] args){

		MyFunc<MyClass<Integer>, Integer> f = MyClass::new;
		MyClass myClass = myOp(f, 4);
		System.out.println(myClass.getVal());

	}
}

interface MyFunc<R, T>{
	R func(T v);
}

class MyClass<T>{
	T val;
	MyClass(T v){
		val = v;
	}
	T getVal(){
		return val;
	}
}
