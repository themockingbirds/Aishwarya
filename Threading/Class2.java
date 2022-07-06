//2nd : creating a thread by implementing runnable interface
class Class2 {
    public static void main(String[] args) {
        System.out.println("Know your current thread: " + Thread.currentThread());
        System.out.println("Name of your current thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("HelloWorld");
        System.out.println("Name of your current thread: " + Thread.currentThread().getName());
        System.out.println("Is current thread alive: " + Thread.currentThread().isAlive());
        System.out.println("Total Active Thread: " + Thread.activeCount());

        MyThread2 th2 = new MyThread2();
        Thread th2_thread = new Thread(th2); //2nd approach
        th2_thread.start();
    }
}

class MyThread2 implements Runnable { //2nd approach
    @Override
    public void run() {
        System.out.println("\n+===========================+\n");
        System.out.println("Class MyThread2:-running---");
        System.out.println("Know your current thread: " + Thread.currentThread());
        System.out.println("Name of your current thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread2");
        System.out.println("Name of your current thread: " + Thread.currentThread().getName());
        System.out.println("Is current thread alive: " + Thread.currentThread().isAlive());
        System.out.println("Total Active Thread: " + Thread.activeCount());
        display();
    }

    public void display() {
        System.out.println("Class MyThread2 Runnable:-display---");
        System.out.println("Know your current thread: " + Thread.currentThread());
        System.out.println("Name of your current thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("MyThread2");
        System.out.println("Name of your current thread: " + Thread.currentThread().getName());
        System.out.println("Is current thread alive: " + Thread.currentThread().isAlive());
        System.out.println("Total Active Thread: " + Thread.activeCount());
    }
}