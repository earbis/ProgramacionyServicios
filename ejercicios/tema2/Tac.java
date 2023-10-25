package tema2;
public class Tac extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Tac");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
