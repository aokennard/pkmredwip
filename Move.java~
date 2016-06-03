import java.util.*;

public class Move 
{
  protected String moveName;
  protected String moveType;
  protected int movePower;
  protected double moveAccuracy;
  protected int movePP;
  protected int moveLearnLevel;
  protected String moveCategory; //physical or special
  
  public Move(String name,String type, int power, double accuracy, int PP, int level, String category)
  {
    moveName = name;
    moveType = type;
    movePower = power;
    moveAccuracy = accuracy;
    movePP = PP;
    moveLearnLevel = level;
    moveCategory = category;
    
  }
  public int getLearnLevel()
  {
    return moveLearnLevel;
  }
  public String getMoveCategory()
  {
    return moveCategory;
  }
  public String getMoveName()
  {
    return moveName;
  }
  public String getMoveType()
  {
    return moveType;
  }
  public int getMovePower()
  {
    return movePower;
  }
  public double getMoveAccuracy()
  {
    return moveAccuracy;
  }
  public int getMovePP()
  {
    return movePP;
  }
  public static double determineTypeEfficiency(Move m, Pokemon p)
  {
    double loweffect= 0.5;
    double normal = 1;
    double higheffect = 2;
    double veryhigheffect = 4;
    double noeffect = 0;
    double veryloweffect = 0.25;
    double[][] typechart = new double[15][37];
    for(int r = 0;r<14;r++)
    {
      for(int j = 0;j<36;j++)
      {
        typechart[r][j] = normal;
      }
    } //row = attackers, colum = defender
    typechart[0][12] = loweffect; //normal low on rock
    typechart[0][13] = noeffect;
    typechart[1][1] = loweffect;
    typechart[1][2] = loweffect;
    typechart[1][4] = higheffect;
    typechart[1][5] = higheffect;
    typechart[1][11] = higheffect;
    typechart[1][12] = loweffect;
    typechart[1][14] = loweffect;
    typechart[2][1] = higheffect; 
    typechart[2][2] = loweffect;
    typechart[2][4] = loweffect;
    typechart[2][8] = higheffect;
    typechart[2][12] = higheffect;
    typechart[2][14] = loweffect;
    typechart[3][2] = higheffect;
    typechart[3][3] = loweffect;
    typechart[3][4] = loweffect;
    typechart[3][8] = noeffect;
    typechart[3][9] = higheffect;
    typechart[3][14] = loweffect;
    typechart[4][1] = loweffect;
    typechart[4][2] = higheffect;
    typechart[4][4] = loweffect;
    typechart[4][7] = loweffect;
    typechart[4][8] = higheffect;
    typechart[4][9] = loweffect;
    typechart[4][11] = loweffect;
    typechart[4][12] = higheffect;
    typechart[4][14] = loweffect;
    typechart[5][2] = loweffect;
    typechart[5][4] = higheffect;
    typechart[5][5] = loweffect;
    typechart[5][8] = higheffect;
    typechart[5][9] = higheffect;
    typechart[5][14] = higheffect;
    typechart[6][0] = higheffect;
    typechart[6][5] = higheffect;
    typechart[6][7] = loweffect;
    typechart[6][9] = loweffect;
    typechart[6][10] = loweffect;
    typechart[6][11] = loweffect;
    typechart[6][12] = higheffect;
    typechart[6][13] = noeffect;
    typechart[7][4] = higheffect; 
    typechart[7][7] = loweffect;
    typechart[7][8] = loweffect;
    typechart[7][11] = higheffect;
    typechart[7][12] = loweffect;
    typechart[7][13] = loweffect;
    typechart[8][1] = higheffect; 
    typechart[8][3] = higheffect;
    typechart[8][4] = loweffect;
    typechart[8][7] = higheffect;
    typechart[8][9] = noeffect;
    typechart[8][11] = loweffect;
    typechart[8][12] = higheffect;
    typechart[9][3] = loweffect;
    typechart[9][4] = higheffect;
    typechart[9][6] = higheffect;
    typechart[9][11] = higheffect;
    typechart[9][12] = loweffect;
    typechart[10][6] = higheffect;
    typechart[10][7] = higheffect;
    typechart[10][10] = loweffect;
    typechart[11][1] = loweffect;
    typechart[11][4] = higheffect;
    typechart[11][6] = loweffect;
    typechart[11][7] = higheffect;
    typechart[11][9] = loweffect;
    typechart[11][10] = higheffect;
    typechart[12][1] = higheffect; 
    typechart[12][5] = higheffect;
    typechart[12][6] = loweffect;
    typechart[12][8] = loweffect;
    typechart[12][9] = higheffect;
    typechart[12][11] = higheffect;
    typechart[13][0] = noeffect;
    typechart[13][10] = higheffect;
    typechart[13][13] = higheffect;
    typechart[14][14] = higheffect;
    
    //-----Added Double-Types from Gen1
    
    typechart[1][15] = higheffect;
    typechart[2][15] = loweffect;
    typechart[3][15] = loweffect;
    typechart[4][15] = veryloweffect;
    typechart[5][15] = higheffect;
    typechart[6][15] = loweffect;
    typechart[9][15] = higheffect;
    typechart[10][15] = higheffect;
    typechart[1][16] = loweffect;
    typechart[2][16] = higheffect;
    typechart[3][16] = higheffect;
    typechart[4][16] = veryloweffect;
    typechart[6][16] = loweffect;
    typechart[8][16] = noeffect;
    typechart[11][16] = veryloweffect;
    typechart[12][16] = veryhigheffect;
    typechart[1][17] = higheffect;
    typechart[3][17] = higheffect;
    typechart[4][17] = veryloweffect;
    typechart[6][17] = higheffect;
    typechart[7][17] = veryloweffect;
    typechart[9][17] = noeffect;
    typechart[10][17] = higheffect;
    typechart[12][17] = loweffect;
    typechart[13][17] = veryhigheffect;
    typechart[1][18] = higheffect;
    typechart[4][18] = veryloweffect;
    typechart[6][18] = veryloweffect;
    typechart[7][18] = loweffect;
    typechart[9][18] = higheffect;
    typechart[10][18] = higheffect;
    typechart[11][18] = loweffect;
    typechart[12][18] = higheffect;
    typechart[3][19] = higheffect;
    typechart[4][19] = loweffect;
    typechart[5][19] = higheffect;
    typechart[8][19] = noeffect;
    typechart[11][19] = loweffect;
    typechart[12][19] = higheffect;
    typechart[13][19] = noeffect;
    typechart[2][20] = higheffect;
    typechart[3][20] = noeffect;
    typechart[5][20] = higheffect;
    typechart[6][20] = loweffect;
    typechart[7][20] = veryloweffect;
    typechart[8][20] = higheffect;
    typechart[10][20] = higheffect;
    typechart[11][20] = loweffect;
    typechart[12][20] = loweffect;
    typechart[3][21] = higheffect;
    typechart[4][21] = veryloweffect;
    typechart[5][21] = higheffect;
    typechart[6][21] = veryloweffect;
    typechart[7][21] = loweffect;
    typechart[8][21] = noeffect;
    typechart[10][21] = higheffect;
    typechart[11][21] = veryloweffect;
    typechart[12][21] = higheffect;
    typechart[1][22] = loweffect;
    typechart[2][22] = loweffect;
    typechart[3][22] = higheffect;
    typechart[4][22] = higheffect;
    typechart[5][22] = loweffect;
    typechart[9][22] = higheffect;
    typechart[10][22] = higheffect;
    typechart[11][22] = loweffect;
    typechart[12][22] = loweffect;
    typechart[1][23] = loweffect;
    typechart[2][23] = loweffect;
    typechart[3][23] = higheffect;
    typechart[5][23] = loweffect;
    typechart[6][23] = loweffect;
    typechart[7][23] = loweffect;
    typechart[8][23] = higheffect;
    typechart[10][23] = higheffect;
    typechart[11][23] = loweffect;
    typechart[0][24] = loweffect;
    typechart[1][24] = loweffect;
    typechart[2][24] = veryhigheffect;
    typechart[3][24] = noeffect;
    typechart[4][24] = veryhigheffect;
    typechart[5][24] = higheffect;
    typechart[6][24] = higheffect;
    typechart[7][24] = veryloweffect;
    typechart[8][24] = higheffect;
    typechart[9][24] = loweffect;
    typechart[12][24] = loweffect;
    typechart[1][25] = loweffect;
    typechart[2][25] = loweffect;
    typechart[3][25] = higheffect;
    typechart[4][25] = higheffect;
    typechart[5][25] = loweffect;
    typechart[6][25] = loweffect;
    typechart[10][25] = loweffect;
    typechart[11][25] = higheffect;
    typechart[13][25] = higheffect;
    typechart[1][26] = veryhigheffect;
    typechart[2][26] = loweffect;
    typechart[3][26] = loweffect;
    typechart[4][26] = veryloweffect;
    typechart[5][26] = higheffect;
    typechart[6][26] = loweffect;
    typechart[7][26] = higheffect;
    typechart[8][26] = veryloweffect;
    typechart[9][26] = veryhigheffect;
    typechart[11][26] = higheffect;
    typechart[12][26] = higheffect;
    typechart[2][27] = loweffect;
    typechart[3][27] = higheffect;
    typechart[4][27] = higheffect;
    typechart[5][27] = veryloweffect;
    typechart[6][27] = higheffect;
    typechart[12][27] = higheffect;
    typechart[0][28] = noeffect;
    typechart[4][28] = loweffect;
    typechart[6][28] = noeffect;
    typechart[7][28] = veryloweffect;
    typechart[8][28] = higheffect;
    typechart[10][28] = higheffect;
    typechart[11][28] = veryloweffect;
    typechart[13][28] = higheffect;
    typechart[1][29] = higheffect;
    typechart[2][29] = loweffect;
    typechart[3][29] = loweffect;
    typechart[4][29] = loweffect;
    typechart[5][29] = higheffect;
    typechart[6][29] = loweffect;
    typechart[7][29] = higheffect;
    typechart[8][29] = loweffect;
    typechart[9][29] = higheffect;
    typechart[10][29] = loweffect;
    typechart[11][29] = veryhigheffect;
    typechart[13][29] = higheffect;
    typechart[1][30] = higheffect;
    typechart[3][30] = higheffect;
    typechart[4][30] = veryloweffect;
    typechart[5][30] = higheffect;
    typechart[6][30] = veryloweffect;
    typechart[8][30] = noeffect;
    typechart[9][30] = higheffect;
    typechart[11][30] = loweffect;
    typechart[12][30] = veryhigheffect;
    typechart[1][31] = higheffect;
    typechart[5][31] = loweffect;
    typechart[10][31] = loweffect;
    typechart[11][31] = higheffect;
    typechart[12][31] = higheffect;
    typechart[13][31] = higheffect;
    typechart[1][32] = loweffect;
    typechart[2][32] = loweffect;
    typechart[3][32] = veryhigheffect;
    typechart[6][32] = loweffect;
    typechart[8][32] = noeffect;
    typechart[11][32] = loweffect;
    typechart[12][32] = higheffect;
    typechart[0][33] = loweffect;
    typechart[1][33] = veryloweffect;
    typechart[3][33] = higheffect;
    typechart[4][33] = veryhigheffect;
    typechart[5][33] = loweffect;
    typechart[6][33] = higheffect;
    typechart[7][33] = loweffect;
    typechart[8][33] = higheffect;
    typechart[9][33] = loweffect;
    typechart[1][34] = higheffect;
    typechart[3][34] = higheffect;
    typechart[4][34] = loweffect;
    typechart[8][34] = noeffect;
    typechart[11][34] = loweffect;
    typechart[12][34] = veryhigheffect;
    typechart[4][35] = loweffect;
    typechart[5][35] = higheffect;
    typechart[6][35] = loweffect;
    typechart[8][35] = noeffect;
    typechart[9][35] = loweffect;
    typechart[11][35] = loweffect;
    typechart[12][35] = higheffect;
    typechart[1][36] = loweffect;
    typechart[2][36] = loweffect;
    typechart[4][36] = veryloweffect;
    typechart[5][36] = veryhigheffect;
    typechart[6][36] = loweffect;
    typechart[8][36] = noeffect;
    typechart[11][36] = loweffect;
    typechart[12][36] = higheffect;
    typechart[14][36] = higheffect;
    //solid time usage
    
    
    
    
    
    
    
    
    
    
    
    
    String mType = m.getMoveType();
    String pType = p.getType();
    int mIndex = Pokemon.getParticularTypeIndex(mType);
    int pIndex = Pokemon.getParticularTypeIndex(pType);
    //String mT = Pokemon.getParticularType(mIndex);
    //String pT = Pokemon.getParticularType(pIndex);
    return typechart[mIndex][pIndex];
  }
  
