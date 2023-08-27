package lesson29.abstractClass;

public class HoseholdImpl implements Household{
    @Override
    public boolean addPet(Pet pet) {
        return false;
    }

    @Override
    public Pet removePet(Pet pet) {
        return null;
    }

    // other methods
}
