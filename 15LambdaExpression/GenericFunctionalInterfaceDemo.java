class GenericFunctionalInterfaceDemo{
	public static void main(String [] args) {
		GenericInterface<Integer> getDouble;
		getDouble = val -> val.doubleValue();

		System.out.println(getDouble.func(33));
	}
}	

interface GenericInterface<T>{
	double func(T t);
}
