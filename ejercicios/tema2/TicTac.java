package tema2;
public class TicTac extends Thread {
	public static void main(String[] args) {
		Tic hiloTic= new Tic();
		Tac hiloTac= new Tac();
		
		hiloTic.start();
		hiloTac.start();
	}

}
