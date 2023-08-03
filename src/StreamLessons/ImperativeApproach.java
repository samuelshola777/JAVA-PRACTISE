package StreamLessons;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class ImperativeApproach {
    public static void main(String[] args) {
// TODO: Imperative approach
        List<Person> people = getPeople();
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);
        //TODO: Declarative approach
//// TODO:
//        Filter
//        sort
//        All match
//        None match
//        Max
//        Min
//        Group

       // TODO: declarative approach
        //TODO: the variable people is the list carrying the value of  the listOfPerson
        List<Person> listOfFemales = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        listOfFemales.forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("John", Gender.MALE, "24"),
                new Person("goat", Gender.MALE, "16"),
                new Person("tinuAde", Gender.FEMALE, "23"),
                new Person("amirah", Gender.FEMALE, "16"),
                new Person("tolu", Gender.FEMALE, "20"),
                new Person("shola", Gender.MALE, "27"),
                new Person("glory", Gender.FEMALE, "23")
        );

    }
}
