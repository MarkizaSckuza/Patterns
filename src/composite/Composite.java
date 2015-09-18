package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Margo on 18.09.2015.
 */
public class Composite extends Component {

    private List<Component> list;
    private String name;

    public Composite(String name) {
        this.name = name;
        list = new ArrayList<Component>();
    }

    public Composite(String name, List<Component> list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public void action1() {
        System.out.println("Overriden action1 in Composite");
    }

    @Override
    public void action2() {
        System.out.println("Overriden action2 in Composite");
    }

    @Override
    public void action4() {
        System.out.println("Overriden action4 in Composite");
    }

    @Override
    public void addComponent(Component component) {
        list.add(component);

        System.out.println("Overriden addComponent: added " + component.toString());
    }

    @Override
    public void removeComponent(Component component) {
        list.remove(component);
        System.out.println("Overriden removeComponent: removed " + component.toString());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Composite{");
        sb.append("name='").append(name).append('\'');
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
