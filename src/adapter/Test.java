package adapter;

/**
 * Created by Margo on 16.09.2015.
 */
public class Test {

    // assume that we're driving in the car and want to
    // use our usb cable to charge our smartphone there
    public static void main(String[] args) {

        AutomobileElectricity citroen = new CitroenElectricity();

        USBElectricity usbCharger = new UsbCableCharger();
        AutomobileElectricity usbChargerAdapter = new UsbCableChargerAdapter(usbCharger);

        usbCharger.charge();
        citroen.plugIntoAutomobileSocket();
        usbChargerAdapter.plugIntoAutomobileSocket();

    }
}
