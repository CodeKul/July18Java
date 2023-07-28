package finalkeyword;

//final keyword
//1. if we declare final variable then we cannot reassign value
//2. if we declare final method then you cannot override
//3. if we declare fina class then we cannot inherit class
public final class FinalDemo {

   final int i =10;

    public final void show(){
//        i =19;
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println(obj.i);

    }
}

//class FinalDemo1 extends FinalDemo{
//    public void show(){
////        i =19;
//    }
//
//
//}

