package tema2;

public class Ejercicio2_2 extends Thread {

	public static void main(String[] args) {
		HiloHola2_2 hola = new HiloHola2_2();
		hola.start();
		HiloHola2_2 hola1 = new HiloHola2_2();
		hola1.start();
		HiloHola2_2 hola2= new HiloHola2_2();
		hola2.start();
		HiloHola2_2 hola3 = new HiloHola2_2();
		hola3.start();
		HiloHola2_2 hola4 = new HiloHola2_2();
		hola4.start();
	}

}
