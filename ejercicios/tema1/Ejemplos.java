package tema1;
import java.io.IOException;
public class Ejemplos {
	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("cmd","/C","start", "dir");
		ProcessBuilder pb1 = new ProcessBuilder("Notepad");
		try {
			Process p = pb.start();
			System.out.println(pb.command());
			System.out.println(pb.environment());
			Process p1 = pb1.start();
			int a ;
			while(( a = p.getInputStream().read() )!= -1) {
				System.out.println((char)a);}
			System.out.println(p.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
