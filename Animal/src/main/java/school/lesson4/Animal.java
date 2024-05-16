package school.lesson4;

public class Animal {
    static int count = 0;
    public Animal(){
        count++;
    }


    public void run (int distance) {
        System.out.println("Животное пробежало " + distance + " м");
    }

    public void swim (int distance){
        System.out.println("Животное проплыло " + distance + " м");
    }

    public static int getCountAnimal(){
        return count;
    }
}
