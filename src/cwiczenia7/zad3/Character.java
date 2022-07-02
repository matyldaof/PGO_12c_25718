package cwiczenia7.zad3;
import java.util.ArrayList;

public class Character {

    private String name;
    private Location location;
    private int health = 100;
    private static ArrayList<Character> characters = new ArrayList<>();

    public Character(String name, Location location) {
        this.name = name;
        this.location = location;
        characters.add(this);
    }

    public void doSth(String activity){
        System.out.println("I am " + name + ", I am " +activity);
    }

    public static void doSth(String activity, Character... characters){
        for(Character character : characters){
            character.doSth(activity);
        }
    }

    public void introduce(){
        System.out.println("Hello, I am " + name);
    }

    public void say(String text, Child child){
        System.out.println(this.name + " to " + child.getName());
        System.out.println("\t\t"+text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void MoveAllTo(Location location, Child child1, Child child2){
        child1.setLocation(location);
        child2.setLocation(location);
    }

    public void moveTo(Location location) throws StoryViolationException{
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public void moveTo(Orphanage woolsOrphanage) {
        setLocation(woolsOrphanage.getLocation());
    }

    public Location getLocation() {
        return location;
    }

    public static void status(){
        System.out.println("====Status====");
        for (int i = 0; i < character.size(); i++) {
            if (!character.get(i).getClass().equals(Orphanage.class))
                System.out.println(character.get(i).name + " : " + character.get(i).health);
        }
        System.out.println("==============");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if(health == 0)
            System.out.println(name + " died");
    }
}
