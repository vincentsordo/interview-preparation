package problems.InterviewCake;

/**
 * Write a method getProductsOfAllIntsExceptAtIndexWithDivision() that takes
 * an array of integers and returns an array of the products.
 *
 * Example: [1, 7, 3, 4] -> [84, 12, 28, 21]
 *          [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
 *
 * Important: You can't use division in your solution!
 *
 */
public class ProductsOfAllIntsExceptAtIndex {
    /**
     *  To find the products of all the integers except the integer at each index,
     *  we'll go through our array greedily ↴ twice. First we get the products of
     *  all the integers before each index, and then we go backwards to get the
     *  products of all the integers after each index.
     *
     *  When we multiply all the products before and after each index, we get our
     *  answer—the products of all the integers except the integer at each index!
     *
     *  Time complexity: O(n)
     *  Space complexity: O(n)
     * @param inputArray
     * @return
     */
    public int[] getProductsOfAllIntsExceptAtIndexWithoutDivision(int [] inputArray) {
        // error checking
        if (inputArray == null || inputArray.length < 2) {
            throw new IllegalArgumentException("Input array must has 2 or more elements");
        }

        int [] productsOfAllIntsExceptAtIndex = new int[inputArray.length];

        int productSoFar = 1;
        // calculate the products before index
        for (int i = 0; i < inputArray.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar *= inputArray[i];
        }

        productSoFar = 1;
        // calculate the products after index
        for (int i = inputArray.length - 1; i >= 0; i--) {
            productsOfAllIntsExceptAtIndex[i] *= productSoFar;
            productSoFar *= inputArray[i];
        }

        return productsOfAllIntsExceptAtIndex;
    }
    /**
     * Time complexity: O(n)
     * Space complexity: 0(1)
     * @param inputArray
     * @return
     */
    public int[] getProductsOfAllIntsExceptAtIndexWithDivision(int [] inputArray) {
        // calculate the total product od all elements
        int totalProduct = 1;
        for (int i : inputArray) {
            totalProduct *= i;
        }

        // create new array of
        for(int i = 0; i < inputArray.length; i++) {
            // cannot divide by 0
            if (inputArray[i] != 0) {
                inputArray[i] = totalProduct / inputArray[i];
            }
        }

        return inputArray;
    }
}
