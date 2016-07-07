import java.util.*;

public class Pokemon 
{
  protected double pokemonHeight;
  protected double pokemonWeight;
  protected String pokemonDescription;
  protected String pokemonName;
  protected int pokemonIDNum;
  protected String pokemonType;
  protected int pokemonCurrentLevel;
  protected int pokemonCurrentXP;
  protected ArrayList<Move> pokemonMoves; //What moves a pokemon CURRENTLY has
  protected ArrayList<Move> learnableDataset; //All possible learnable moves
  protected Stats pokemonStats;
  protected Stats pokemonBaseStats;
  protected double pokemonGenderRatio;
  protected String pokemonGender;
  protected int pokemonMaximumLevel = 100;
  protected int pokemonMaximumMoves = 4;
  public static String[] types = {"Normal","Fire","Water","Electric","Grass","Ice","Fighting", "Poison","Ground","Flying","Psychic","Bug","Rock","Ghost","Dragon","Grass/Poison","Fire/Flying","Bug/Flying","Bug/Poison","Normal/Flying","Poison/Ground","Poison/Flying","Water/Fighting","Water/Poison","Rock/Ground","Water/Psychic","Bug/Grass","Water/Ice","Ghost/Poison","Grass/Psychic","Bug/Flying","Ice/Psychic","Water/Flying","Rock/Water","Ice/Flying","Electric/Flying","Dragon/Flying"};
  public static String pokemonStringA = Stats.basestats.replaceAll("[0-9]","");
  public static String pokemonStringB = pokemonStringA.replaceAll(" ","");
  public static String pokemonStringC = pokemonStringB.replaceAll("\\.","");
  public static String[] allPokemon = pokemonStringC.split("(?=[A-Z])");

  
  public Pokemon(String name)
  {
    pokemonName = name;
  }
  
  
  
  public Pokemon(String name, double height, double weight, String desc, int idnum, String type, int currlevel,ArrayList<Move> set,ArrayList<Move> learnableSet, int currXP, Stats currstats, Stats basestats, double genderRatio, String gender)
  {
    pokemonName = name;
    pokemonHeight = height;
    pokemonWeight = weight;
    pokemonDescription = desc;
    pokemonIDNum = idnum;
    pokemonType = type;
    pokemonCurrentLevel = currlevel;
    pokemonMoves = set;
    learnableDataset = learnableSet;
    pokemonCurrentXP = currXP;
    pokemonStats = currstats;
    pokemonGenderRatio = genderRatio;
    pokemonBaseStats = basestats;
    pokemonGender = gender;
  }
  public static int getParticularTypeIndex(String n)
  {
    for(String i : types)
    {
      if(i.equals(n))
      {
        return Arrays.asList(types).indexOf(i);
      }
    }
    return -1;
  }
  public static String getParticularType(String s)
  {
    return types[getParticularTypeIndex(s)];
  }
  public double getGenderRatio()
  {
	  return pokemonGenderRatio;
  }
  public String getGender()
  {
	  return pokemonGender;
  }
  public ArrayList<Move> getMoves()
  {
    return pokemonMoves;
  }
  public String getType()
  {
    return pokemonType;
  }
  public String getName()
  {
    return pokemonName;
  }
  public double getHeight()
  {
    return pokemonHeight;
  }
  public double getWeight()
  {
    return pokemonWeight;
  }
  public String getDescription()
  {
    return pokemonDescription;
  }
  public int getIDNum()
  {
    return pokemonIDNum;
  }
  public int getLevel()
  {
    return pokemonCurrentLevel;
  }
  public ArrayList<Move> getLearnableMoves()
  {
    return learnableDataset;
  }
  public int getCurrentXP()
  {
    return pokemonCurrentXP;
  }
  public Stats getPokemonStats()
  {
    return pokemonStats;
  }
  public Stats getBasePkmnStats()
  {
    return pokemonBaseStats;
  }
  
  
}
  