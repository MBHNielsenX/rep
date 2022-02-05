import java.util.Random;

public class intArray {
    public static void main(String[] args) {
        Random randGen = new Random();

        int[] arr = new int[10];

        //There are only 10 elements allowed in the array, but we want 20 elements
        for (int i = 0; i < 20; i++) {
            //Because we throw an exception on the 11'th place that element will actually not be counted, and thus it will print only 0
            try {
                //Numbers between 7000 and 8000
                arr[i] = 7000 + randGen.nextInt(1000);
                //It will be corrected if we put another random number on i's place
            } catch (ArrayIndexOutOfBoundsException e) {
               arr = increaseArrayLength(arr);
               arr[i] = 7000 + randGen.nextInt(1000);
            }


        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    private static int[] increaseArrayLength (int[] arr) {
        int length = arr.length;
        int[] arr2 = new int[length + 10];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
