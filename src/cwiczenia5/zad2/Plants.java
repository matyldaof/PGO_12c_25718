package cwiczenia5.zad2;

public class Plants extends Ingredient{
    private int toxity;

    public int getToxity() {
        return toxity;
    }

    public void setToxity(int toxity) {
        this.toxity = toxity;
    }

    public Plants(String name, int baseReagent, int toxity,) {
        super(name, baseReagent);
        this.toxity = toxity;
    }
    @Override
    int getReagent()
    {
        return super.getReagent()*toxicity;
    }
}
