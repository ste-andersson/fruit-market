package fruit;

public class Banana extends Fruit {

    private boolean peel;

    public Banana() {
        super(150);
        peel = true;
    }

    public Banana(boolean peel) {
        super(150);
        this.peel =peel;
    }

    public Banana(int calories) {
        super(calories);
        peel = true;
    }

    public Banana(boolean peel, int calories) {
        super(calories);
        this.peel = peel;
    }

    public boolean getPeel() {
        return peel;
    }

    public void setPeel(boolean peel) {
        this.peel = peel;
    }

    public void removePeel() {
        if(peel) {
            peel = false;
            System.out.println("The banana has been peeled.");
        } else {
            System.out.println("There was no peel to remove.");
        }
    }

    @Override
    public void makeJuice() {
        String peelStatus;
        if(peel){
            peelStatus = ", but there is banana peel in the juice!";
        } else {
            peelStatus = " and there is no peel in the juice.";
        }
        System.out.println("Banana juice was made" + peelStatus);
    }
}