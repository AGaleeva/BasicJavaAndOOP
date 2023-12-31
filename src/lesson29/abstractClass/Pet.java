package lesson29.abstractClass;

import java.util.Objects;

public abstract class Pet {


    // class field
    private String kind;
    private int age;
    private  double weight;
    private boolean gender;

    // constructor
    public Pet(String kind, int age, double weight, boolean gender) {
        this.kind = kind;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pet: " +
                "kind = " + kind + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                ", gender = " + gender +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Double.compare(weight, pet.weight) == 0 && gender == pet.gender && Objects.equals(kind, pet.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, age, weight, gender);
    }

    // abstract methods of the Pet class, method body must be absent
    public abstract void eat();
    public abstract void go();
    public abstract void voice();
}
