package fruit;

public class Market {

    public static void main(String[] args) {
        Apple regularApple = new Apple();
        Apple bigApple = new Apple(200);
        Apple seedlessApple = new Apple(false);

        Banana regularBanana = new Banana();
        Banana miniBanana = new Banana(80);
        Banana prePeeledBanana = new Banana(false);

        Fruit orange = new Fruit(130);

        Fruit ambiguousApple = new Apple(110);

        regularApple.removeSeeds();
        seedlessApple.removeSeeds();
        regularApple.makeJuice();
        bigApple.makeJuice();
        seedlessApple.makeJuice();

        regularBanana.removePeel();
        prePeeledBanana.removePeel();
        regularBanana.makeJuice();
        miniBanana.makeJuice();
        prePeeledBanana.makeJuice();

        orange.makeJuice();
        ambiguousApple.makeJuice();

    }

}
