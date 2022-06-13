import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int arraySize = array.length;
        if(arraySize < 2) return;

        int mid = arraySize / 2 ;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[arraySize - mid];

        for(int i =0; i < mid; i++) {
            leftHalf[i] = array[i];
        }
        for(int i = mid; i < arraySize; i++) {
            rightHalf[i - mid] = array[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sortAndMerge(array, leftHalf, rightHalf);
    }

    public static void sortAndMerge(int[] array, int[] left, int[] right) {
        int ai = 0, li = 0, ri = 0;
        while(li < left.length && ri < right.length)
            array[ai++] = (left[li] <= right[ri]) ? left[li++] : right[ri++];
        //append leftover
        while(li < left.length)
            array[ai++] = left[li++];
        while(ri < right.length)
            array[ai++] = right[ri++];
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,6,4,8,6,9,8,4,56,4};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
