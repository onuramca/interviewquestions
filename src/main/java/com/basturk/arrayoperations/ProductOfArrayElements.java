package main.java.com.basturk.arrayoperations;

/**
 * Created by: onur
 * Date: 2/2/17
 */
public class ProductOfArrayElements {

    public static void main(String[] args) {

        int[] originalArray = {2, 3, 4, 5, 6}; // This is the input

        int[] arrayOfProducts = calculateArrayOfProducts(originalArray);

        for (int i = 0; i < arrayOfProducts.length; i++) {
            System.out.println("products[" + i + "] = " + arrayOfProducts[i]);
        }

    }

    private static int[] calculateArrayOfProducts(int[] originalArray) {

        int[] products = new int[originalArray.length];

        // Find the product of elements lower than the current index
        int product = 1;
        for (int i = 0; i < originalArray.length; i++) {
            products[i] = product;
            product *= originalArray[i];
        }

        // Find the product of elements higher than the current index
        product = 1;
        for (int i = originalArray.length - 1; i >= 0; i--) {
            products[i] *= product;
            product *= originalArray[i];
        }

//        Arrays.sort(products);
//        Arrays.fill(products,2, 5, 6);
//        System.out.println(Arrays.binarySearch(products, 180));

        return products;
    }

}
