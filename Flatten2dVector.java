import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flatten2dVector implements Iterator<Integer> {
    List<Integer> result = new ArrayList<>(/*[[1,2],[3],[4,5,6]]*/);
    Integer index = 0;

    public Flatten2dVector(List<List<Integer>> vec2d) {
        // Initialize your data structure here
        Iterator<List<Integer>> vec2dItr = vec2d.iterator();
        while (vec2dItr.hasNext()) {
            Iterator<Integer> vec1dItr = vec2dItr.next().iterator();
            while (vec1dItr.hasNext()) {
                result.add(vec1dItr.next());
            }
        }
    }

    @Override
    public Integer next() {
        return this.result.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < this.result.size();
    }

    @Override
    public void remove() {
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */