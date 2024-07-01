package finalexam.task2;

public class FactoryTester {

    public static void main(String[] args) {
        // Create the factory
        PaperFactory factory = new PaperFactory();

        // Create some persons
        Person person1 = new Person("beqa", "kopadze", "123");
        Person person2 = new Person("gio", "qitiasvhili", "124");
        Person person3 = new Person("luka", "shamatava", "125");
        Person person4 = new Person("alex", "maghlakelidze", "126");
        Person person5 = new Person("paata", "gogishvili", "127");
        // Add persons to the factory
        factory.addPerson(person1);
        factory.addPerson(person2);
        factory.addPerson(person3);
        factory.addPerson(person4);
        factory.addPerson(person5);
        factory.addPerson(person1); // Attempt to add a duplicate

        // Print the current staff list
        factory.staffList();

        // Print the number of staff members
        factory.staffCount();

        // Delete a person by object
        factory.deletePerson(person2);

        // Delete a person by ID
        factory.deletePerson("125");

        // Attempt to delete a person not in the factory
        factory.deletePerson("129");

        // Print the final staff list
        factory.staffList();

        // Print the final number of staff members
        factory.staffCount();

        // Print the factory description
        System.out.println(factory.toString());
    }
}
