import java.io.*;

public class ShowFile{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Usage: java ShowFile <filename>");
			return;
		}
		FileInputStream fin;
		try{
			fin = new FileInputStream(args[0]);
		}catch (FileNotFoundException e){
			System.out.println("File Not Found: " + args[0]);
			return;
		}

		int i;
		try{
			do{
				i = fin.read();
				if(i != -1) System.out.println((char)i);	
			}while(i != -1);
		} catch (IOException e){
			System.out.println("Can't read file");
		} finally{
			try{
				fin.close();
			}catch(IOException e){
				System.out.println("Error closing the file");
			}
		}
	}
}
