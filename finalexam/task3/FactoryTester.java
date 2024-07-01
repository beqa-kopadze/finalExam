package finalexam.task3;

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

        // Print the current staff list
        factory.staffList();

        // Save the staff list to a file
        String filename = "staff_list.ser";
        factory.saveStaffToFile(filename);

        // Clear the current staff list
        System.out.println("\nClearing the current staff list...\n");
        factory = new PaperFactory();
        factory.staffList();

        // Load the staff list from the file
        factory.loadStaffFromFile(filename);

        // Print the loaded staff list
        factory.staffList();
    }
}
