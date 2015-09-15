package adapter;

/**
 * Created by Margo on 16.09.2015.
 */
public class UsbCableChargerAdapter implements AutomobileElectricity {

    private USBElectricity usbCableCharger;

    public UsbCableChargerAdapter(USBElectricity usbCableCharger) {
        this.usbCableCharger = usbCableCharger;
    }

    @Override
    public void plugIntoAutomobileSocket() {
        usbCableCharger.charge();
    }
}
