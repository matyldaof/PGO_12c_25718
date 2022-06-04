package cwiczenia5.zad2;

public class Ore extends Mineral {
    private boolean metallic;
    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        if (metallic) this.metallic = true;
        else this.metallic = false;
    }
    @Override
    public int getReagent() {
        if (metallic == false) {
            return super.getReagent() /2;
        } else {
            return super.getReagent();
        }
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
}
