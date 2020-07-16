import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountingFierceTest {
    private static int[] testPositiveNumbersOnly;
    private static int[] testNegativeNumberOnly;
    private static int[] testMixNumbers;
    private static int[] testAllSameNumber;
    private static int[] testExtremes;

    @BeforeAll
    static void setUp () {
        testPositiveNumbersOnly = new int[]{13, 1, 21, 42, 15, 3, 9, 33, 73};
        testNegativeNumberOnly = new int[]{-3, -19, -11, -29, -15, -4, -1, -125, -33};
        testMixNumbers = new int[]{17, -1, 0, 21, 5, 3, 44, -67, 7};
        testAllSameNumber = new int[]{19, 19, 19, 19, 19, 19, 19, 19, 19};
        testExtremes = new int[] {-2147483648, 2147483647};
    }



    private static Stream<Arguments> providedNumbers_allSums() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 210),
                Arguments.of(testNegativeNumberOnly, -240),
                Arguments.of(testMixNumbers, 29),
                Arguments.of(testAllSameNumber, 171),
                Arguments.of(testExtremes, -1)
        );
    }

    @DisplayName("Sum of all numbers in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allSums")
    void sum_variousArrays_allValid_returnSumNumber (int[] arr, int sumValue) {
        int sum = CountingFierce.sumElems(arr);
        assertEquals(sumValue, sum);
    }

    private static Stream<Arguments> providedNumbers_allAvg() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 23),
                Arguments.of(testNegativeNumberOnly, -26),
                Arguments.of(testMixNumbers, 3),
                Arguments.of(testAllSameNumber, 19),
                Arguments.of(testExtremes, 0)
        );
    }

    @DisplayName("Average of all numbers in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allAvg")
    void avg_variousArrays_allValid_returnAveNumber (int[] arr, int aveValue) {
        int avg = CountingFierce.avgElems(arr);
        assertEquals(aveValue, avg);
    }

    @DisplayName("Count occurrences of value, value not in array")
    @Test
    void occurs_notInArray_returnZero () {
        int[] arr = {6, 5, 4, 9, 12, 7};

        int occurs = CountingFierce.countOccurs(arr, 3);
        assertEquals(0, occurs);
    }

    @DisplayName("Count occurrences of value, value the entire array")
    @Test
    void occurs_theEntireArray_returnLength () {
        int[] arr = {21, 21, 21, 21, 21, 21};

        int occurs = CountingFierce.countOccurs(arr, 21);
        assertEquals(arr.length, occurs);
    }

    @DisplayName("Count occurrences of value, value on even indexes")
    @Test
    void occurs_onEvenIndexes_returnHalfRoundedUp () {
        int[] arr = {11, 58, 11, 9, 11, 25};

        int occurs = CountingFierce.countOccurs(arr, 11);
        assertEquals(3, occurs);
    }

    @DisplayName("Count occurrences of value, value on odd indexes")
    @Test
    void occurs_onOddIndexes_returnHalfRoundedDown () {
        int[] arr = {4, 29, 1, 29, 9, 29};

        int occurs = CountingFierce.countOccurs(arr, 29);
        assertEquals(3, occurs);
    }

    @DisplayName("Count occurrences of value, value is negative")
    @Test
    void occurs_valueIsNegative_returnOnlyNegativeCount () {
        int[] arr = {18, 29, 63, -18, 7, 33};

        int occurs = CountingFierce.countOccurs(arr, -18);
        assertEquals(1, occurs);
    }

    @DisplayName("Appears in, value appears")
    @Test
    void appears_valueIsInArray_returnTrue () {
        int[] arr = {81, 29, 63, 128, 994, 33};

        boolean appears = CountingFierce.appearsIn(arr, 63);
        assertTrue(appears);
    }

    @DisplayName("Appears in, value does not appear")
    @Test
    void appears_valueIsNotInArray_returnFalse () {
        int[] arr = {1, 784, 35, 564, 4, 27};

        boolean appears = CountingFierce.appearsIn(arr, 19);
        assertFalse(appears);
    }

    @DisplayName("First appears, value first index")
    @Test
    void first_valueIsFirstIndex_returnZero () {
        int[] arr = {31, 84, 15, 71, 5644, 727};

        int index = CountingFierce.firstAppear(arr, 31);
        assertEquals(0, index);
    }

    @DisplayName("First appears, value last index")
    @Test
    void first_valueIsLastIndex_returnLengthMinusOne () {
        int[] arr = {351, 23, 53, 4, 3414, 727};

        int index = CountingFierce.firstAppear(arr, 727);
        assertEquals(arr.length - 1, index);
    }

    @DisplayName("First appears, value not in array")
    @Test
    void first_valueIsNotInArray_returnNegOne () {
        int[] arr = {-42, 23, -53, 91, 632, -2322};

        int index = CountingFierce.firstAppear(arr, -91);
        assertEquals(-1, index);
    }

    @DisplayName("First appears, value in middle")
    @Test
    void first_valueIsInMiddle_returnThree () {
        int[] arr = {53, -72, 97, -53, 76, 512, 22};

        int index = CountingFierce.firstAppear(arr, -53);
        assertEquals(3, index);
    }

    private static Stream<Arguments> providedNumbers_allMinimums() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 1),
                Arguments.of(testNegativeNumberOnly, -125),
                Arguments.of(testMixNumbers, -67),
                Arguments.of(testAllSameNumber, 19),
                Arguments.of(testExtremes, -2147483648)
        );
    }

    @DisplayName("Minimum number in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allMinimums")
    void min_variousArrays_allValid_returnMinimumNumber (int[] arr, int minValue) {
        int min = CountingFierce.minValue(arr);
        assertEquals(minValue, min);
    }

    private static Stream<Arguments> providedNumbers_allMaximums() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 73),
                Arguments.of(testNegativeNumberOnly, -1),
                Arguments.of(testMixNumbers, 44),
                Arguments.of(testAllSameNumber, 19),
                Arguments.of(testExtremes, 2147483647)
        );
    }

    @DisplayName("Maximum number in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allMaximums")
    void max_variousArrays_allValid_returnMaximumNumber (int[] arr, int maxValue) {
        int max = CountingFierce.maxValue(arr);
        assertEquals(maxValue, max);

    }

    private static Stream<Arguments> providedNumbers_allRanges() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 72),
                Arguments.of(testNegativeNumberOnly, 124),
                Arguments.of(testMixNumbers, 111),
                Arguments.of(testAllSameNumber, 0)
        );
    }

    @DisplayName("Range of the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allRanges")
    void range_variousArrays_allValid_returnRangeNumber (int[] arr, int maxValue) {
        int range = CountingFierce.rangeValue(arr);
        assertEquals(maxValue, range);

    }

}