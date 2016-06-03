import java.util.*;


public class Bulbasaur extends Pokemon
{
  protected static ArrayList<Move> bulbasaurMoves = new ArrayList<Move>()
  {{
    add(Move.tackle(1));
   /* add("1-Growl");
    add("7-Leech Seed");
    add("13-Vine Whip");
    add("20-PoisonPowder");
    add("27-Razor Leaf");
    add("34-Growth");
    add("41-Sleep Powder");
    add("48-SolarBeam");
    add("TM-Swords Dance");
    add("TM-Toxic");
    add("TM-Body Slam");
    add("TM-Take Down");
    add("TM-Double-Edge");
    add("TM-Rage");
    add("TM-Mega Drain");
    add("TM-Mimic");
    add("TM-Double Team");
    add("TM-Reflect");
    add("TM-Bide");
    add("TM-Rest");
    add("TM-Substitute");
    add("HM-Cut"); */
  }};
  
  public Bulbasaur()
  {
    super("Bulbasaur");
  }
  public Bulbasaur(int level,ArrayList<Move> moveset,Stats bulbaStats)
  {
    super("Bulbasaur", 2.04, 15.2, "A strange seed was planted on its back at birth. The plant sprouts and grows with this pokemon.", 001, Pokemon.getParticularType("Grass/Poison"), level, moveset,bulbasaurMoves,0,bulbaStats, Stats.getPokemonStat("Bulbasaur"));
  }
  public static void main(String [] args)
  {
    Move tackle = Move.tackle(1);
    ArrayList<Move> bulMoves = new ArrayList<Move>();
    bulMoves.add(tackle);
    Stats bulS = new Stats(10,11,13,14,15);
    Bulbasaur starter = new Bulbasaur(5,bulMoves,bulS);
    System.out.println(starter.getMoves());
    
  }
  
}