package fruit;

public class Fruit {
    private int calories;

    public Fruit(int calories) {
        this.calories = calories;
    }

    public Fruit() {
        calories = 100;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made");
    }
}
