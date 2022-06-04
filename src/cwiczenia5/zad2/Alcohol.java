package cwiczenia5.zad2;

public class Alcohol extends Liquid{
    private int percent;
    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        setPercent(percent);
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }


}