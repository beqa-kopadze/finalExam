package finalexam.task2;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
        return "this is a paper factory! don't you believe me???";
    }
}
