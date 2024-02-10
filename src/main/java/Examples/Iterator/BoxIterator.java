package Examples.Iterator;

import java.util.Iterator;
import java.util.List;

public class BoxIterator <T> implements Iterator<T> {
    List <T> box;
    int index;

    public BoxIterator(List<T> box) {
        this.box = box;
        index=0;
    }

    @Override
    public boolean hasNext() {
        return index<box.size();
    }

    @Override
    public T next() {
        return box.get(index++);
    }
}
