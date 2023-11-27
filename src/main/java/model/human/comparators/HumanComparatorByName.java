package model.human.comparators;

import family_tree.ItemTree;

import java.util.Comparator;

public class HumanComparatorByName<E extends ItemTree> implements Comparator<E> {
    @Override
    public int compare(E t1, E t2){
        return t1.getName().compareTo(t2.getName());
    }

}
