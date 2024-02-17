package Bread;

/**
 * Class - Concha
 * The Concha class extends from the Bread class and has unique indgredients and recipe for making "pan dulce"
 * (mexican sweet bread)
 * @author - Daniel Santoyo
 */
public class Concha extends Bread{
    private double butter;
    private double vanillaExtract;
    private double granulatedSugar;

    public Concha(){
        super();
        this.butter = 0.5;
        this.vanillaExtract = 1;
        this.granulatedSugar = 0.75;
        this.breadName = "Concha";
    }

    public Concha(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String isBaked, double butter, double vanillaExtract, double granulatedSugar) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, isBaked);
        this.butter = butter;
        this.vanillaExtract = vanillaExtract;
        this.granulatedSugar = granulatedSugar;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }

    public double getVanillaExtract() {
        return vanillaExtract;
    }

    public void setVanillaExtract(double vanillaExtract) {
        this.vanillaExtract = vanillaExtract;
    }

    public double getGranulatedSugar() {
        return granulatedSugar;
    }

    public void setGranulatedSugar(double granulatedSugar) {
        this.granulatedSugar = granulatedSugar;
    }
    //makeStreusel - this method prints out a message that reads that the streusel topping has been made
    public void makeStreusel(){
        System.out.println("The streusel has been mixed");
    }

    public String recipe(){
        return "Recipe for " + this.breadName + ":\n" +
                "1. In a seperate bowl mix together flour, vanilla extract, butter and granulated sugar. This will be the streusel topping that makes the concha\n"+
                "2. Prepare the dough by mixing in a large bowl by adding the yeast, salt, flour, water, sugar\n" +
                "3. Knead the dough for about 5-8 min, make sure to sprinkle some flour on your hands \n" +
                "4. Place dough in a large bowl, cover with plastic wrap and allow to rise for about 1 and half hours\n"+
                "5. Shape dough into small crescent shaped pieces and place into loaf pans\n" +
                "6. Allow bread to rise again for about 45 min to an hour\n" +
                "7. Cut the streusel into pieces that can be placed evenly onto each piece of bread\n" +
                "8. Once placed, cut criss-coss style into each layer of streusel topping \n" +
                "9. Preheat oven to 350 F and bake bread for about 30 min or until golden brown\n" +
                "10. Enjoy! store in an airtight container for 2-3 days at room temp or 5 days in fridge";
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
                "Vanilla Extract: " + this.vanillaExtract + " tsps\n" +
                "Butter: " + this.butter + " cups\n" +
                "Granulated Sugar" + this.granulatedSugar + " cups\n" +
                "Baked? " + isBaked + "\n" +
                "Bread Name: " + this.breadName;
    }
}
