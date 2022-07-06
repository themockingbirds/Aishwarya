//case 2 :with threading
class Class5 {
    public static void main(String[] args) {
        Class5 cs5 = new Class5();
        MyThread5 myThread5 = new MyThread5();
        Thread mth5= new Thread(myThread5);
        mth5.start();
        cs5.display();
    }
    public void display(){
        for(int i=0;i<40;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello  ...MAIN: "+i);
        }
    }
}

class MyThread5 implements Runnable{
    public void run() { //normal method
        for(int i=0;i<40;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello  ...T5: "+i);
        }
    }
}