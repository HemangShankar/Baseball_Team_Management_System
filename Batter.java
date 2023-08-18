public class Batter implements Player
{
  //Parameters for constructors 
  private String name;
  private int homeRuns;
  private double average;
  private double salary;

  //Constructor using parameters in the respective following order
  Batter(String name, int homeRuns, double average, double salary){
    this.name = name;
    this.homeRuns = homeRuns;
    this.average = average;
    this.salary = salary;
  }

  //Method to display the name and all information associated with that player
  public void showStats(){
    System.out.println("Batter's Name: " + name);
    System.out.println("Home Runs: " + homeRuns);
    System.out.println("Average: " + average);
    System.out.println("Salary (Dollars): " + salary);
  }
}