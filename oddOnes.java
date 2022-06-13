import java.util.*;

public class oddOnes {

    public static long oddOnes1(List<Integer> arr) {
        long oddCount = 0L;
        int arrSize = arr.size();
        if(arrSize < 2) return oddCount;

        ListIterator<Integer> listIterator = arr.listIterator();
        while(listIterator.hasNext()) {
            ListIterator<Integer> subListIterator = arr.subList( listIterator.nextIndex() + 1, arrSize ).listIterator();
            Integer firstNum = listIterator.next();
            while(subListIterator.hasNext()) {
                Integer secondNum = subListIterator.next();
                if( (firstNum + secondNum ) % 2 == 1) oddCount++;
            }
        }
        return oddCount;
    }

    public static long oddOnes2(List<Integer> arr) {
        long odd = 0, even = 0;
        for(Integer num : arr) {
            if(num % 2 == 0) even++;
            else odd++;
        }
        return odd * even;
    }

    public static void main(String[] args) {
        System.out.println("4: " + oddOnes1(Arrays.asList(1, 2, 3, 4)));
        System.out.println("6: " + oddOnes1(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println("2: " + oddOnes1(Arrays.asList(new Integer[]{4,7,2})));
        System.out.println("===" );
        System.out.println("4: " + oddOnes2(Arrays.asList(1, 2, 3, 4)));
        System.out.println("6: " + oddOnes2(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println("2: " + oddOnes2(Arrays.asList(new Integer[]{4,7,2})));
    }
}
