package human;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human implements Serializable {
    private long id;
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Gender gender;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, LocalDate birthDate, LocalDate deathDate, Gender gender, Human father, Human mother) {
        id = 0;
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }

    public Human(String name, LocalDate birthDate, Gender gender) {
        this(name, birthDate, null, gender, null, null);
    }

    public Human(String name, LocalDate birthDate, Gender gender, Human father, Human mother) {
        this(name, birthDate, null, gender, father, mother);
    }

    public boolean addChildren(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            return true;
        }
        return false;
    }

    public int getAge() {
        if (deathDate == null) {
            return getPeriod(birthDate, LocalDate.now());
        }
        return getPeriod(birthDate, deathDate);
    }

    private int getPeriod(LocalDate birthDate, LocalDate deathDate) {
        Period diff = Period.between(birthDate, deathDate);
        return diff.getYears();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public String toString(){
        return getInfo();
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: ");
        stringBuilder.append(id);
        stringBuilder.append(", name: ");
        stringBuilder.append(name);
        stringBuilder.append(", gender: ");
        stringBuilder.append(getGender());
        stringBuilder.append(", age: ");
        stringBuilder.append(getAge());
        stringBuilder.append(", ");
        stringBuilder.append(getFatherInfo());
        stringBuilder.append(", ");
        stringBuilder.append(getMotherInfo());
        stringBuilder.append(", ");
        stringBuilder.append(getChildrenInfo());

        return stringBuilder.toString();
    }

    public String getMotherInfo() {
        String info = "mother: ";
        if (mother != null) {
            info += mother.getName();
        } else {
            info += "unknown";
        }
        return info;
    }

    public String getFatherInfo() {
        String info = "father: ";
        if (father != null) {
            info += father.getName();
        } else {
            info += "unknown";
        }
        return info;
    }

    public String getChildrenInfo() {
        StringBuilder info = new StringBuilder();
        info.append("children: ");
        if (children.size() != 0) {
            for (int i = 0; i < children.size(); i++) {
                info.append(children.get(i).getName());
                if (i == children.size() - 1) {
                    info.append(".");
                } else {
                    info.append(", ");
                }
            }
        } else {
            info.append("missing");
        }
        return info.toString();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getId() == getId();

    }
}


