package ClasesHijas;

import ClasePadre.SmartDevice;

public class SmartPhone extends SmartDevice {

    String LectorSim;

    public SmartPhone() {
    }


    public SmartPhone(String fabricante, String modelo, int year, String os, int memoria, int RAM, boolean bluetooth, boolean wifi, boolean GPS, boolean llamadas, boolean SMS, boolean email, String lectorSim) {
        super(fabricante, modelo, year, os, memoria, RAM, bluetooth, wifi, GPS, llamadas, SMS, email);
        this.LectorSim = lectorSim;
    }
}
