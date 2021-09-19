class RowDemo{
	public static void main(String [] args){
		Row<Integer> iOb = new Row<>(3);
		System.out.println("value of iOb = " + iOb.getOb()) ;

		Row oOb = new Row("something");
		System.out.println("value of oOb = " + oOb.getOb());
	}
}

class Row<T>{
	private T ob;
	Row(T o){
		ob = o;
	}
	public T getOb(){
		return ob;	
	}
}
