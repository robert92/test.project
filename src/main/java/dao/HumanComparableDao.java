package dao;

import data.HumanComparable;
import data.HumanGender;

import java.util.Arrays;
import java.util.List;

public class HumanComparableDao {

    public List<HumanComparable> getBookAuthors() {
        HumanComparable oscarWilde = new HumanComparable("Oscar", "Wilde", 20, HumanGender.MALE);
        HumanComparable ceceliaAhern = new HumanComparable("Cecelia", "Ahern", 15, HumanGender.FEMALE);
        HumanComparable pilarSordo = new HumanComparable("Pilar", "Sordo", 35, HumanGender.FEMALE);
        HumanComparable garyChapman = new HumanComparable("Gary", "Chapman", 27, HumanGender.MALE);
        HumanComparable estherPerel = new HumanComparable("Esther", "Perel", 32, HumanGender.MALE);
        HumanComparable ianKerner = new HumanComparable("Ian", "Kerner", 30, HumanGender.MALE);
        HumanComparable ernestHemingway = new HumanComparable("Ernest", "Hemingway", 30, HumanGender.MALE);
        return Arrays.asList(oscarWilde, ceceliaAhern, pilarSordo, garyChapman, estherPerel, ianKerner, ernestHemingway);
    }
}
