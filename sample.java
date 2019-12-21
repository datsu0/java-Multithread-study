public class sample{
   public static void main(String[] args){
      //p7
   //   MyThread t = new MyThread();
   //   t.start();
   //   System.out.print("Hello World!!");
   //   for(int i=0;i<10000;i++){
   //      System.out.print("Good!");
   //   }


      //これは、インスタンスはここで生成して.startで別スレッドに入ってる。
      // new PrintThread("Good!").start();
      // new PrintThread("<Nice!>").start();

      //p15
      // new Thread(new Printer("Good!!")).start();
      // new Thread(new Printer("Nice!!")).start();

      //p17
      for(int i=0;i<10;i++){
         System.out.println("Good!");
         try{
            Thread.sleep(1000);
         }catch(InterruptedException e){}
      }

      //p20 synchronized
      

   }
}