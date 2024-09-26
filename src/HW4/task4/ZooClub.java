package HW4.task4;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToMember(Person person, Pet pet) {
        club.computeIfPresent(person, (p, pets) -> {
            pets.add(pet);
            return pets;
        });
    }

    public void removePetFromMember(Person person, Pet pet) {
        club.computeIfPresent(person, (p, pets) -> {
            pets.remove(pet);
            return pets;
        });
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAllOwners(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.remove(pet);
        }
    }

    public void displayClub() {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            System.out.println("Owner: " + entry.getKey());
            System.out.println("Pets: " + entry.getValue());
        }
    }
}
