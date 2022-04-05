package basic.methods;

public class ClassAndObject {
    public static void main(String[] args) {
        ClassAbc obj = new ClassAbc();
        obj.Hello();
    }
}

class ClassAbc{
    static {
        System.out.println("Hello  I am static");
    }
    void Hello(){
        System.out.println("Hello, I am Class ABC");
    }
}
