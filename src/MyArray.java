public class MyArray<T> {
    private Object[] arr;
    private int arrayLength = 10;
    private int elements = 0;

    public <T> MyArray () {
        arr = new Object[arrayLength];
    }

    public T get(int index) {

        return (T) arr[index];
    }

    private void add (T x) {
        if (elements < arr.length) {
            arr[elements] = x;
            elements++;
        } else {

        }
    }
    /*
    private static int[] increaseArrayLength (int[] arr) {
        int length = arr.length;
        Object[] arr2 = new Object[length + 10];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;

     */

}
