
public class prefixChar {

    public static String prefixWithK(String s) {
        String[] words = s.split("");
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf("f") == 0 || words[i].indexOf("F") == 0) {
                words[i] = "K" + words[i];
            }
        }
        return String.join("",words);
    }

    public static void main(String[] args) {
        System.out.println("bbbaacdafe: " + prefixWithK("force"));
        System.out.println("aabbb: " + prefixWithK("fulffy fubu"));
    }
}
