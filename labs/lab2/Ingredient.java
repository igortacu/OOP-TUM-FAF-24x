package labs.lab2;

public class Ingredient {
    // state
    private String name;
    private String quantity;
    private enum type {
        SOLID,
        LIQUID,
        POWDER
    }
    private double volume;

    // constructor
    public Ingredient(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    // behavior
    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getVolume() {
        return volume;
    }

    public void prepare() {
        System.out.println("Preparing " + quantity + " of " + name + ".");
    }
    public type getCurrentType() {
        if (name.equals("water") || name.equals("milk") || name.equals("juice")) {
            return type.LIQUID;
        } else if (name.equals("flour") || name.equals("sugar") || name.equals("salt")) {
            return type.POWDER;
        } else {
            return type.SOLID;
        }
    }
}
