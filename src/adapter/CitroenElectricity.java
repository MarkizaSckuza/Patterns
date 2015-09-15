package adapter;

/**
 * Created by Margo on 16.09.2015.
 */
public class CitroenElectricity implements AutomobileElectricity {


    @Override
    public void plugIntoAutomobileSocket() {
        System.out.println("automobile socket");
    }
}
