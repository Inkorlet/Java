package HW4.task4;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person owner1 = new Person("Viktor", "Petrov");
        Person owner2 = new Person("Anna", "Ivanova");

        zooClub.addMember(owner1);
        zooClub.addMember(owner2);

        Pet pet1 = new Pet("Bobby", "Dog");
        Pet pet2 = new Pet("Whiskers", "Cat");
        Pet pet3 = new Pet("Coco", "Parrot");

        zooClub.addPetToMember(owner1, pet1);
        zooClub.addPetToMember(owner1, pet2);
        zooClub.addPetToMember(owner2, pet3);

        System.out.println("Zoo Club:");
        zooClub.displayClub();

        zooClub.removePetFromMember(owner1, pet2);

        System.out.println("\nПісля видалення тваринки:");
        zooClub.displayClub();

        zooClub.removeMember(owner2);

        System.out.println("\nПісля видалення учасника:");
        zooClub.displayClub();

        zooClub.removePetFromAllOwners(pet1);

        System.out.println("\nПісля видалення конкретної тваринки у всіх учасників:");
        zooClub.displayClub();
    }
}
