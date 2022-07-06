

class  MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
class MyExceptionDemo {
    public static void main(String[] args) {
        int x=5,y=1000;
        try{
            float z=(float) x/(float) y;
            if(z<0.01)
                throw new MyException("Number is too small;");
        } catch (MyException e){
            System.out.println("Error Occurred\n"+e.getMessage());
        }
    }
}