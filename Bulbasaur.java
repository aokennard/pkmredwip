import java.util.*;


public class Bulbasaur extends Pokemon
{
  protected static ArrayList<String> bulbasaurMoves = new ArrayList<String>()
  {{
    add("1-Tackle");
    add("1-Growl");
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
    add("HM-Cut");
  }};
  public Bulbasaur()
  {
    super("Bulbasaur");
  }
  public Bulbasaur(int level,ArrayList<Move> moveset)
  {
    super("Bulbasaur", 2.04, 15.2, "A strange seed was planted on its back at birth. The plant sprouts and grows with this pokemon.", 001, Pokemon.getParticularType(4) + Pokemon.getParticularType(7), level, moveset,bulbasaurMoves);
  }
  public static void main(String [] args)
  {
    Move tackle = new Tackle();
    ArrayList<Move> bulMoves = new ArrayList<Move>();
    bulMoves.add(tackle);
    Bulbasaur starter = new Bulbasaur(5,bulMoves);
    System.out.println(starter.getMoves());
  }
  
}