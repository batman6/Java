/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labprogram7_1;

/**
 *
 * @author Monish De
 */
class Ship {

    String shipName;
    String year;

    Ship(String shipName, String year) {
        this.shipName = shipName;
        this.year = year;
    }

    void print() {
        System.out.println("Name of the Ship is " + shipName);
        System.out.println("Year of manufactured in " + year);
    }
}

class CruiseShip extends Ship {

    int maxpassenger;

    CruiseShip(String shipName, String year, int maxpassenger) {
        super(shipName, year);
        this.maxpassenger = maxpassenger;
    }

    @Override
    void print() {
        System.out.println("Name of the Cruise Ship is " + shipName);
        System.out.println("Maximum Capacity of Passengers are " + maxpassenger);
    }
}

class CargoShip extends Ship {

    int cargocapacity;

    CargoShip(String shipName, String year, int cargocapacity) {
        super(shipName, year);
        this.cargocapacity = cargocapacity;
    }

    @Override
    void print() {
        System.out.println("Name of the Cargo Ship is " + shipName);
        System.out.println("Maximum Capacity of Cargo are " + cargocapacity + " TEU");
    }

}

public class LabProgram7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CruiseShip cs = new CruiseShip("RMS Titanic","1909",3327);
        CargoShip cargoShip = new CargoShip("MSC Cargo","2015",19224);
        cs.print();
        cargoShip.print();
        // TODO code application logic here
    }

}
