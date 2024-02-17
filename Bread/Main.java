package Bread;

/**
 * Class - Main
 * Description - For the purpose of creating an instance of the Bread class and each of its subclasses as well as all
 * of their methods
 * @author - Daniel Santoyo
 */
public class Main {
    public static void main(String[] args){
        Bread myBread = new Bread();
        myBread.bake();
        System.out.println(myBread.recipe());
        System.out.println();

        Sourdough mySourdough = new Sourdough();
        mySourdough.addSourdoughStarter();
        System.out.println(mySourdough.recipe());
        System.out.println();

        Pastry myPastry = new Pastry();
        myPastry.sliceAlmonds();
        System.out.println(myPastry.recipe());
        System.out.println();

        Concha myConcha = new Concha();
        myConcha.makeStreusel();
        System.out.println(myConcha.recipe());
        System.out.println();

        Croissant myCroissant = new Croissant();
        myCroissant.spreadButter();
        System.out.println(myCroissant.recipe());
        System.out.println();

        Muffin myMuffin = new Muffin();
        myMuffin.whiskEgg();
        System.out.println(myMuffin.recipe());
        System.out.println();

    }
}
