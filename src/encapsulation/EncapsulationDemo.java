package encapsulation;

public class EncapsulationDemo {

    private int id;

    private String name;

    private String address;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }else {
            System.out.println("id is zero");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        obj.id = 1;
        obj.name="Rahul";
        obj.address = "Pune";

    }
}
