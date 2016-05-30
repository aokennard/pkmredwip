public class Tackle extends Move
{
  public Tackle(int level)
  {
    super("Tackle",Pokemon.getParticularType(0), 35, 0.95, 35,level,"Physical");
  }
}