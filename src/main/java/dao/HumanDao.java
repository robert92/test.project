package dao;

import data.Human;
import data.HumanGender;

import java.util.Arrays;
import java.util.List;

public class HumanDao {

    public List<Human> getBookAuthors() {
        Human oscarWilde = new Human("Oscar", "Wilde", 20, HumanGender.MALE);
        Human ceceliaAhern = new Human("Cecelia", "Ahern", 15, HumanGender.FEMALE);
        Human pilarSordo = new Human("Pilar", "Sordo", 35, HumanGender.FEMALE);
        Human garyChapman = new Human("Gary", "Chapman", 27, HumanGender.MALE);
        Human estherPerel = new Human("Esther", "Perel", 32, HumanGender.MALE);
        Human ianKerner = new Human("Ian", "Kerner", 30, HumanGender.MALE);
        Human ernestHemingway = new Human("Ernest", "Hemingway", 30, HumanGender.MALE);
        return Arrays.asList(oscarWilde, ceceliaAhern, pilarSordo, garyChapman, estherPerel, ianKerner, ernestHemingway);
    }
}
