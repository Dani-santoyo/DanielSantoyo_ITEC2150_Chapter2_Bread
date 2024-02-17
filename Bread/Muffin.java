package Bread;

/**
 * Class - Muffin
 * Description - The muffin class extends from the bread class with unique indgredients and recipe for making muffins
 * @author - Daniel Santoyo
 */
public class Muffin extends Bread{
    private double egg;
    private double milk;
    private double oil;

    public Muffin(){
        super();
        this.egg = 1;
        this.milk = 1;
        this.oil = 0.25;
        this.breadName = "Muffin";
    }

    public Muffin(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String isBaked, double egg, double milk, double oil) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, isBaked);
        this.egg = egg;
        this.milk = milk;
        this.oil = oil;
    }

    public double getEgg() {
        return egg;
    }

    public void setEgg(double egg) {
        this.egg = egg;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }
    //whiskEgg - Prints out a message that the egg has been whisked
    public void whiskEgg(){
        System.out.println("The eggs have been whisked");
    }

    public String recipe(){
        return "Recipe for " + this.breadName + ":\n" +
                "1. Prepare the dough by mixing in a large bowl by adding the yeast, salt, flour, water, and sugar\n" +
                "2. In another bowl, whisk eggs together with milk and oil. Add this to your dough\n" +
                "2. Knead the dough for about 5-8 min, make sure to sprinkle some flour on your hands \n"  +
                "4. Spoon the mixture into prepared muffin cups on a tray\n" +
                "9. Preheat oven to 400 F and bake bread for about 30 min or until golden brown\n" +
                "10. Enjoy! store in an airtight container for 2-3 days at room temp or 5 days in fridge";
    }

    public String toString(){
        return this.breadName + ":\n" +
                "Flour: " + this.flour + " cups\n" +
                "Water: " + this.water + " cups\n" +
                "Salt: " + this.salt + " tsps\n" +
                "Sugar: " + this.sugar + " tsps\n" +
                "Baking Powder: " + this.bakingPowder + " cups\n" +
                "Yeast: " + this.yeast + " tsps\n" +
                "Eggs: " + this.egg + "\n" +
                "Oil: " + this.oil + " cups\n" +
                "Milk" + this.milk + " cups\n" +
                "Baked? " + isBaked + "\n" +
                "Bread Name: " + this.breadName;
    }
}
