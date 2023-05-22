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
    kilometerstand = kilometerstand + strecke;
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
