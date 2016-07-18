import java.util.*;

public class Stats
{
  protected int healthStat;
  protected int attackStat;
  protected int defenseStat;
  protected int speedStat;
  protected int specialStat;
  
 
  public Stats(int hp, int attack, int defense, int speed, int spec)
  {
    healthStat = hp;
    attackStat = attack;
    defenseStat = defense;
    speedStat = speed;
    specialStat = spec;
  }
  /*IV's are determined by 0-15 dice roll, 4 ivs per poke
  EV's are obtained through battle. Defeated pokemons base stats are added to EV's for each stat. Many pokemon 
  have Base EV's to be scraped later.
  
  
  quick ref for calculation error : 
  Bulbasaur
  HP: 21 / ATK: 11 / DEF: 11 / SPE: 11 / SPC: 13

  Charmander
  HP: 20 / ATK: 11 / DEF: 10 / SPE: 13 / SPC: 11

  Squirtle
  HP: 20 / ATK: 11 / DEF: 13 / SPE: 10 / SPC: 11

  Stat formula = 5 + ( (basestat+IV)x2 + [sqrt(EV)/4]) x level ) / 100 
  HP formula = level+10 + ( (basestat+IV)x2 + [sqrt(EV)/4]) x level ) )
  But, for HP: IV calculated by taking final binary digit from other stat IVs,
  making a binary string by placing them in order - attack, def, speed, spec, then 
  using that num as IV.
  
  Integer.toBinaryString(int i) is useful for this  

  All experience info will be obtained from http://bulbapedia.bulbagarden.net/wiki/Experience, very useful
  basestats obtained via bulbapedia scraper function
  */
  public static String basestats = "001 Bulbasaur 45 49 49 45 65 253 50.6 002 Ivysaur 60 62 63 60 80 325 65 003 Venusaur 80 82 83 80 100 425 85 004 Charmander 39 52 43 65 50 249 49.8 005 Charmeleon 58 64 58 80 65 325 65 006 Charizard 78 84 78 100 85 425 85 007 Squirtle 44 48 65 43 50 250 50 008 Wartortle 59 63 80 58 65 325 65 009 Blastoise 79 83 100 78 85 425 85 010 Caterpie 45 30 35 45 20 175 35 011 Metapod 50 20 55 30 25 180 36 012 Butterfree 60 45 50 70 80 305 61 013 Weedle 40 35 30 50 20 175 35 014 Kakuna 45 25 50 35 25 180 36 015 Beedrill 65 80 40 75 45 305 61 016 Pidgey 40 45 40 56 35 216 43.2 017 Pidgeotto 63 60 55 71 50 299 59.8 018 Pidgeot 83 80 75 91 70 399 79.8 019 Rattata 30 56 35 72 25 218 43.6 020 Raticate 55 81 60 97 50 343 68.6 021 Spearow 40 60 30 70 31 231 46.2 022 Fearow 65 90 65 100 61 381 76.2 023 Ekans 35 60 44 55 40 234 46.8 024 Arbok 60 85 69 80 65 359 71.8 025 Pikachu 35 55 30 90 50 260 52 026 Raichu 60 90 55 100 90 395 79 027 Sandshrew 50 75 85 40 30 280 56 028 Sandslash 75 100 110 65 55 405 81 029 Nidorano 55 47 52 41 40 235 47 030 Nidorina 70 62 67 56 55 310 62 031 Nidoqueen 90 82 87 76 75 410 82 032 Nidorana 46 57 40 50 40 233 46.6 033 Nidorino 61 72 57 65 55 310 62 034 Nidoking 81 92 77 85 75 410 82 035 Clefairy 70 45 48 35 60 258 51.6 036 Clefable 95 70 73 60 85 383 76.6 037 Vulpix 38 41 40 65 65 249 49.8 038 Ninetales 73 76 75 100 100 424 84.8 039 Jigglypuff 115 45 20 20 25 225 45 040 Wigglytuff 140 70 45 45 50 350 70 041 Zubat 40 45 35 55 40 215 43 042 Golbat 75 80 70 90 75 390 78 043 Oddish 45 50 55 30 75 255 51 044 Gloom 60 65 70 40 85 320 64 045 Vileplume 75 80 85 50 100 390 78 046 Paras 35 70 55 25 55 240 48 047 Parasect 60 95 80 30 80 345 69 048 Venonat 60 55 50 45 40 250 50 049 Venomoth 70 65 60 90 90 375 75 050 Diglett 10 55 25 95 45 230 46 051 Dugtrio 35 80 50 120 70 355 71 052 Meowth 40 45 35 90 40 250 50 053 Persian 65 70 60 115 65 375 75 054 Psyduck 50 52 48 55 50 255 51 055 Golduck 80 82 78 85 80 405 81 056 Mankey 40 80 35 70 35 260 52 057 Primeape 65 105 60 95 60 385 77 058 Growlithe 55 70 45 60 50 280 56 059 Arcanine 90 110 80 95 80 455 91 060 Poliwag 40 50 40 90 40 260 52 061 Poliwhirl 65 65 65 90 50 335 67 062 Poliwrath 90 85 95 70 70 410 82 063 Abra 25 20 15 90 105 255 51 064 Kadabra 40 35 30 105 120 330 66 065 Alakazam 55 50 45 120 135 405 81 066 Machop 70 80 50 35 35 270 54 067 Machoke 80 100 70 45 50 345 69 068 Machamp 90 130 80 55 65 420 84 069 Bellsprout 50 75 35 40 70 270 54 070 Weepinbell 65 90 50 55 85 345 69 071 Victreebel 80 105 65 70 100 420 84 072 Tentacool 40 40 35 70 100 285 57 073 Tentacruel 80 70 65 100 120 435 87 074 Geodude 40 80 100 20 30 270 54 075 Graveler 55 95 115 35 45 345 69 076 Golem 80 110 130 45 55 420 84 077 Ponyta 50 85 55 90 65 345 69 078 Rapidash 65 100 70 105 80 420 84 079 Slowpoke 90 65 65 15 40 275 55 080 Slowbro 95 75 110 30 80 390 78 081 Magnemite 25 35 70 45 95 270 54 082 Magneton 50 60 95 70 120 395 79 083 Farfetch'd 52 65 55 60 58 290 58 084 Doduo 35 85 45 75 35 275 55 085 Dodrio 60 110 70 100 60 400 80 086 Seel 65 45 55 45 70 280 56 087 Dewgong 90 70 80 70 95 405 81 088 Grimer 80 80 50 25 40 275 55 089 Muk 105 105 75 50 65 400 80 090 Shellder 30 65 100 40 45 280 56 091 Cloyster 50 95 180 70 85 480 96 092 Gastly 30 35 30 80 100 275 55 093 Haunter 45 50 45 95 115 350 70 094 Gengar 60 65 60 110 130 425 85 095 Onix 35 45 160 70 30 340 68 096 Drowzee 60 48 45 42 90 285 57 097 Hypno 85 73 70 67 115 410 82 098 Krabby 30 105 90 50 25 300 60 099 Kingler 55 130 115 75 50 425 85 100 Voltorb 40 30 50 100 55 275 55 101 Electrode 60 50 70 140 80 400 80 102 Exeggcute 60 40 80 40 60 280 56 103 Exeggutor 95 95 85 55 125 455 91 104 Cubone 50 50 95 35 40 270 54 105 Marowak 60 80 110 45 50 345 69 106 Hitmonlee 50 120 53 87 35 345 69 107 Hitmonchan 50 105 79 76 35 345 69 108 Lickitung 90 55 75 30 60 310 62 109 Koffing 40 65 95 35 60 295 59 110 Weezing 65 90 120 60 85 420 84 111 Rhyhorn 80 85 95 25 30 315 63 112 Rhydon 105 130 120 40 45 440 88 113 Chansey 250 5 5 50 105 415 83 114 Tangela 65 55 115 60 100 395 79 115 Kangaskhan 105 95 80 90 40 410 82 116 Horsea 30 40 70 60 70 270 54 117 Seadra 55 65 95 85 95 395 79 118 Goldeen 45 67 60 63 50 285 57 119 Seaking 80 92 65 68 80 385 77 120 Staryu 30 45 55 85 70 285 57 121 Starmie 60 75 85 115 100 435 87 122 Mrmime 40 45 65 90 100 340 68 123 Scyther 70 110 80 105 55 420 84 124 Jynx 65 50 35 95 95 340 68 125 Electabuzz 65 83 57 105 85 395 79 126 Magmar 65 95 57 93 85 395 79 127 Pinsir 65 125 100 85 55 430 86 128 Tauros 75 100 95 110 70 450 90 129 Magikarp 20 10 55 80 20 185 37 130 Gyarados 95 125 79 81 100 480 96 131 Lapras 130 85 80 60 95 450 90 132 Ditto 48 48 48 48 48 240 48 133 Eevee 55 55 50 55 65 280 56 134 Vaporeon 130 65 60 65 110 430 86 135 Jolteon 65 65 60 130 110 430 86 136 Flareon 65 130 60 65 110 430 86 137 Porygon 65 60 70 40 75 310 62 138 Omanyte 35 40 100 35 90 300 60 139 Omastar 70 60 125 55 115 425 85 140 Kabuto 30 80 90 55 45 300 60 141 Kabutops 60 115 105 80 70 430 86 142 Aerodactyl 80 105 65 130 60 440 88 143 Snorlax 160 110 65 30 65 430 86 144 Articuno 90 85 100 85 125 485 97 145 Zapdos 90 90 85 100 125 490 98 146 Moltres 90 100 90 90 125 495 99 147 Dratini 41 64 45 50 50 250 50 148 Dragonair 61 84 65 70 70 350 70 149 Dragonite 91 134 95 80 100 500 100 150 Mewtwo 106 110 90 130 154 590 118 151 Mew 100 100 100 100 100 500 100";
  //Finds pokemon index in the string above in order to return stats in lower function
  public static int index(String[] array, String pokemon)
    {
      for(int k = 1; k < array.length; k++)
      {
        if(array[k].equals(pokemon))
        {
          return k;
        }
      }
      return -1;
  } 
  //Returns Stats object for a pokemon s
  public static Stats getPokemonStat(String s)
  {
      String[] arr = basestats.split(" ");
      int indexS = index(arr,s);
      int indexHP = Integer.parseInt(arr[indexS+1]);
      int indexA = Integer.parseInt(arr[indexS+2]);
      int indexD = Integer.parseInt(arr[indexS+3]);
      int indexSpeed = Integer.parseInt(arr[indexS+4]);
      int indexSpc = Integer.parseInt(arr[indexS+5]);
      return new Stats(indexHP,indexA,indexD,indexSpeed,indexSpc);
  }  
  public int getHP()
  {
    return healthStat;
  }
  public int getAttack()
  {
    return attackStat;
  }
  public int getDefense()
  {
    return defenseStat;
  }
  public int getSpeed()
  {
    return speedStat;
  }
  public int getSpecial()
  {
    return specialStat;
  }
  public static void main(String[] args)
  {
    Stats bulba = getPokemonStat("Dragonite");
    System.out.println(bulba.getAttack());
  }
}
    