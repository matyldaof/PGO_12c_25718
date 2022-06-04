package cwiczenia5.zad2;

public class Crystal extends Mineral {
    private int magicPower;

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public Crystal(String name, int baseReagent, int power, int magicPower) {
        super(name, baseReagent, power);
        this.magicPower = magicPower;

    }
    @Override
    public String toString()
    {
        return super.toString();
    }
}
