import java.util.Arrays;

public class FlatMultiDimArrayEdges {

    public static String[] flatten(String[][] args) {
        String[] result = new String[args.length * args[0].length];
        int resultIndex = 0;
        int xmax = args.length;
        int ymax = args[0].length;
        System.out.println("x: "+xmax);
        System.out.println("y: "+ymax);
        for(int j=0; j<ymax; j++) {
            for(int i=args.length-xmax; i<xmax; i++) {
                result[resultIndex++] = args[i][j];
                if(i == xmax-1) {
                    int y=i+1;
                    for(; y<ymax; y++) {
                        result[resultIndex++] = args[y][j];
                    }
                    ymax--;
                    int x=xmax-1;
                    for(; x>=args.length-xmax; x--) {
                        result[resultIndex++] = args[x][y-1];
                    }
                    xmax--;
                    y--;
                    for(; y>=args[0].length-ymax; y--) {
                        result[resultIndex++] = args[x-1][y];
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // h e l l o
        //   i s
        // e . g n m
        // m a n   y
        
        String[][] arr = new String[5][4];
        arr[0][0] = "h"; arr[1][0] = "e"; arr[2][0] = "l"; arr[3][0] = "l"; arr[4][0] = "o";
        arr[0][1] = "3"; arr[1][1] = "i"; arr[2][1] = "s"; arr[3][1] = "4"; arr[4][1] = "1";
        arr[0][2] = "e"; arr[1][2] = "."; arr[2][2] = "g"; arr[3][2] = "n"; arr[4][2] = "m";
        arr[0][3] = "m"; arr[1][3] = "a"; arr[2][3] = "n"; arr[3][3] = "2"; arr[4][3] = "y";

        System.out.println("hello my name is ng.: " + Arrays.toString(flatten(arr)));
    }
}
