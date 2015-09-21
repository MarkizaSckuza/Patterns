package proxy;

/**
 * Created by Margo on 21.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        User user = new User("Margo", "12345", false);

        CommandExecutor proxy = new Proxy(user);
        try {
            proxy.runCommand("git init");
            proxy.runCommand("rm compiler.xml");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
