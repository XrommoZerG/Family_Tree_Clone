package model.builder;

import model.human.Gender;
import model.human.Human;

import java.time.LocalDate;

public class HumanBuilder {

    public Human build (String name, String lastname, Gender gender) {
        Human human = new Human(name, lastname, gender);
        return human;
    }
}
