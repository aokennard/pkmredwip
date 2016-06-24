
import java.util.*;


public class ClassC
{
  
  /*
   * This class is intended to create all 151 pokemon red classes by obtaining info from bulbapedia, via JSoup.
   * current WIP: trying to get the info from tables
   * 
   * 
   moveset string - "http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)/Generation_I_learnset#By_leveling_up"
   
   Format of html on site:
      learnables- table class roundy/tbody/tr/td/table class sortable jquery/tbody/tr/*
      hm/tm- table class center/tbody/*(tr)
   
   pokemon string - "http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)"
   
   Format of html on site:
      type- table class roundy/tbody/tr(2nd)/td class roundy/table class roundy/tbody/tr/td/table/tbody/tr/td/href
      pkmid- table class roundy/tbody/tr/td/table class roundy/tbody/tr/th roundy/big/big/href/span
      weight/height- same tr near type
      desc- a few down, table class roundy/tbody/tr/td/table class roundy/tbody/tr(2nd)/td roundytr/table class roundy/tbody/tr/td roundy/
 
  public static ArrayList<String> getPokemonMoveset (String pokemonName)
   {
     String website = "http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)/Generation_I_learnset#By_leveling_up";
     
   for loop through website's tables, make temp vars mvname, mvlvl.
   Have function return strings in a list of format "add(Move."+mvname+"("+mvlvl+"));"
   }
   
  */
  
  
  public static String createPkmClass(String name,ArrayList<String> moves,double height,double weight,String description,int pkmid,String pkmtype)
  {
    String movestring = "";
    for(int i=0;i<moves.size();i++)
    {
      movestring += moves.get(i)+ " ";
    }
    return "import java.util.*; " + "public class " + name + " extends Pokemon { " +
  "protected static ArrayList<Move> "+name+"Moves = new ArrayList<Move>() {{" +
      movestring + "}};" + "public "+name+"()"+ " { super("+"\""+name+"\""+"); }"
      + "public "+name+"(int level,ArrayList<Move> moveset,Stats "+name+"Stats,int xp) { " + 
    "super("+"\""+name+"\""+","+height+", "+weight+", "+"\""+description+"\""+", "+pkmid+", Pokemon.getParticularType("+"\""+pkmtype+"\""+"), level, moveset,"+name+"Moves,xp,"+name+"Stats, Stats.getPokemonStat("+"\""+name+"\""+"));"+
    " } " + " public static void main(String [] args)" + " { } " + " } ";
  }
}