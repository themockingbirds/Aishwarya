import java.io.IOException;
//Terminating theread using our own logic.
class Class14 {
    public static void main(String[] args) throws IOException {
        MyThread14 mth14=new MyThread14();
        Thread th=new Thread(mth14);
        th.start();
        System.in.read();
        System.out.print("Enter Key Pressed...");
        mth14.stop=true;
    }
}
class MyThread14 implements  Runnable{
    public boolean stop;

    @Override
    public void run() {
        for(int i=0; ;i++){
            if(stop)
                return;

            System.out.println("Running .... "+i);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){}
        }
    }
}

