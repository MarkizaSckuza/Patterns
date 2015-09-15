package singleton;

/**
 * Created by Margo on 16.09.2015.
 */
public class MySingleton {

    private static volatile MySingleton instance;
    private String name;
    private String[] someProperties;

    private MySingleton() {
        name = "MySingleton";
        someProperties = new String[] {"property1", "property2", "property3"};
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public String[] getSomeProperties() {
        return someProperties;
    }
}
