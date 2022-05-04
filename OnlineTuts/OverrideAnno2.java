class OverrideAnno2 {
    public static void main(String[] args) {
        Def def = new Def();
        def.display();
    }
}
class Abc{
    Abc(){
        System.out.println("Hello I am Abc Cons");
    }
    void display(){
        System.out.println("I am ABC");
    }
}

class Def extends Abc{
    Def(){
        System.out.println("Hello, I am Def Cons");
    }
    
    @Override
    void display(){
       // super();
        System.out.println("I am DEF");
        super.display();
    }
}