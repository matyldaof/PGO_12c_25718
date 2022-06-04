package cwiczenia5.zad2;

public class Liquid extends Ingredient {
    protected int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        setDissolubility(dissolubility);
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return dissolubility;
    }
}