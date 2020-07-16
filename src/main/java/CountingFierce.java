import java.util.Random;

public class CountingFierce {
    public static void main (String[] args) {

        Random rand = new Random();

        int arrayLength = 10;
        int num;

        int[] randomArrayOne = new int[arrayLength];
        int[] randomArrayTwo = new int[arrayLength];
        int[] randomArrayThree = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            num = ((rand.nextInt(100) - 15) / 3) + 19;

            randomArrayOne[i] = num;

            randomArrayTwo[i] = num + 17;

            randomArrayThree[i] = num - 21;

        }

        printArr(randomArrayOne);
        printArr(randomArrayTwo);
        printArr(randomArrayThree);

    }//end of main method


    public static void printArr (int[] arr) {
        for (int num : arr) {
            System.out.printf("%s ", num);
        }
        System.out.println();
    }

}//end of class