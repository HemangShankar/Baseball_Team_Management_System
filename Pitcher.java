public class Pitcher implements Player
{
  //Parameters for constructors 
  private String name;
  private int wins;
  private int losses;
  private double era;
  private double salary;

  //Constructor using parameters in the respective following order
  Pitcher(String name, int wins, int losses, double era, double salary){
    this.name = name;
    this.wins = wins;
    this.losses = losses;
    this.era = era;
    this.salary = salary;
  }

  //Method to display the name and all information associated with that player
  public void showStats(){
    System.out.println("Pitcher's Name: " + name);
    System.out.println("Wins: " + wins);
    System.out.println("Losses: " + losses);
    System.out.println("ERA (Estimated Run Average): " + era);
    System.out.println("Salary (Dollars): " + salary);
  }
}