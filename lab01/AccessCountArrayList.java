
/**
 * @author  Cipher
 * @version 20180114
 */

import java.util.*;

public class AccessCountArrayList<E> extends ArrayList<E> {
    private int getCnt;
    private int setCnt;
    
    public AccessCountArrayList() {
        super();
        this.resetCounts();
    }
    
    public void resetCounts() {
        this.getCnt = 0;
        this.setCnt = 0;
    }
    
    public int getGetCount() {
        return this.getCnt;
    }
    
    public int getSetCount() {
        return this.setCnt;
    }
    
    @Override
    public E set(int index, E element) {
        this.setCnt++;
        return super.set(index, element);
    }
    
    @Override
    public E get(int index) {
        this.getCnt++;
        return super.get(index);
    }
}
