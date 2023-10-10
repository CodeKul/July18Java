package java8;

public class DefaultAndStatic implements MyInterface5 {

    public static void main(String[] args) {

        DefaultAndStatic obj = new DefaultAndStatic();
        obj.show();
        obj.add(8,9);

        MyInterface5.sub(7,4);
    }

    @Override
    public int add(int i, int j) {
        return i*j;
    }

    @Override
    public void show() {

    }
}

interface MyInterface5{

    public void show();

    default int add(int i,int j){
        return i+j;
    }

    static int sub(int i,int j){
        return i-j;
    }


}


@FunctionalInterface
interface MyInterface6{

    void show();

    int hashCode();

}