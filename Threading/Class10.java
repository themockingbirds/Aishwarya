import java.io.IOException;
import java.util.Scanner;

//Single Tasking using a Thread
class Class10 {

    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        MyThread11 mt11=new MyThread11();
        Thread th11=new Thread(mt11);
        th11.start();
    }

}
class MyThread11 implements Runnable{
    boolean stop=false;
    @Override
    public void run(){
        task1();
        task2();
        task3();
    }

    private void task3() {
        for (int i = 1;i<=10;i++) {
            System.out.println("Task 3: " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }

    private void task2() {
        for (int i = 1;i<=10;i++) {
            System.out.println("Task 2: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void task1() {
        for (int i = 1;i<=10;i++) {
            System.out.println("Task 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }


}
