import java.util.*;

public class Move 
{
  protected String moveName;
  protected String moveType;
  protected int movePower;
  protected double moveAccuracy;
  protected int movePP;
  protected String moveCategory; //physical or special
  
  public Move(String name,String type, int power, double accuracy, int PP, String category)
  {
    moveName = name;
    moveType = type;
    movePower = power;
    moveAccuracy = accuracy;
    movePP = PP;
    moveCategory = category;
    
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
    double noeffect = 0;
    double[][] typechart = new double[14][14];
    for(int r = 0;r<=14;r++)
    {
      for(int j = 0;j<=14;j++)
      {
        typechart[r][j] = normal;
      }
    }
    typechart[0][12] = loweffect;
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
    
    String mType = m.getMoveType();
    String pType = p.getType();
    int mIndex = Pokemon.getParticularTypeIndex(mType);
    int pIndex = Pokemon.getParticularTypeIndex(pType);
    //String mT = Pokemon.getParticularType(mIndex);
    //String pT = Pokemon.getParticularType(pIndex);
    return typechart[mIndex][pIndex];
  }
    
}