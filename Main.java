

public class Main {
    public static void main(String[] args){
        Roller flitzer = new Roller(8.4,2352,5.2);
        Roller roller2 = new Roller(10, 11, 1.0);
        Besitzer paul = new Besitzer(50.0, "Paul", flitzer);
        Besitzer tim = new Besitzer(50, "Tim", roller2);
        System.out.println("Aktueller Kilometerstand: " + flitzer.getKilometerstand() + " und aktuelle Tankinhalt: " + flitzer.getTankinhalt());
        paul.FahreDeinenRoller(10); 
        tim.tankeDeinenRoller(roller2.getTankGroesse() - roller2.getTankinhalt());
        tim.FahreDeinenRoller(10);

    }
}