import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        // create people array with 3 indexes
        Person[] people = new Person[3];

        // assign each index to a string
        people[0] = new Person("bob");
        people[1] = new Person("dan");
        people[2] = new Person("jon");

        // use addPerson method to add a new index and string
        people = addPerson(people, new Person("jan"));

        // print name of the person string at each index of the people array
        for (Person person : people) {
            System.out.println(person.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person person) {

        // assign newPeople to a copy of people array with another index
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);

        // set the last index of newPeople array to person parameter
        newPeople[newPeople.length - 1] = person;

        return newPeople;
    }

}
