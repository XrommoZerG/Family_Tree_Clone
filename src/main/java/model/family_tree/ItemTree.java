package model.family_tree;

import model.human.Gender;

import java.time.LocalDate;

public interface ItemTree {
    String getName();

    void setId(long id);

    long getId();

    String getLastName();

    Gender getGender();

    LocalDate getBirthday();

    String getChildren();

    int age();

    int getAge();
}
