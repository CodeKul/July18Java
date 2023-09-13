package string;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pune");
        stringBuffer.append("Mumbai");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.append("Mumbai");
        System.out.println(stringBuilder);
    }
}
