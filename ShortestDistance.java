import java.util.*;

public class ShortestDistance {

    public static int shortestDistance(Vector<HashMap<String, Boolean>> blocks, String[] reqs) {
        if(blocks.size() == 0) return 0;

        int[] distance = new int[blocks.size()];
        List<String> reqsList;
        for(int i=0; i<blocks.size(); i++) {
            reqsList = Arrays.asList(reqs);
            for(int j=0; j<blocks.size(); j++) {
                for(String req : reqs) {
                    HashMap<String, Boolean> block = blocks.get(j);
                    System.out.println(block);
                    if(block.get(req)) {
                        reqsList.remove(req);
                        distance[i] += Math.abs(i-j);
                    }
                }
            }
            distance[i] /= reqs.length;
        }
        
        System.out.println(Arrays.toString(distance));
        return 0;
    }

    public static void main(String[] args) {
        Vector<HashMap<String, Boolean>> blocks = new Vector<>();
        HashMap<String, Boolean> buildings = new HashMap<>();
        buildings.put("gym", false);
        buildings.put("school", true);
        buildings.put("store", false);
        blocks.add(buildings);
        buildings.clear();

        buildings.put("gym", true);
        buildings.put("school", false);
        buildings.put("store", false);
        blocks.add(buildings);
        buildings.clear();

        buildings.put("gym", true);
        buildings.put("school", true);
        buildings.put("store", false);
        blocks.add(buildings);
        buildings.clear();

        buildings.put("gym", false);
        buildings.put("school", true);
        buildings.put("store", false);
        blocks.add(buildings);
        buildings.clear();

        buildings.put("gym", false);
        buildings.put("school", true);
        buildings.put("store", true);
        blocks.add(buildings);
        buildings.clear();

        System.out.println("3: " + shortestDistance(blocks, new String[]{"gym","school","store"}));
    }

    class Block {

    }
}
