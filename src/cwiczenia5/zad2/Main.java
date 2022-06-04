package cwiczenia5.zad2;

public class Main {
    public static void main(String[] args) {
        Elixir migot = new Elixir("Migot", 77);
        migot.addIngredient(new Flower(„Daffodil”, 13, 0));
        migot.addIngredient(new Crystal(„Amethyst”, 20, 100, 300));
        migot.addIngredient(new Ore(„Copper”, 55, 87, false));
        migot.power();
        migot.Create();
        migot.removeIngredient(new Ore(„Copper”, 55, 87, false));
        migot.printListOfIngredient();

    }
}
