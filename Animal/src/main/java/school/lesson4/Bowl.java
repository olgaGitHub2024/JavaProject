package school.lesson4;

public class Bowl {

    private int food;

    public Bowl (int food){
        this.food = food;
    }

    public void addFood(int amount){
        food+=amount;
    }

    public boolean eatFood(int amount){
        if (food >= amount){
            food-=amount;
            return true;
        } else {
            System.out.println("В миске недостаточно еды");
            return false;
        }
    }

    public int getFood(){
        return food;
    }

}
