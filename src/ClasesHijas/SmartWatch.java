package ClasesHijas;

import ClasePadre.SmartDevice;

public class SmartWatch extends SmartDevice {

    String materialCaja;

    public SmartWatch() {
    }


    public SmartWatch(String fabricante, String modelo, int year, String os, int memoria, int RAM, boolean bluetooth, boolean wifi, boolean GPS, boolean llamadas, boolean SMS, boolean email, String materialCaja) {
        super(fabricante, modelo, year, os, memoria, RAM, bluetooth, wifi, GPS, llamadas, SMS, email);
        this.materialCaja = materialCaja;
    }
}
