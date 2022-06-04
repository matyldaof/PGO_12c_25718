package cwiczenia5.zad2;

public class Root extends Plants {
    public Root(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }
    @Override
    int getReagent() {
        return super.getReagent() / 2;
    }
    @Override
    public String toString() {
        return super.toString()
    }
}
