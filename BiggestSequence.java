public class BiggestSequence {
    public static int biggestSequence(int number) {
        String[] numStr = String.valueOf(number).split("");
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int j=numStr.length - 1; j > 0; j--) {
                if (Integer.valueOf(numStr[j]) > Integer.valueOf(numStr[j - 1])) {
                    String tempDigit = numStr[j - 1];
                    numStr[j - 1] = numStr[j];
                    numStr[j] = tempDigit;
                    sorted = false;
                }
            }
        }
        return Integer.valueOf(String.join("", numStr));
    }

    public static void main(String[] args) {
        System.out.println("12413429: " + biggestSequence(12413429));
    }
}
