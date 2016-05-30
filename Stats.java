public class Stats
{
  protected int healthStat;
  protected int attackStat;
  protected int defenseStat;
  protected int speedStat;
  protected int specialStat;
  
  public Stats(int hp, int attack, int defense, int speed, int spec)
  {
    healthStat = hp;
    attackStat = attack;
    defenseStat = defense;
    speedStat = speed;
    specialStat = spec;
  }
  
  public int getHP()
  {
    return healthStat;
  }
  public int getAttack()
  {
    return attackStat;
  }
  public int getDefense()
  {
    return defenseStat;
  }
  public int getSpeed()
  {
    return speedStat;
  }
  public int getSpecial()
  {
    return specialStat;
  }
}
    