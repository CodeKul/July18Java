package operators;

/**
 * arithmetic - + , - ,/ ,*, %
 * unary - ++ , --
 * assignment - =
 * relational - < > <= >= !=
 * logical - && || !
 * bitwise - & |
 * shift - << >>
 * ternary - ? :

 */
public class OperatorsDemo {

    public static void main(String[] args) {

        int i=10;
        int j=4;

//        System.out.println(i+j);
//        System.out.println(i-j);
//        System.out.println(i*j);
//        System.out.println(i/j);
//        System.out.println(i%j);

//        System.out.println(i++); //i =i+1
//        System.out.println(i);
//        System.out.println(i--); //i=i-1
//        System.out.println(i);
//
//        System.out.println(i!=j);

//        if(i>0 || j>=1){
//            System.out.println("both are not zero");
//        }

//        boolean flag =true;
//
//        System.out.println(flag);

        System.out.println(i&j);
        System.out.println(i|j);

        System.out.println(i<<j); //10*2^4 = 160
        System.out.println(i>>j); //10/2^4 = 0

        if(i==0){
            System.out.println("i is zero");
        }else {
            System.out.println("i is not zero");
        }
        String str = i==0?"i is zero":"i is not zero";
        System.out.println(str);
    }
}
