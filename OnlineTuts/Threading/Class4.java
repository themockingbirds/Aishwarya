//case 1 : without threading...
class Class4 {
    public static void main(String[] args) throws  InterruptedException{
        Class4 cs4 = new Class4();
        MyThread4 mth4 = new MyThread4();

        cs4.run();
        mth4.run();


    }
    public void run() throws InterruptedException{ //normal method
        for(int i=0;i<40;i++){
            Thread.sleep(1000);
            System.out.println("Hello  ...MAIN: "+i);
        }
    }
}

class MyThread4{
    public void run() throws InterruptedException{ //normal method
        for(int i=0;i<40;i++){
            Thread.sleep(1000);
            System.out.println("Hello  ...T4: "+i);
        }
    }
}
