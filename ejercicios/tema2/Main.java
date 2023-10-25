package tema2;

 public class Main {
 public static void main (String args[]){
  
  Thread tortuga1 = new Thread(new TortugaThread()); //creación del proceso tortuga1
  Thread liebre1 = new Thread(new LiebreThread()); //creación del proceso liebre1
  
  tortuga1.start();
  //si quisiera asignarle más prioridad tortuga1.setPriority(Thread.MAX_PRIORITY);
  liebre1.start();
  //si quisiera asignarle menos prioridad liebre1.setPriority(Thread.MIN_PRIORITY);
  
 }
}