import java.util.*;


public class Ivysaur extends Pokemon
{
  protected static ArrayList<Move> ivysaurMoves = new ArrayList<Move>()
  {{
    add(Move.tackle(1));
  /*add(Move.growl(1));
    add(Move.leechSeed(1));
    add(Move.vineWhip(13));
    add(Move.poisonPowder(22));
    add(Move.razorLeaf(30));
    add(Move.growth(38));
    add(Move.sleepPowder(46));
    add(Move.solarBeam(54));
    add(Move.swordsDance(0));
    add(Move.toxic(0));
    add(Move.bodySlam(0));
    add(Move.takeDown(0));
    add(Move.doubleEdge(0));
    add(Move.rage(0));
    add(Move.megaDrain(0));
    add(Move.solarBeam(0));
    add(Move.mimic(0));
    add(Move.doubleTeam(0));
    add(Move.reflect(0));
    add(Move.bide(0));
    add(Move.rest(0));
    add(Move.substitute(0));
    add(Move.cut(0)); */
  }};
  
  public Ivysaur()
  {
    super("Ivysaur");
  }
  public Ivysaur(int level,ArrayList<Move> moveset,Stats ivyStats)
  {
    super("Ivysaur", 3.03, 27.8, "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.", 002, Pokemon.getParticularType("Grass/Poison"), level, moveset,ivysaurMoves,0,ivyStats, Stats.getPokemonStat("Ivysaur"));
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