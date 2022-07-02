package cwiczenia7.zad3;
import java.util.ArrayList;

public class Orphanage {
    private String name;
    private Location location;
    private ArrayList<Child> child = new ArrayList<Child>();

    public Orphanage(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    public void addChild(Child newChild) {
        child.add(newChild);
        newChild.setLocation(location);
    }
}
