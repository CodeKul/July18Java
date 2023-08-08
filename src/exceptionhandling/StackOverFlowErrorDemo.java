package exceptionhandling;

public class StackOverFlowErrorDemo {

    public static void main(String[] args) {

        StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
        obj.rec(8);
    }

    public void rec(int i){
        if(i==0){
            return;
        }else {
            rec(i);
        }
    }
}
