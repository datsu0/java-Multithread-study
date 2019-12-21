public class sample{
   public static void main(String[] args){
     MyThread t = new MyThread();
     t.start();
     System.out.print("Hello World!!");
     for(int i=0;i<10000;i++){
        System.out.print("Good!");
     }
   }
}