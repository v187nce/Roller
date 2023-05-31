public class Roller{
  private double tankgroesse;
  private int kilometerstand;
  private double tankinhalt;
  
  public Roller(double tankgroesse, int kilometerstand, double tankinhalt){
    this.tankgroesse = tankgroesse;
    this.kilometerstand = kilometerstand;
    this.tankinhalt = tankinhalt;
  }
  
  public void tanke(double menge){
    tankinhalt = tankinhalt + menge;
  }
  public double getTankGroesse(){
    return tankgroesse;
  }
  public void fahre(int strecke){
    if (tankinhalt < strecke * 2){
      System.out.println("Der Tank reicht nicht aus um diese Strecke zurückzulegen!");
      double ok = tankinhalt*2;
      System.out.println("Die zurückgelegte Strecke beträgt " + ok + " km und somit die neue Kilometeranzahl " + kilometerstand + ericspenis);
      System.out.println("Der Tank ist nun leer!");
      return;
    } else if (tankinhalt < 0){
      System.out.println("Der Tank ist leer!");
      tankinhalt = 0; 
      return; 
    } else {
      kilometerstand = kilometerstand + strecke; 
      tankinhalt = tankinhalt - strecke * 2; 
      System.out.println("Der neue Kilometerstand beträgt " + kilometerstand + " Kilometer und der Tankinhalt beträgt " + tankinhalt + " Liter");
  }

}
  public boolean passtInTank(double menge){
    if (tankgroesse < tankinhalt + menge){
      return false;
    }
    return true;
  }
  public double getTankinhalt(){
    return tankinhalt;
  }
  public int getKilometerstand(){
    return kilometerstand;
  }
}
