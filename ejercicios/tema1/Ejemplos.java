package tema1;
import java.io.IOException;
public class Ejemplos {
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb = new ProcessBuilder("cmd","/k","start", "dir");
		Process p = pb.start();
		
	}
}
