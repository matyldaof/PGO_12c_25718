package cwiczenia7.zad3;
import java.util.ArrayList;
import java.util.List;
public class Voldemort extends Character {
    ArrayList<String> horcruxes = new ArrayList<>();
    ArrayList<Character> targets = new ArrayList<>();

    public Voldemort(Riddle tom) {
        super(tom.name = "Lord Voldemort");
        character.set(character.indexOf(tom), this);
    }

    public void createHorcruxes(int count){
        for(int i=1;i<=count;i++){
            horcruxes.add(i);
        }
    }

    public void printHorcruxes(){
        System.out.println("Created horcruxes:");
        for(int i = 1; i <= horcruxes.size(); i++) {
            System.out.println("    horcrux " + i);
        }


    public void castSpell(Spell spell){

    }
}
