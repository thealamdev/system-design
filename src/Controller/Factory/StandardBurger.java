package Controller.Factory;

public class StandardBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Standard Burger");
    }
}
