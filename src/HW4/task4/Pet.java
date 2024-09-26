package HW4.task4;

import java.util.Objects;

public class Pet {
    private String name;
    private String species;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return name + " (" + species + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) && Objects.equals(species, pet.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species);
    }
}
