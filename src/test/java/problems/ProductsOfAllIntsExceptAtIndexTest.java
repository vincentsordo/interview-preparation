package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductsOfAllIntsExceptAtIndexTest {
    ProductsOfAllIntsExceptAtIndex productsOfAllIntsExceptAtIndex;

    @Before
    public void init() {
        productsOfAllIntsExceptAtIndex = new ProductsOfAllIntsExceptAtIndex();
    }

    @Test
    public void testGetProductsOfAllIntsExceptAtIndexWithoutDivision() {
        int[] inputArray = new int[] {1, 7, 3, 4};
        assertArrayEquals(productsOfAllIntsExceptAtIndex.getProductsOfAllIntsExceptAtIndexWithoutDivision(inputArray), new int[]{84, 12, 28, 21});
    }

    @Test
    public void testGetProductsOfAllIntsExceptAtIndexWithDivision() {
        int[] inputArray = new int[] {1, 7, 3, 4};
        assertArrayEquals(productsOfAllIntsExceptAtIndex.getProductsOfAllIntsExceptAtIndexWithDivision(inputArray), new int[]{84, 12, 28, 21});
    }

}