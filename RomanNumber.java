import java.util.Map;
//wip
public class RomanNumber {
    public static void main(String[] args) {
//        String s = "IV";
//        String s = "LVIII"; //58
        String s = "MCMXCIV"; //1994

        Map<String, Integer> romanRef = Map.of("I", 1,"V", 5,"X", 10,"L", 50,"C", 100,"D", 500,"M", 1000);
        String[] romanNum = s.split("");

        int num = 0;
        String preCh = "";
        for(String rCh : romanNum) {
            if(rCh.equals("I") || rCh.equals("X") || rCh.equals("C")) {
                num -=romanRef.get(rCh);
                preCh = rCh;
                System.out.print(rCh+"-");
            }
            else{
                if(preCh != "" && (rCh.equals("V") || rCh.equals("X") || rCh.equals("L") ||  rCh.equals("C") || rCh.equals("D") || rCh.equals("M")))
                    num +=romanRef.get(preCh);
                num +=romanRef.get(rCh);
                preCh = "";
            }
            System.out.println(num);
        }
//        System.out.println(num);
    }
}
