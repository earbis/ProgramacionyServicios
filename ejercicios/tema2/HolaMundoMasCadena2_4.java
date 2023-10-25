package tema2;

public class HolaMundoMasCadena2_4 implements Runnable {
	String cadena;
	
	public HolaMundoMasCadena2_4(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public void run() {
		try {
			Thread.sleep((Thread.currentThread().getId()-14)*500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getId()+"  "+cadena);
		
		
	}

}
