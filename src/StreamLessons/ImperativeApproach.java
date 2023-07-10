package StreamLessons;

import java.util.List;

public class ImperativeApproach {

    private static List<Person> getPeople() {
        return List.of(
                new  Person("John",Gender.MALE,"24"),
                new Person("goat",Gender.MALE, "16"),
                new Person("tinuAde",Gender.FEMALE, "23"),
                new Person("amirah",Gender.FEMALE,"16"),

        )
}

}
