package Bread;
/**Class: Bread
 * description - SuperClass for the following 5 subclasses. Includes a list of ingredients, a recipe, as well as
 * the methods
 * @author: Daniel Santoyo
 *
 *
 */

public class Bread {
    protected double flour;
    protected double water;
    protected double salt;
    protected double sugar;
    protected double bakingPowder;
    protected double yeast;
    protected String breadName;
    protected String isBaked;

    public Bread(){
        this.flour = 5;
        this.water = 5;
        this.salt = 2;
        this.sugar = 1;
        this.bakingPowder = 1;
        this.yeast = 1;
        this.breadName = "Basic bread";
        this.isBaked = "Not baked";
    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String isBaked) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.isBaked = isBaked;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getIsBaked() {
        return isBaked;
    }

    public void setIsBaked(String isBaked) {
        this.isBaked = isBaked;
    }
    public void bake(){
        this.isBaked = "Baked";
    }
    //the following method will formulate a list of indgredients for Basic Bread
    public String getIndgredients(){
        return "Indgredients for " + this.breadName + " are:\n" +
                "Flour: " + this.flour + " cups\n" +
                "Water: " + this.water + " cups\n" +
                "Salt: " + this.salt + " tsps\n" +
                "Sugar: " + this.sugar + " tsps\n" +
                "Baking Powder: " + this.bakingPowder + " cups\n" +
                "Yeast: " + this.yeast + " tsps\n";
    }
    //the following method will return the recipe for making Basic Bread
    public String recipe(){
        return "Recipe for " + this.breadName + ":\n" +
                "1. Prepare the dough by mixing in a large bowl by adding the yeast, salt, flour, water and sugar\n" +
                "2. Knead the dough for about 5-8 min, make sure to sprinkle some flour on your hands \n" +
                "3. Place dough in a large bowl, cover with plastic wrap and allow to rise for about 1 and half hours\n"+
                "4. Shape dough into long logs and place into loaf pans\n" +
                "5. Allow bread to rise again for about 45 min to an hour\n" +
                "6. Preheat oven to 350 F and bake bread for about 30 min or until golden brown\n" +
                "7. Enjoy! store in an airtight container for 2-3 days at room temp or 5 days in fridge";
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
                "Baked? " + isBaked + "\n" +
                "Bread Name: " + this.breadName;
    }
}
