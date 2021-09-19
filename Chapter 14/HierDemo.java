class HierDemo{
	public static void main(String[] args){
		Gen2<Integer> iOb = new Gen2<>(3);	
		iOb.showValue();	
	}
}

class Gen{
	int val;
	Gen(int v){
		val = v;
	}
	Gen(){}
}
class Gen2<T> extends Gen{
	T ob;
	Gen2(T o){
		ob = o;
	}
	void showValue(){
		System.out.println("Value of ob is: " + ob);
	}
}
