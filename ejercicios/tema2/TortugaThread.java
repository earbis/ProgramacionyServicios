package tema2;

 public class TortugaThread implements Runnable {

 @Override
 public void run() {
  // TODO Auto-generated method stub
  int i=0;
  System.out.println("arranco la tortuga");
  while(i<5){
   try{
    Thread.sleep(5000);
    System.out.println("soy la tortuga");
   }catch(InterruptedException ex){
   }
   i++;
  }
  System.out.println("termina la tortuga");
 }
}