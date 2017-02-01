package main.java.com.basturk.stringmanipulation;

/**
 * Created by: onur
 * Date: 2/1/17
 */
public class StringIntegerConversion {

    public static void main(String[] args) {
        //using Integer.parseInt
        int i = Integer.parseInt("123");
        System.out.println("i: " + i);

        //How to convert numeric string = "000000081" into Integer value = 81
        int j = Integer.valueOf("000000081");
        System.out.println("j: " + j);

        // converts int to String
        String price = "" + 123;
        System.out.println("Price: " + price);

        new StringBuilder().append( "" ).append( 10 ).toString();

        price = String.valueOf(123);
        price = String.format ("%d", 123);


    }

}
