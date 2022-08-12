import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Apple;
import edible.Edible;
import edible.Fruit;
import edible.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals
        ) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible e = (Edible) animal;
                System.out.println(e.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits
        ) {
            System.out.println(fruit.howToEat());
        }
    }
}
