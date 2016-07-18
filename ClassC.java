
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
   */ 
  //Go with Inches
  public static String getPokemonHeight (String pokemonName) throws Exception
  {
    ArrayList<String> data = new ArrayList<String>();
    String url = "http://bulbapedia.bulbagarden.net/wiki/"+pokemonName+"_(Pok%C3%A9mon)";
        Document doc = Jsoup.connect(url).get();
    for (Element table : doc.select("td:contains(Height)")) 
    {
        for (Element row : table.select("tr")) 
        {
            Elements td = row.select("td");
            data.add(td.text());
        }
    }
    return data.get(0);
  }

    

  //Have html parser return string list in "add(Move."+mvname+"("+mvlvl+));"

  
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
      + "public "+name+"(int level,ArrayList<Move> moveset,Stats "+name+"Stats,int xp, double genRatio, String gender, String debuff, int ev) { " + 
    "super("+"\""+name+"\""+","+height+", "+weight+", "+"\""+description+"\""+", "+pkmid+", Pokemon.getParticularType("+"\""+pkmtype+"\""+"), level, moveset,"+name+"Moves,xp,"+name+"Stats, Stats.getPokemonStat("+"\""+name+"\""+"), genRatio, gender, debuff, ev);"+
    " } " + " public static void main(String [] args)" + " { } " + " } ";
  }
  public static void main(String [] args) throws Exception
  {
    System.out.println(getPokemonMoveset("Mewtwo"));
  }
  
}