
//yield() -> give pass for waiting thread of same priority.
//what happen if there are thread with high priority..or with low
class Class7 {
    public static void main(String[] args) {
        MyThread7 myThread7 = new MyThread7();
        Thread mth7 = new Thread(myThread7);
        System.out.println("Hello MAIN...");
        mth7.start();
        MyThread7_1 myThread7_1 = new MyThread7_1();
        Thread mth71 = new Thread(myThread7_1);
        mth71.start();
        //mth71.setPriority(7); //case 1
        //mth71.setPriority(1); //case 2

    }
}

class MyThread7 implements Runnable {
    @Override
    public void run() {
        //System.out.println("");
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello....T8: "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.yield();
        }
    }
}

class MyThread7_1 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread9: "+Thread.currentThread());
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello....T9: "+i);
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
