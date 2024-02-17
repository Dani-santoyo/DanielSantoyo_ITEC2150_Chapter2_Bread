package Bread;

/**
 * Class Name - Sourdough
 * Description - This class extends from the Bread class aswell as adds the "sourdoughStarter" field. For the purpose
 * of making sourdough bread
 * @author - Daniel Santoyo
 */

public class Sourdough extends Bread {
    private double sourdoughStarter;
    public Sourdough(){
        super();
        this.breadName = "Sourdough";
        this.sourdoughStarter = 1;
    }

    public Sourdough(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String isBaked, double sourdoughStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, isBaked);
        this.sourdoughStarter = sourdoughStarter;
    }

    public double getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }
    //addSourdoughStarter - Prints out a message that the starter has been added
    public void addSourdoughStarter(){
        System.out.println("Sourdough Starter has been added to the mix");
    }
    public String recipe(){
        return "Recipe for " + this.breadName + ":\n" +
                "1. Prepare the dough by mixing in a large bowl by adding the yeast, salt, flour, water, sugar and sourdough starter\n" +
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
                "Sourdough Starter: " + this.sourdoughStarter + " cups\n" +
                "Baked? " + isBaked + "\n" +
                "Bread Name: " + this.breadName;
    }


}
