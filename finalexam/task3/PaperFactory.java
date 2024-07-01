package finalexam.task3;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        boolean personAdded = true;
        for(Person c: staff){
            if(c.equals(p)){
                System.out.println("person that you want to add to factory staff is already here!");
                personAdded = false;
            }
        }
        if(personAdded){
            staff.add(p);
            System.out.println("person " + p.getName() + " has been added to staff");
        }
    }

    public boolean deletePerson(Person p) {
        boolean personDeleted = false;

        if(staff.contains(p)){
            staff.remove(p);
            System.out.println("person: "+ p.getName() + " " + p.getSurname() + " with id: " + p.getPersonalNumber() + " is suspended from factory!");
            personDeleted = true;
        }else{
            System.out.println("person that you want to suspend is not in the factory staff!");
        }

        return personDeleted;
    }

    public void deletePerson(String id){
        boolean personDeleted = false;
        Person personToRemove = null;
        for(Person p: staff){
            if(p.getPersonalNumber().equals(id)){
                System.out.println("person: "+ p.getName() + " " + p.getSurname() + " with id: " + p.getPersonalNumber() + " is suspended from factory!");
                personToRemove = p;
                personDeleted = true;
            }
        }
        if(!personDeleted){
            System.out.println("person that you want to suspend is not in the factory staff!");
        }else{
            staff.remove(personToRemove);
        }
    }

    public void staffList(){
        for(Person p: staff){
            System.out.println("person: "+ p.getName() + " " + p.getSurname() + " with id: " + p.getPersonalNumber());
        }
    }
    public void staffCount(){
        int size = staff.size();
        System.out.println("there are " + size + " staff members in you paper factory!");
    }

    // Method to save staff list to a file
    public void saveStaffToFile(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(staff);
            System.out.println("Staff list saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving staff list to file: " + e.getMessage());
        }
    }

    // Method to load staff list from a file
    @SuppressWarnings("unchecked")
    public void loadStaffFromFile(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            staff = (List<Person>) in.readObject();
            System.out.println("Staff list loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading staff list from file: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "this is a paper factory! don't you believe me???";
    }
}
