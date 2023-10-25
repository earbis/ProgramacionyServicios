package tema2;
public class Tic extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("Tic");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
