import java.util.Arrays;

public class ArraysExercises {

    private static Person[] people = new Person[3];

    public static void main(String[] args) {

        people[0] = new Person("bob");
        people[1] = new Person("dan");
        people[2] = new Person("jon");

        people = addPerson(people, new Person("jan"));

        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }

}
