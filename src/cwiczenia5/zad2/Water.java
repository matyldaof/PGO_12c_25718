package cwiczenia5.zad2;
public class Water extends Liquid{
    private boolean distilated;

    public Water String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }
    public boolean isDistilated() {
        return distilated;
    }
    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
   public int getReagent()
    {
        if (!distilated)
            return super.getReagent()/2;
        else
            return super.getReagent();
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
