import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(
                Arrays.asList(
                        new Product("1", 50.0),
                        new Product("2", 60.0),
                        new Product("3", 20.0))
        );
        VendingMachine vendingMachine = new VendingMachine(list);
        String key = "1";

        List<Product> listDrink = new ArrayList<>(
                Arrays.asList(
                        new Drink("4", 100.0, 0.5),
                        new Drink("5", 160.0, 0.7),
                        new Drink("6", 220.0, 1.5))
        );
        VendingMachine drinkVendingMachine = new DrinkVendingMachine(listDrink);
        String keyDrink = "5";

        List<Product> listHotDrink = new ArrayList<>(
                Arrays.asList(
                        new HotDrink("7", 100.0, 0.5, 70),
                        new HotDrink("8", 160.0, 0.7, 80),
                        new HotDrink("9", 220.0, 1.5, 90))
        );
        VendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(listHotDrink);
        String keyHotDrink = "9";

        System.out.println(vendingMachine.getProductByName(key));
        System.out.println(drinkVendingMachine.getProductByName(keyDrink));
        System.out.println(hotDrinkVendingMachine.getProductByName(keyHotDrink));
    }
}
