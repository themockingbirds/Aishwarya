//Multiple Threads acting on single object - Data Inconstancy
//Unsafe thread...
class Class12 {
    public static void main(String[] args) {
        Reservation r =new Reservation(1);
        Thread th1=new Thread(r);
        Thread th2=new Thread(r);
        th1.setName("FirstPerson");
        th2.setName("SecondPerson");
        th1.start();
        th2.start();

    }
}

class Reservation implements Runnable {
    int toBook;
    int availableBerth=1;
    Reservation(int toBook){
     this.toBook=toBook;
    }
    @Override
    public void run() {
        System.out.println("Available Berth: "+availableBerth);
        if(availableBerth>=toBook){
            String name=Thread.currentThread().getName();
            System.out.println("Berth "+toBook+" is reserved for '"+name+"'");
            //availableBerth=availableBerth-toBook;
            try{
                Thread.sleep(3000);//waiting for printing...
                availableBerth=availableBerth-toBook;
            }catch(InterruptedException e){}

        }
        if(availableBerth<toBook)
            System.out.println("Sorry");
    }
}
