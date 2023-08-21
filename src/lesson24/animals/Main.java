package lesson24.animals;

public class Main {

    public static void main(String[] args) {


        Cat cat = new Cat();
        Dog dog = new Dog();
        Humster humster = new Humster();

        Animal cat1 = new Cat();  // восходящее преобразование - происходит автоматически
        Animal dog1 = new Dog();
        Animal humster1 = new Humster();

        Cat cat2 = (Cat) cat1; // низходящее преобразование (но при этом надо делать проверки)
        cat2.eat();


        cat.voice();
        dog.voice();
        humster.voice();

        cat1.voice();
        dog1.voice();
        humster1.voice();

        Animal[] animals = new Animal[3]; // можно создать массив даже если переменные объявлены по собственному классу
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = humster;

        Animal[] animals1 = new Animal[3];
        animals1[0] = cat1;
        animals1[1] = dog1;
        animals1[2] = humster1;

        for (Animal animal : animals) {
            animal.voice();
        }

        for (Animal animal1 : animals1) {
            animal1.voice();
            if (animal1 instanceof Cat) {  // низходящее преобразование с проверкой, является ли животное экземпляром класса кот
                Cat newCat = (Cat) animal1;
                newCat.eat();
            }
        }
    }
}
