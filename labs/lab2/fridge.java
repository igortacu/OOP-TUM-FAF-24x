package labs.lab2;
import  java.util.ArrayList;


public class fridge {
    //state
    private ArrayList<Ingredient> Ingredients;
    private double tempC;
    private boolean isOccupied;

    //constructor
    public fridge(double tempC) {
        this.tempC = tempC;
        this.isOccupied = false;
        this.Ingredients = new ArrayList<Ingredient>();
    }

    //behavior
    public void storeItem(Ingredient ingredient) {
        Ingredients.add(ingredient);
    }

    public void setTemperature(double tempC) {
        this.tempC = tempC;
    }
    public boolean checkAvailability(Ingredient ingredient) {
        isOccupied = Ingredients.contains(ingredient);
        return isOccupied;
    }

    public void getItem(Ingredient ingredient) {
        Ingredients.remove(ingredient);
    }
    public double getTemperature() {
        return tempC;
    }
}
