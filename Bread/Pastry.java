package Bread;

/**
 * Class - Pastry
 * description - Pastry class extends from the bread class and adds unique indgredients for how to make a pastry
 * @author - Daniel Santoyo
 */

public class Pastry extends Bread{
    private double vanillaCream;
    private double almonds;
    public Pastry(){
        super();
        this.vanillaCream = 1.5;
        this.almonds = 0.5;
        this.breadName = "Pastry";
    }

    public Pastry(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String isBaked, double vanillaCream, double almonds) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, isBaked);
        this.vanillaCream = vanillaCream;
        this.almonds = almonds;
    }

    public double getVanillaCream() {
        return vanillaCream;
    }

    public void setVanillaCream(double vanillaCream) {
        this.vanillaCream = vanillaCream;
    }

    public double getAlmonds() {
        return almonds;
    }

    public void setAlmonds(double almonds) {
        this.almonds = almonds;
    }
    //sliceAlmonds - prints out message that the almonds have been sliced
    public void sliceAlmonds(){
        System.out.println("The almonds have been sliced");
    }

    public String recipe(){
        return "Recipe for " + this.breadName + ":\n" +
                "1. Prepare the dough by mixing in a large bowl by adding the yeast, salt, flour, water, sugar\n" +
                "2. Knead the dough for about 5-8 min, make sure to sprinkle some flour on your hands \n" +
                "3. Place dough in a large bowl, cover with plastic wrap and allow to rise for about 1 and half hours\n"+
                "4. Shape dough into long logs and place into loaf pans\n" +
                "5. Allow bread to rise again for about 45 min to an hour\n" +
                "6. Spread the vanilla cream on top and sprinkle sliced almonds evenly\n" +
                "7. Preheat oven to 350 F and bake bread for about 30 min or until golden brown\n" +
                "8. Enjoy! store in an airtight container for 2-3 days at room temp or 5 days in fridge";
    }

    @Override
    public String toString(){
        return this.breadName + ":\n" +
                "Flour: " + this.flour + " cups\n" +
                "Water: " + this.water + " cups\n" +
                "Salt: " + this.salt + " tsps\n" +
                "Sugar: " + this.sugar + " tsps\n" +
                "Baking Powder: " + this.bakingPowder + " cups\n" +
                "Yeast: " + this.yeast + " tsps\n" +
                "Vanilla Cream: " + this.vanillaCream + " cups\n" +
                "Almonds: " + this.almonds + " cups\n" +
                "Baked? " + isBaked + "\n" +
                "Bread Name: " + this.breadName;
    }
}
