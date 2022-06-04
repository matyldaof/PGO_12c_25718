package cwiczenia5.zad2;

public class Ingredient {
    private String name;
    private int baseReagent;

    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient(int baseReagent) {
        this.baseReagent = baseReagent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(int baseReagent) {
        this.baseReagent = baseReagent;
    }

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
