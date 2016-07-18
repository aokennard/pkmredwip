import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class EncounterRates
{
  /* Class intended to keep track of encounter data on pokemon based on route, type of pokemon, tile, and level range.
   * Probably accomplished by an arraylist output function by route, taken from bulbapedia HTML tables.
   */
  
  protected String tile;
  protected Pokemon pokemonEncounter;
  protected String levelRange;
  
  public EncounterRates(Pokemon p, String t, String range)
  {
    pokemonEncounter = p;
    tile = t;
    levelRange = range;
  }
  //Of format Route_Number
  public static ArrayList<String> obtainRouteData(String route) throws Exception //LOL I'M SCUM
  {
    ArrayList<EncounterRates> routeEncounters = new ArrayList<EncounterRates>();
    ArrayList<String> testOutput = new ArrayList<String>();
    
    String url = "http://bulbapedia.bulbagarden.net/wiki/Kanto_"+route;
    Document doc = Jsoup.connect(url).get();
    for (Element table : doc.select("table:contains(Generation I)")) //output next table when it finds this.
    {
        for (Element row : table.select("tr")) 
        {
            Elements td = row.select("td");
            testOutput.add(td.text());
        }
    }
    return testOutput;
  }
  
  public Pokemon getPokeEncounter()
  {
    return pokemonEncounter;
  }
  public String getEncounterTile()
  {
    return tile;
  }
  public String getLevelRange()
  {
    return levelRange;
  }
  public static void main(String [] args) throws Exception
  {
    System.out.println(obtainRouteData("Route_1"));
  }
}