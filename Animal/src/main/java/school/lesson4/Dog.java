package school.lesson4;

public class Dog extends Animal {
    private String name;
    static int countDog = 0;
    private final int RUN_LIMIT = 500;
    private final int SWIM_LIMIT = 10;

    public Dog(String name){
        super();
        countDog++;
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance > RUN_LIMIT) {
            System.out.println(name+ " не может бежать больше " + RUN_LIMIT + " м");
        } else {
            System.out.println(name+ " пробежала " + distance + " м");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > SWIM_LIMIT) {
            System.out.println(name + " не может плавать больше " + SWIM_LIMIT + " м");
        } else {
            System.out.println(name + " проплыла " + distance + " м");
        }
    }
    static int getCountDog (){
        return countDog;
    }
}
