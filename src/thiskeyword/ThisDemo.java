package thiskeyword;
//this keyword
//1. it is used to refer current class instance variable
//2
public class ThisDemo {

    private int id; //instance variable

    private String name;

    private String address;

    public void setId(int id){
        this.id = id;
    }
    public static void main(String[] args) {

        ThisDemo obj = new ThisDemo();
        obj.setId(5);

        System.out.println(obj.id);
    }
}
