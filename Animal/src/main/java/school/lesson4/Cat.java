package school.lesson4;

public class Cat extends Animal {
    private String name;
    private boolean hungry;
    static int countCat = 0;
    private final int RUN_LIMIT = 200;

    public Cat (String name){
        super();
        countCat++;
        this.name = name;
        this.hungry = true;
    }

    @Override
    public void run(int distance) {
        if (distance > RUN_LIMIT) {
            System.out.println(name+ " не может бежать больше " + RUN_LIMIT + " м");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    static int getCountCat(){
        return countCat;
    }

    public void eat(Bowl bowl, int amountToFeed){
        if (hungry){
            if (bowl.eatFood(amountToFeed)) {
                System.out.println (name + " поел");
                hungry = false;
            }
        } else {
            System.out.println(name + " не голоден");
        }
    }

    public void setHungry(){
        hungry = true;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName(){
        return name;
    }
}
