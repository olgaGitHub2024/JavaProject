package school.lesson4;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        Cat cat1 = new Cat("Том");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat ("Снежок");

        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Мухтар");

        animal1.run(120);
        animal1.swim(320);
        System.out.println();


        cat1.run(150);
        cat1.swim(390);
        System.out.println();

        cat2.run(201);
        cat2.swim(53);
        System.out.println();

        dog1.run(500);
        dog1.swim(32);
        System.out.println();

        dog2.run(501);
        dog2.swim(20);
        System.out.println();

        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());
        System.out.println();

        Cat[] cats = new Cat[3];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        Bowl bowl = new Bowl (100);

        for (Cat cat: cats){
            cat.setHungry();
            cat.eat(bowl, 15);
            System.out.println("Количество еды в миске: " + bowl.getFood());
            System.out.println("Кот " + cat.getName() + " голоден: " + cat.isHungry());
            System.out.println();
        }
    }
}
