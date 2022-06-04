package cwiczenia5.zad2;
import java.util.ArrayList;
import java.util.List;

public class Elixir {

    String name;
    boolean isCreated=false;
    int power=0;
    List<Ingredient> ingredients = new ArrayList();
    Liquid catalyst;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCreated() {
        return isCreated;
    }

    public void setCreated(boolean created) {
        isCreated = created;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        this.catalyst = catalyst;
    }
    public void printListOfIngredient(){
        System.out.println("\n\nList of ingredient of " + name + "\n");
        System.out.println("Catalyst:\n");
        System.out.println(catalyst);

        System.out.println("Ingredients:\n");

        for(Ingredient ingredient : ingredients){
            System.out.println(ingredient);
        }

}
