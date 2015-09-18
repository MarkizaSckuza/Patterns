package composite;

/**
 * Created by Margo on 18.09.2015.
 */
public abstract class Component {

    void action1() { throw new UnsupportedOperationException();}
    void action2() { throw new UnsupportedOperationException();}
    void action3() { throw new UnsupportedOperationException();}
    void action4() { throw new UnsupportedOperationException();}
    void addComponent(Component component) {throw new UnsupportedOperationException();}
    void removeComponent(Component component) {throw new UnsupportedOperationException();}
}
