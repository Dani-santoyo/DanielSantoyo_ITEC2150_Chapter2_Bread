package Bread;

/**
 * Class - Croissant
 * Description - Extends from bread class and contains unique recipe and indgredients for how to make croissants
 * @author - Daniel Santoyo
 */
public class Croissant extends Bread{
    private double eggWash;
    private double butter;
    private double milk;

    public Croissant(){
        super();
        this.breadName = "Croissant";
        this.butter = 2;
        this.eggWash = 0.5;
        this.milk = 1;
    }

    public Croissant(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String isBaked, double eggWash, double butter, double milk) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, isBaked);
        this.eggWash = eggWash;
        this.butter = butter;
        this.milk = milk;
    }

    public double getEggWash() {
        return eggWash;
    }

    public void setEggWash(double eggWash) {
        this.eggWash = eggWash;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }
    //spreadButter - Prints out message that the butter has been spread onto the dough
    public void spreadButter(){
        System.out.println("The butter has been spread");
    }

    public String recipe(){
        return "Recipe for " + this.breadName + ":\n" +
                "1. Prepare the dough by mixing in a large bowl by adding the yeast, salt, flour, water, sugar, and milk\n" +
                "2. Knead the dough for about 5-8 min, make sure to sprinkle some flour on your hands \n" +
                "3. Stretch the dough out into a rectangle and spread butter on top of dough. Wait 4 hours\n" +
                "4. Stretch dough and fold onto itself. You should now have a bottom and top dough layer and a middle butter layer \n" +
                "5. Place dough in a large tray, cover with plastic wrap and allow to rise for about 1 and half hours\n"+
                "6. Cut dough into small triangle shaped pieces and place into loaf pans\n" +
                "7. Allow bread to rise again for about 45 min to an hour\n" +
                "8. Roll triangle pieces and this will create the croissant shape. Apply a layer of the egg wash to each one\n" +
                "9. Preheat oven to 350 F and bake bread for about 30 min or until golden brown\n" +
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
                "Egg Wash: " + this.eggWash + " cups\n" +
                "Butter: " + this.butter + " cups\n" +
                "Milk" + this.milk + " cups\n" +
                "Baked? " + isBaked + "\n" +
                "Bread Name: " + this.breadName;
    }
}
