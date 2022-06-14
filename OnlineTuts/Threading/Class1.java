//1st : creating a thread by extending Thread class
class Class1 {
    public static void main(String[] args) {
        System.out.println("Know your current thread: "+Thread.currentThread());
        System.out.println("Name of your current thread: "+Thread.currentThread().getName());
        Thread.currentThread().setName("Ujjawal");
        System.out.println("Name of your current thread: "+Thread.currentThread().getName());
        System.out.println("Is current thread alive: "+Thread.currentThread().isAlive());
        System.out.println("Total Active Thread: "+Thread.activeCount());
        MyThread1 th1=new MyThread1();
        th1.start();
       // MyThread2 th2=new MyThread2();
      //  Thread th2_thread=new Thread(th2);
       // th2_thread.start();

    }
}

class MyThread1 extends Thread{ //1st approach
    @Override
    public void run(){
        System.out.println("\n+===========================+\n");
        System.out.println("Class MyThread1:-running---");
        System.out.println("Know your current thread: "+Thread.currentThread());
        System.out.println("Name of your current thread: "+Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread1");
        System.out.println("Name of your current thread: "+Thread.currentThread().getName());
        System.out.println("Is current thread alive: "+Thread.currentThread().isAlive());
        System.out.println("Total Active Thread: "+Thread.activeCount());
       display();
    }
    public void display(){
        System.out.println("Class MyThread1:-display---");
        System.out.println("Know your current thread: "+Thread.currentThread());
        System.out.println("Name of your current thread: "+Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread1");
        System.out.println("Name of your current thread: "+Thread.currentThread().getName());
        System.out.println("Is current thread alive: "+Thread.currentThread().isAlive());
        System.out.println("Total Active Thread: "+Thread.activeCount());
    }
}