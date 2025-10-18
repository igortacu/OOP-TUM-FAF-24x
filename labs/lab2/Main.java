package labs.lab2;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        // create fridge and store ingredients
        fridge myFridge = new fridge(4.0);
        Ingredient banana = new Ingredient("banana", "1 piece");
        Ingredient milk = new Ingredient("milk", "200 ml");
        Ingredient proteinPowder = new Ingredient("protein powder", "30 g");
        myFridge.storeItem(banana);
        myFridge.storeItem(milk);
        myFridge.storeItem(proteinPowder);
        // create blender
        blender myBlender = new blender(500, 1.5);
        myBlender.setPower(700);
        // create recipe
        recipe proteinShake = new recipe("Protein Shake", 30);
        proteinShake.addIngredient(banana);
        proteinShake.addIngredient(milk);
        proteinShake.addIngredient(proteinPowder);
        proteinShake.addInstruction("Peel the banana.");
        proteinShake.addInstruction("Add all ingredients to the blender.");
        proteinShake.addInstruction("Blend for 30 seconds.");
        // check stock and prepare shake
        if (proteinShake.checkStock(myFridge)) {
            proteinShake.loadIngredients(myFridge, myBlender);
            String blendingProcess = proteinShake.blend(myBlender);
            System.out.println("Making " + proteinShake.getTitle() + ":\n" + blendingProcess);
        } else {
            System.out.println("Not all ingredients are available in the fridge.");
        }
        System.out.println("Protein shake preparation complete.");
    }

}
