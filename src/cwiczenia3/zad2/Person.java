package cwiczenia3.zad2;
import java.util.ArrayList;
public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ArrayList<ShoppingCard> history = new ArrayList<>();
    ShoppingCard current;

    public Person(String name, String surname, double moneyInCash, double moneyOnCard){
        setName(name);
        setSurname(surname);
        setMoneyInCash(moneyInCash);
        setMoneyOnCard(moneyOnCard);
        this.history = history;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name can't be empty or null");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("Surname can't be empty or null");
        }
        this.surname = surname;
    }

    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash<0){
            throw new RuntimeException("Money in cash can't be lower then 0");
        }
        this.moneyInCash = moneyInCash;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if(moneyOnCard<0){
            throw new RuntimeException("Money on card can't be lower then 0");
        }
        this.moneyOnCard = moneyOnCard;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void MakeOrder(){
        ShoppingCard current = new ShoppingCard();
        this.current = current;
    }

    public void BuyByCard(){
        if(current.totalPrice() > getMoneyOnCard()){
            throw new RuntimeException("Not enough money on Card");
        }else if(current.totalPrice() <= getMoneyOnCard()) {
            setMoneyOnCard(getMoneyOnCard()-current.totalPrice);
            history.add(current);
            current.Sell();
            current = null;
        }
    }

    public void BuyInCash(){
        if(current.totalPrice() > getMoneyInCash()){
            throw new RuntimeException("Not enough money on Card");
        }else if(current.totalPrice() <= getMoneyInCash()){
            setMoneyInCash(getMoneyInCash()-current.totalPrice());
            history.add(current);
            current.Sell();
            current = null;
        }
    }

    public int getHistorySize() {
        if(this.history == null){
            return 0;
        }else{
            return history.size();
        }
    }

    public void addToShoppingCard(Products products){
        current.addToShoppingCard(products);
    }

    // Test function
    public void presentPersonStatus(){
        System.out.println(
                "Name: " + getName()+"\n"+
                        "Surname: " + getSurname()+"\n"+
                        "Money id Cash: "+getMoneyInCash()+"\n"+
                        "Money on Card: "+getMoneyOnCard()+"\n"+
                        "History element: "+getHistorySize()+"\n"
        );
    }

}
