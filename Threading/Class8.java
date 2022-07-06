
//join
class Class8 {
    public static void main(String[] args) {
        System.out.println("Main: " + Thread.currentThread());
        MyThread8 myThread8 = new MyThread8();
        Thread mth8 = new Thread(myThread8);
        MyThread8_1 myThread8_1 = new MyThread8_1();
        Thread mth81 = new Thread(myThread8_1);
        mth8.start();
        mth81.start();
    }
}

class MyThread8 implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 40; i++) {
            System.out.println("Printing Thread8 : "+i+" -> "+Thread.currentThread());
            /*if (i == 10) {
                try {
                    //Thread.currentThread().join();
                } catch (InterruptedException e) {
                    System.out.println("MyThread8: " + e);
                }
            }*/
        }
    }
}

class MyThread8_1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Printing Thread8_1 "+i+"- >" + Thread.currentThread());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("MyThread8_1: " + e);
            }
        }
    }
}