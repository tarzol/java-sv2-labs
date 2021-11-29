package objectclass.ancestor;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    List<Object> items = new ArrayList<>();

    public SimpleBag() {
    }

    public void putItem(Object item) { }
    public boolean isEmpty() { return true;}
    public int size() { return 0;}
    public void beforeFirst() { }
    public boolean hasNext() { return true; }
    public Object next() {  return null; }
    public boolean contains(Object item) {return true;}
    public int getCursor() { return 0;}

}
