package ClasePadre;

import ClasesHijas.SmartPhone;
import ClasesHijas.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone Iphone = new SmartPhone();
        Iphone.fabricante = "Apple";

        System.out.println(Iphone.fabricante);


        SmartWatch Galaxy = new SmartWatch();
        Galaxy.fabricante = "Samsung";

        System.out.println(Galaxy.fabricante);

    }
}