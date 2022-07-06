//Multitasking using one threads at same objects
class Class11 {
    public static void main(String[] args) {
        MyThread12 mth12 = new MyThread12("1","2");
        MyThread12 mth13 = new MyThread12("3","4");
        Thread th12 = new Thread(mth12);
        Thread th13 = new Thread(mth13);
        th12.start();
        th13.start();
    }
}
class MyThread12 implements Runnable{
    String str1;
    String str2;
    MyThread12(String str1,String str2){
        this.str1=str1;
        this.str2=str2;
    }
     @Override
     public void run(){

         task1();
         task2();
     }

    private void task1() {
        for (int i = 0; i < 7; i++) {
            System.out.println(str1);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
            }
        }
    }
    private void task2() {
        for (int i = 0; i < 7; i++) {
            System.out.println(str2);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
            }
        }
    }
}
