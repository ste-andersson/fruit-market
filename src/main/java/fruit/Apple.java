package fruit;

public class Apple extends Fruit {

    private boolean seeds;

    public Apple(int calories){
        super(calories);
        seeds = true;
    }

    public Apple(){
        super(120);
        seeds = true;
    }

    public Apple(boolean seeds){
        super(120);
        this.seeds = seeds;
    }

    public Apple(boolean seeds, int calories) {
        super(calories);
        this.seeds = seeds;
    }

    public boolean getSeeds() {
        return seeds;
    }

    public void setSeeds(boolean seeds) {
        this.seeds = seeds;
    }

    public void removeSeeds() {
        if(seeds) {
            seeds = false;
            System.out.println("Seeds have been removed");
        } else {
            System.out.println("There were no seeds to remove");
        }
    }

    @Override
    public void makeJuice() {
        String seedStatus;
        if(seeds) {
            seedStatus = ", but there are seeds in the juice.";
        } else {
            seedStatus = " and it's free from seeds.";
        }
        System.out.println("Apple juice has been made" + seedStatus);
    }
}
