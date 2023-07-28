package thiskeyword;
//this keyword
//1. it is used to refer current class instance variable
////2. it is used to invoke current class methods
//3. it is used to invoke current class construction
//4. it is used to pass argument in method call
//5. it is used to return as an object
public class ThisDemo {

    private int id; //instance variable

    private String name;

    private String address ;


    public ThisDemo(int id, String name, String address) {//parameter constructor
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public ThisDemo() { //default constructor
        this(1,"Prakash","Pune");

        System.out.println("In const");
    }

    public void show(){
        System.out.println("in show");
    }
    public void setId(int id){
        this.id = id;
        this.show();
    }

    public void display(Test test){
        System.out.println(test);
    }

    public static void main(String[] args) {

        ThisDemo obj = new ThisDemo();
//        obj.setId(5);

//        System.out.println(obj.id);
    }
}

class Test{

    public void sample(){
        ThisDemo obj = new ThisDemo();
        obj.display(this);
    }

    public Test a(){
        return this;
    }

    public static void main(String[] args) {

    }

}