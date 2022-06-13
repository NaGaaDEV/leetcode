import java.util.TreeMap;

public class BeautifulString {

    public static boolean isBeautiful(String s) {
        if(s.length() < 2) return true;
        TreeMap<String, Integer> charCount = new TreeMap<>();
        String[] chars = s.split("");
        for(String c : chars) {
            charCount.put(c, charCount.get(c) != null ? charCount.get(c) + 1 : 1);
        }
        Integer lastCharCount = Integer.MAX_VALUE;
        for(String key : charCount.keySet()) {
            if(lastCharCount < charCount.get(key))
                return false;
            lastCharCount = charCount.get(key);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("bbbaacdafe: " + isBeautiful("bbbaacdafe"));
        System.out.println("aabbb: " + isBeautiful("aabbb"));

        System.out.println("bbbcccaaddaac: " + isBeautiful("bbbcccaaddaac"));
        System.out.println("bbbccaadddaa: " + isBeautiful("bbbccaadddaa"));
        System.out.println("bbbccaadaa: " + isBeautiful("bbbccaadaa"));
    }
}
