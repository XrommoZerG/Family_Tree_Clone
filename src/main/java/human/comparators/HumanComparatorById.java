package human.comparators;

import family_tree.ItemTree;

import java.util.Comparator;

public class HumanComparatorById<E extends ItemTree> implements Comparator<E> {
    public int compare(E t1, E t2){
        return Long.compare(t1.getId(),t2.getId());
    }
}
