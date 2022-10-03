package ClasePadre;

public class SmartDevice {

    //1.Atributos

   protected static String fabricante;
    protected String Modelo;
    protected int year;
    protected String os;
    protected int memoria;
    protected int RAM;
    protected boolean bluetooth;
    protected boolean Wifi;
    protected boolean GPS;
    protected boolean llamadas;
    protected boolean SMS;
    protected boolean email;

    //2. Constructores

    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, int year, String os, int memoria, int RAM, boolean bluetooth, boolean wifi, boolean GPS, boolean llamadas, boolean SMS, boolean email) {
        this.fabricante = fabricante;
        Modelo = modelo;
        this.year = year;
        this.os = os;
        this.memoria = memoria;
        this.RAM = RAM;
        this.bluetooth = bluetooth;
        Wifi = wifi;
        this.GPS = GPS;
        this.llamadas = llamadas;
        this.SMS = SMS;
        this.email = email;
    }
}
