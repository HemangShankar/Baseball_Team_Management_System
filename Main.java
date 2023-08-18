  /*
Baseball Team Lab
Programmers: Hemang Shankar
*/

class Main {
  public static void main(String[] args) {
    //creates n array of players called team 
    Player[] team = new Player[4];

    //Creates an object for batter
    team[0] = new Batter("Bob Smith", 50, 2.0, 1000);

    //Creates an object for pitcher
    team[1] = new Pitcher("Joseph Chen", 100, 53, 5.0, 3000);

    //Creates an object for batter
    team[3] = new Batter("Hemang Shankar", 75, 0.5, 3213);

    //Loop to display all information associated with team1
    for(Player player: team){
      //To combat null pointer exception 
      if(player != null){
        //calls method to show stats
        player.showStats();
        System.out.println();
      }
    }
  }
}

