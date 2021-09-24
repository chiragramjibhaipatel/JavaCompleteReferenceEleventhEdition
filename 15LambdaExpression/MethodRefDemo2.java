class MethodRefDemo2{

	static String doThis(StringFunc f, String s){
		return f.func(s);
	}
	public static void main(String [] args){
		StringOperation s = new StringOperation();
		System.out.println(doThis(s::processString, "aaa"));		
	}
}

interface StringFunc{
	String func(String s);
}

class StringOperation{
	String processString(String s){
		return s.toUpperCase();
	}
}
