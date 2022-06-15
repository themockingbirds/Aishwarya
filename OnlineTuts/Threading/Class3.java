//Priority Of Thread
class Class3 {
    public static void main(String[] args) {
        System.out.println("Know your current thread: "+Thread.currentThread());
        System.out.println("Default Priority of "+Thread.currentThread()+" is: "+Thread.currentThread().getPriority());
        //Thread th = new Thread();
      //  System.out.println("Default Priority of "+Thread.currentThread()+" is: "+th.getPriority()); //it  will give the priority Thread class not of main thread.

        //set your  custom  priority 1 to 10
        /*
          1 minimum - Thread.MIN_PRIORITY
          5 normal - Thread.NORM_PRIORITY
          10 highest - Thread.MAX_PRIORITY
          these above are pre-define keyword that help to set priority
          we can  also set priority  between  1-10.
         */

        Thread.currentThread().setPriority(10);//
        System.out.println("Default Priority of "+Thread.currentThread()+" is: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Default Priority of "+Thread.currentThread()+" is: "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(8);
        System.out.println("Now New Priority of "+Thread.currentThread()+" is: "+Thread.currentThread().getPriority());


        //priority of a thread passes by it caller thread.
        //see this ->
        //Thread.currentThread().setPriority(Thread.NORM_PRIORITY); //setting back to its default priority...
        //System.out.println(Thread.currentThread()+" it's priority set to default.");
        //Thread.currentThread().setPriority(7); //setting custom  priority of main  thread
        //System.out.println(Thread.currentThread()+" it's priority set to 7.");
        //MyThread3 mth3 =new MyThread3();
        //Thread th1 = new Thread(mth3);
        //th1.setPriority(3); //setting custom priority for Thread of MyThread3..
        //th1.start();


    }

}
/*
class MyThread3 implements Runnable{
    @Override
    public void run(){
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // we can  also do this in the
        // current thread..
        System.out.println("Hello,  I  am  running...");
        System.out.println("Default Priority of "+Thread.currentThread()+" is: "+Thread.currentThread().getPriority());
    }
}*/