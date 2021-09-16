class GenInterfaceDemo{
	public static void main(String [] args){
		MyClass<Integer> iVal = new MyClass<>(new Integer[] {1, 4, 233, 4, 23333, 2, 33});
		System.out.println("Min value in iVal is: " + iVal.min());
		System.out.println("Max value in iVal is: " + iVal.max());
		
	}
}

class MyClass<T extends Comparable<T>> implements GenInterface{
	T[] v;
	public MyClass(T [] val){
		v = val;
	}
	public T min(){
		T min = v[0];
		for(int i=1; i<v.length; i++){
			if(min.compareTo(v[i]) > 0){
				min = v[i];
			}
		}
		return min;
	}
	public T max(){
		T max = v[0];
		for(int i=1; i<v.length; i++){
			if(max.compareTo(v[i]) < 0){
				max = v[i];
			}
		}
		return max;
	}
}

interface GenInterface<T extends Comparable<T>>{
	T min();
	T max();
}
