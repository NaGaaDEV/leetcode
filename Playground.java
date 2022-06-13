public class Playground {

    public static String aLongestString(String s) {
        String[] arr = s.split("a");
        String longesString = "";
        for(String subString : arr) {
            if(subString.length() > longesString.length()) longesString = subString;
        }
        return longesString;
    }

    public static void main(String[] args) {
        System.out.println("aLongestString[fdsdddsd]: " + aLongestString("adfsdfadafdfaafdsdddsdasd"));
    }
    
}
