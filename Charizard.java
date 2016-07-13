import java.util.*;
public class Charizard extends Pokemon { 
  protected static ArrayList<Move> CharizardMoves = new ArrayList<Move>() 
  {{
    add(Move.tackle(1)); 
    
  }};
  public Charizard() 
  { 
    super("Charizard"); 
  }
  public Charizard(int level,ArrayList<Move> moveset,Stats CharizardStats,int xp) 
  { 
    super("Charizard",4.5, 1.2, "yo test desc", 6, Pokemon.getParticularType("Fire/Flying"), level, moveset,CharizardMoves,xp,CharizardStats, Stats.getPokemonStat("Charizard")); 
  } 
  public static void main(String [] args) 
  { 
  }  
} 