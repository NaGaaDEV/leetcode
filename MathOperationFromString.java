import java.util.Arrays;

public class MathOperationFromString {

    public static float mathOperation(String s) {
        s = s.replace(" ", "");
        String[] arr = s.split("\\+");  // Split expression string using + operator. Now every index will have either an integer or an expression of only products.
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            float result = 1;

            if (arr[i].contains("*")) { // If index contains * sign split expression using *
                String[] num = arr[i].split("\\*");
                for (int j = 0; j < num.length; j++) {  // Multiply each number separated by * and store final product in 'result' variable
                    result *= Float.parseFloat(num[j]);
                }

                arr[i] = String.valueOf(result);    // Store resultant product value in the array index. For ex: index having 2*3 is, replaced by 6 and index having 4*5*6 is replaced by 120.
            }
            if (arr[i].contains("/")) {
                String[] num = arr[i].split("\\/");

                for (int j = 0; j < num.length; j++) {  // Multiply each number separated by * and store final product in 'result' variable
                    System.out.println(result+"/"+num[j]);
                    result /= Float.parseFloat(num[j]);
                }

                arr[i] = String.valueOf(result);    // Store resultant product value in the array index. For ex: index having 2*3 is replaced by 6 and index having 4*5*6 is replaced by 120.
            }
        }

        int len = arr.length;   // Now every array index has a single integer as element.
        float sum = 0;

        for (int i = 0; i < len; i++) { // Calculate the sum of all elements of array to get final result.
            sum += Float.parseFloat(arr[i]);
        }

        return sum; // Return the final result
    }

    public static void main(String[] args) {
        System.out.println("1: " + mathOperation("1 + 2 / 3"));
//        System.out.println("1: " + mathOperation("(1 + 2) / 3 "));
    }
}
