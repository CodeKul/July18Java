package string;

public class StringDemo {

    public static void main(String[] args) {

//        String str = new String("Pune");//2
        String str1 = new String("Pune");//0
//        String str2 = new String("Pune");//1

        String str2 = new String("Pune");
//        str1 = str1.concat("Mumbai");

        System.out.println(str1);
//
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.getBytes());
//
//        System.out.println(str1.toCharArray());
//        System.out.println(str1.charAt(2));
//
//
//        String uni = Integer.toHexString(str1.charAt(0));
//        System.out.println(uni);
//        System.out.println(str1.compareTo(str2));

//        System.out.println(str1.replace("P","N"));
//
//        System.out.println(str1.indexOf("u"));
//        System.out.println(str1.contains("P"));
//        System.out.println(str1.startsWith("P"));
//        System.out.println(str1.endsWith("s"));

        System.out.println(str1==str2);//true
        System.out.println(str1.equals(str2));//true
//        System.out.println(str1.compareTo(str2));
    }
}
