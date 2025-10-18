package labs.lab2;

import java.util.ArrayList;

public class recipe {
    private String title;
    private ArrayList<String> instructions;
    private ArrayList<Ingredient> ingredients;
    private int blendTime;

    //constructor
    public recipe(String title, int blendTime) {
        this.title = title;
        this.blendTime = blendTime;
        this.instructions = new ArrayList<String>();
        this.ingredients = new ArrayList<Ingredient>();
    }

    //behavior
    public boolean checkStock(fridge fridge) {
        for (Ingredient ingredient : ingredients) {
            if (!fridge.checkAvailability(ingredient)) {
                return false;
            }
        }
        return true;
    }

    public void loadIngredients(fridge fridge, blender blender) {
        for (Ingredient ingredient : ingredients) {
            fridge.getItem(ingredient);
        }
    }

    public String blend(blender blender) {
        StringBuilder blendProcess = new StringBuilder();
        for (Ingredient ingredient : ingredients) {
            blendProcess.append(blender.blend(ingredient)).append("\n");
        }
        blendProcess.append("Blending for ").append(blendTime).append(" seconds.");
        return blendProcess.toString();
    }
    public void addInstruction(String instruction) {
        instructions.add(instruction);
    }
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    public String getTitle() {
        return title;
    }
    
}
