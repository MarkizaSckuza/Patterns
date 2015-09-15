package decorator;

/**
 * Created by Margo on 15.09.2015.
 */
public class MilkBottle implements Bottle {

    private String description;

    public MilkBottle() {
        description = "Bottle of milk";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
