class GenericMethodReferenceDemo{
		
	static <T> int  myOp(MyFunc<T> f, T[] vals, T val){
		return f.func(vals, val);
	}

	public static void main(String [] args){
		Integer[] vals = { 1, 2, 3, 4, 3};
		System.out.println(myOp(MyArrayOps::<Integer>countMatch, vals, 3));
	}
}

interface MyFunc<T>{
	int func(T[] vals, T val );
}

class MyArrayOps {
	static <T> int countMatch(T[] vals, T val){
		int count = 0;
		for(int i=0; i<vals.length; i++){
			if(vals[i] == val){
				count++;	
			}
		}
		return count;
	}
}
