package StreamLessons;

import java.util.List;

public class ImperativeApproach {

    private static List<Person> getPeople() {
        return List.of(
                new  Person("John",Gender.MALE,"24"),
                new Person("goat",Gender.MALE, "16"),
                new Person("tinuAde",Gender.FEMALE, "23"),
                new Person("amirah",Gender.FEMALE,"16"),
                new Person("tolu",Gender.FEMALE,"20"),
                new Person("shola",Gender.MALE,"27"),
                new Person("glory", Gender.FEMALE,"23")
        );
}

}
