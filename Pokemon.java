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
  protected ArrayList<String> learnableDataset; //All possible learnable moves
  public static String[] types = {"Normal","Fire","Water","Electric","Grass","Ice","Fighting", "Poison","Ground","Flying","Psychic","Bug","Rock","Ghost","Dragon","Grass/Poison","Fire/Flying","Bug/Flying","Bug/Poison","Normal/Flying","Poison/Ground","Poison/Flying","Water/Fighting","Water/Poison","Rock/Ground","Water/Psychic","Bug/Grass","Water/Ice","Ghost/Poison","Grass/Psychic","Bug/Flying","Ice/Psychic","Water/Flying","Rock/Water","Ice/Flying","Electric/Flying","Dragon/Flying"};
  
  
  private int pokemonMaximumLevel = 100;
  private int pokemonMaximumMoves = 4;
  
  public Pokemon(String name)
  {
    pokemonName = name;
  }
  
  
  public Pokemon(String name, double height, double weight, String desc, int idnum, String type, int currlevel,ArrayList<Move> set,ArrayList<String> learnableSet, int currXP)
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
  public static String getParticularType(int index)
  {
    return types[index];
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
  public ArrayList<String> getLearnableMoves()
  {
    return learnableDataset;
  }
  public int getCurrentXP()
  {
    return pokemonCurrentXP;
  }
  
  
}
  