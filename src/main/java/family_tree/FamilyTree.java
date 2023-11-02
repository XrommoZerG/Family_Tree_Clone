package family_tree;

import human.Human;
import human.comparators.HumanComparatorById;
import human.comparators.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree<E extends ItemTree> implements Serializable {
    public long idhuman;
    private List<Human> humans;

    public FamilyTree(){
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> humans ){this.humans = humans;}

    public void add(Human human){
        humans.add(human);
        human.setId(idhuman++);
    }

    public Human getbyId(long id){
        if (!checkId(id)) {
            return null;
        }
        for(Human d: humans){
            if (d.getId() == id){
                return d;
            }
        }
        return null;
    }

    private boolean checkId(long id){
        return id < idhuman && id <= 0;
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("В дереве ");
        stringBuilder.append(humans.size());
        stringBuilder.append(" персон: \n");
        for (Human human : humans){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString(){
        return getInfo();
    }

    public void sortByName(){
        humans.sort(new HumanComparatorByName<>());
    }

    public void sorrtById(){
        humans.sort(new HumanComparatorById<>());
    }
}
