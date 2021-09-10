import java.io.*;

public class ShowFile{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: java ShowFile <filename>");
			return;
		}
		FileInputStream fin = null;
		try{
			fin = new FileInputStream(args[0]);
		
			int i;
		
			do{
				i = fin.read();
				if(i != -1) System.out.println((char)i);	
			}while(i != -1);
		} catch (FileNotFoundException e){
			System.out.println("File Not Found");
		} catch(IOException e){
			System.out.println("Can't read file");
		}finally{
			try{
				if(null != fin) fin.close();
			}catch(IOException e){
				System.out.println("Error closing the file");
			}
		}
	}
}
