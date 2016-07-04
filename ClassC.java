
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ClassC
{
  //"http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)/Generation_I_learnset#By_leveling_up"
  //"http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)"
  public static ArrayList<String> getPokemonMoveset (String pokemonName) throws Exception
  {
    ArrayList<String> moveset = new ArrayList<String>();
    String url = "http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)/Generation_I_learnset#By_leveling_up";
        Document doc = Jsoup.connect(url).get();
    for (Element table : doc.select("div#mw-content-text")) 
    {
        for (Element row : table.select("tr")) 
        {
            Elements td = row.select("td");
            moveset.add(td.text());
        }
    }
    return moveset;
  }
  /*
   * 011 Tackle Normal 03535 095}}95% 35
    (lvl1:ignore 01)
    (attackdmg35: ignore 035)
    (accuracy95: ignore 095}}
    
  
  public static ArrayList<String> getPokemonData (String pokemonName) throws Exception
  {
    ArrayList<String> data = new ArrayList<String>();
    String url = "http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)";
        Document doc = Jsoup.connect(url).get();
    for (Element table : doc.select("div#mw-content-text")) 
    {
        for (Element row : table.select("tr")) 
        {
            Elements td = row.select("td");
            data.add(td.text());
        }
    }
    return data;
  }

    
*/
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