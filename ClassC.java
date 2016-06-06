
import java.util.*;


public class ClassC
{

  //Have html parser return string list in "add(Move."+mvname+"("+mvlvl+));"
  public static String createPkmClass(String name,ArrayList<String> moves,double height,double weight,String description,int pkmid,String pkmtype)
  {
    String movestring = "";
    for(int i=0;i<moves.size();i++)
    {
      movestring += moves.get(i)+ " ";
    }
    return "import java.util.*; " + "public class " + name + " extends Pokemon { " +
  "protected static ArrayList<Move> "+name+"Moves = new ArrayList<Move>(); {{" +
      movestring + "}};" + "public "+name+"()"+ " { super("+name+"); }"
      + "public "+name+"(int level,ArrayList<Move> moveset,Stats "+name+"Stats,int xp) { " + 
    "super("+name+","+height+", "+weight+", "+description+", "+pkmid+", Pokemon.getParticularType("+pkmtype+"), level, moveset,"+name+"Moves,xp,"+name+"Stats, Stats.getPokemonStat("+name+"));"+
    " } " + " public static void main(String [] args)" + " { } " + " } ";
  }
}