package family_tree;

import human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    public long idhuman;
    private List<Human> humans;

    public FamilyTree(){
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> humans ){this.humans = humans;}

    public boolean add(Human human){
        if (human == null) {
            return false;
        }
        if (!humans.contains(human)){
            humans.add(human);
            human.setId(idhuman++);

            return true;
        }
        else {
            return false;
        }

    }
}
