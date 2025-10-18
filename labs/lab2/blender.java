package labs.lab2;
import  java.util.ArrayList;

public class blender {
    //state - date
    private int power;
    private boolean isPluggedIn;
    private ArrayList<Ingredient> currentContents;
    private double volume;

    //constructor - in order to instantiate an obj of this class
    public blender(int power, double volume) {
        this.power = power;
        this.volume = volume;
        this.isPluggedIn = false;
        this.currentContents = new ArrayList<Ingredient>();
    }

    //behavior
    public void setPower(int power) {
        this.power = power;
    }

    public void addIngredient(Ingredient ingredient) {
        currentContents.add(ingredient);
    }

    public String blend(Ingredient ingredient) {
        return "Blending " + ingredient.getQuantity() + " of " + ingredient.getName() + " at power " + power + ".";
    }

    public boolean checkSafetyLock() {
        return isPluggedIn;
    }

    public double getVolume() {
        return volume;
    }
}
