package templateMethod;

/**
 * Created by Margo on 17.09.2015.
 */
public abstract class BottleForCondensedMilk {

    final void createBottle(){

        prepareMetal();
        meltMetal();
        makeShape();

        System.out.println("The bottle is ready to use!");
    }

    public void prepareMetal(){
        System.out.println("Prepearing the metal");
    }

    public void meltMetal() {
        System.out.println("Melting the metal");
    }

    public abstract void makeShape();
}
