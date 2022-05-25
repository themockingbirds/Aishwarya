class OopStruct {
    public static void main(String[] args) {
        OtherClass class1=new OtherClass();
        class1.setName("Aaditya");
        class1.setCls(1);
        class1.setRoll(1);
        class1.setSec('a');
        class1.setSchool("ABC School");

        class1.display();
        	
        System.out.println("===========================================\n");
        System.out.println("Name: "+class1.getName());
        System.out.println("Class: "+class1.getCls()+" Section: "+class1.getSec());
        System.out.println("Roll No: "+class1.getRoll());
    }
}

class OtherClass{
    private String name,school;
    private int roll, cls;
    private char sec;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public char getSec() {
        return sec;
    }
    public void setSec(char sec) {
        this.sec = sec;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getCls() {
        return cls;
    }

    public void setCls(int cls) {
        this.cls = cls;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Class: "+cls+" Section: "+sec);
        System.out.println("Roll No: "+roll);
    }
}