  public static Move tackle(int level)
  {
    return new Move("Tackle",Pokemon.getParticularType("Normal"), 35, 0.95, 35,level,"Physical"); //no effect
  }
  public static Move absorb(int level)
  {
    return new Move("Absorb",Pokemon.getParticularType("Grass"), 20, 1, 25, level, "Special"); 
  }
  public static Move acid(int level)
  {
    return new Move("Acid",Pokemon.getParticularType("Poison"), 40, 1, 30, level, "Special"); 
  }
  public static Move acidArmor(int level)
  {
    return new Move("Acid Armor",Pokemon.getParticularType("Poison"), 0, 1, 20, level, "Status");
  }
  public static Move agility(int level)
  {
    return new Move("Agility", Pokemon.getParticularType("Psychic"),0,1,30,level, "Status"); 
  }
  public static Move amnesia(int level)
  {
    return new Move("Amnesia", Pokemon.getParticularType("Psychic"),0,1,20,level,"Status"); 
  }
  public static Move auroraBeam(int level)
  {
    return new Move("Aurora Beam", Pokemon.getParticularType("Ice"),65,1,20,level,"Special"); 
  }
  public static Move barrage(int level)
  {
    return new Move("Barrage",Pokemon.getParticularType("Normal"),15,85,20,level,"Physical");
  }
  public static Move barrier(int level)
  {
    return new Move("Barrier",Pokemon.getParticularType("Psychic"),0,1,20,level,"Status");
  }
  public static Move bide(int level)
  {
    return new Move("Bide",Pokemon.getParticularType("Normal"),0,1,10,level,"Physical");
  }
  public static Move bind(int level)
  {
    return new Move("Bind",Pokemon.getParticularType("Normal"),15,.85,20,level,"Physical");
  }
  public static Move bite(int level)
  {
    return new Move("Bite",Pokemon.getParticularType("Normal"),60,1,25,level,"Physical");
  }
  public static Move blizzard(int level)
  {
    return new Move("Blizzard",Pokemon.getParticularType("Ice"),110,.7,5,level,"Special");
  }
  public static Move bodySlam(int level)
  {
    return new Move("Body Slam",Pokemon.getParticularType("Normal"),85,1,15,level,"Physical");
  }
  public static Move boneClub(int level)
  {
    return new Move("Bone Club",Pokemon.getParticularType("Ground"),65,.85,20,level,"Physical");
  }
  //this is the point where i realized my error.
  public static Move bonemerang(int level)
  {
    return new Move("Bonemerang","Ground",50,.9,10,level,"Physical");
  }
  public static Move bubble(int level)
  {
    return new Move("Bubble","Water",40,1,30,level,"Special");
  }
  public static Move bubbleBeam(int level)
  {
    return new Move("BubbleBeam","Water",65,1,20,level,"Special");
  }
  public static Move clamp(int level)
  {
    return new Move("Clamp","Water",35,.85,10,level,"Physical");
  }
  public static Move cometPunch(int level)
  {
    return new Move("Comet Punch","Normal",18,.85,15,level,"Physical");
  }
  public static Move confuseRay(int level)
  {
    return new Move("Confuse Ray","Ghost",0,1,10,level,"Status");
  }
  public static Move confusion(int level)
  {
    return new Move("Confusion","Psychic",50,1,25,level,"Special");
  }
  public static Move constrict(int level)
  {
    return new Move("Constrict","Normal",10,1,35,level,"Physical");
  }
  public static Move conversion(int level)
  {
    return new Move("Conversion","Normal",0,1,30,level,"Status");
  }
  public static Move counter(int level)
  {
    return new Move("Counter","Fighting",0,1,20,level,"Physical");
  }
  public static Move crabHammer(int level)
  {
    return new Move("Crab Hammer","Water", 100, .9, 10, level, "Physical");
  }
  public static Move cut(int level)
  {
    return new Move("Cut","Normal",50,.95,30,level,"Physical");
  }
  public static Move defenseCurl(int level)
  {
    return new Move("Defense Curl","Normal",0,1,40,level,"Status");
  }
  public static Move dig(int level)
  {
    return new Move("Dig","Ground",100,1,10,level,"Physical");
  }
  public static Move disable(int level)
  {
    return new Move("Disable","Normal",0,.55,20,level,"Status");
  }
  public static Move dizzyPunch(int level)
  {
    return new Move("Dizzy Punch","Normal",70,1,10,level,"Physical");
  }
  public static Move doubleKick(int level)
  {
    return new Move("Double Kick","Fighting",30,1,30,level,"Physical");
  }
  public static Move doubleSlap(int level)
  {
    return new Move("Double Slap","Normal",15,.85,10,level,"Physical");
  }
  public static Move doubleTeam(int level)
  {
    return new Move("Double Team","Normal",0,1,15,level,"Status");
  }
  
  
  
  
  
  
  public static void main(String [] args)
  {
    ArrayList<Move> mB = new ArrayList<Move>();
    Tackle t = new Tackle(1);
    Move m = new Move("FireBlast",Pokemon.getParticularType("Fire"), 95, .1, 5, 10, "Physical");
    mB.add(t);
    Bulbasaur b = new Bulbasaur(5,mB,Bulbasaur.bulbaBaseStats);
    System.out.print(determineTypeEfficiency(m,b));
  } 
    
}