package composite;

/**
 * Created by Margo on 18.09.2015.
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void action1() {
        System.out.println("Overriden action1 in Leaf");
    }

    @Override
    void action2() {
        System.out.println("Overriden action2 in Leaf");
    }

    @Override
    void action3() {
        System.out.println("Overriden action3 in Leaf");
    }

    @Override
    void action4() {
        System.out.println("Overriden action4 in Leaf");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Leaf{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
