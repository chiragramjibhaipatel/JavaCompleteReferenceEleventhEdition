class MethodRefDemo{

	static String stringOp(MyFunc f, String s){
		return f.func(s);
	}	

	public static void main(String [] args){
		System.out.println(stringOp(StringReverse::reverse, "java"));
	}
}

interface MyFunc{
	String func(String s);
}

class StringReverse{
	static String reverse(String s){
		String revString = "";
		for(int i=s.length()-1; i>=0; i--){
			revString += s.charAt(i);
		}
		return revString;
	}
}
