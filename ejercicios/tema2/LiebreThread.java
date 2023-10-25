package tema2;

public class LiebreThread implements Runnable{

 @Override
 public void run() {
  // TODO Auto-generated method stub
  int i=0;
  System.out.println("arranco la liebre");
  while(i<5){
   try{
    Thread.sleep(2000);
    System.out.println("soy la liebre");
   }catch(InterruptedException ex){
   }
   i++;
  }
  System.out.println("termina la liebre");
 }
}