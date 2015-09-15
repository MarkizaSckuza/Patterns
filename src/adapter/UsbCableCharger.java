package adapter;

/**
 * Created by Margo on 16.09.2015.
 */
public class UsbCableCharger implements USBElectricity {


    @Override
    public void charge() {
        System.out.println("charging...");
    }
}
