import java.util.*;


public class Bulbasaur extends Pokemon
{
  protected static ArrayList<Move> bulbasaurMoves = new ArrayList<Move>()
  {{
    add(Move.tackle(1));
   
  }};
  
  public Bulbasaur()
  {
    super("Bulbasaur");
  }
  public Bulbasaur(int level,ArrayList<Move> moveset,Stats bulbaStats,int xp)
  {
    super("Bulbasaur", 2.04, 15.2, "A strange seed was planted on its back at birth. The plant sprouts and grows with this pokemon.", 001, Pokemon.getParticularType("Grass/Poison"), level, moveset,bulbasaurMoves,xp,bulbaStats, Stats.getPokemonStat("Bulbasaur"));
  }
  public static void main(String [] args)
  {
    Move tackle = Move.tackle(1);
    ArrayList<Move> bulMoves = new ArrayList<Move>();
    bulMoves.add(tackle);
    Stats bulS = new Stats(10,11,13,14,15);
    Bulbasaur starter = new Bulbasaur(5,bulMoves,bulS,0);
    System.out.println(starter.getMoves());
    
  }
  
}