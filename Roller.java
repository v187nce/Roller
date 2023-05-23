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
  public void fahre(int strecke){
    if (tankinhalt * 2 < strecke){
      System.out.println("Der Tank reicht nicht aus um diese Strecke zurückzulegen!");
      double ericspenis = tankinhalt*2;
      System.out.println("Die zurückgelegte Strecke beträgt " + ericspenis + " km und somit die neue Kilometeranzahl " + kilometerstand + ericspenis);
      return;
    } 
    if (tankinhalt < 0){
      System.out.println("Der Tank ist leer!");
      tankinhalt = 0;
      return;
  }
  kilometerstand = kilometerstand + strecke;
  tankinhalt = tankinhalt * 2 - strecke;
  System.out.println("Der neue Kilometerstand beträgt " + kilometerstand + " Kilometer und der Tankinhalt beträgt " + tankinhalt + " Liter");

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
