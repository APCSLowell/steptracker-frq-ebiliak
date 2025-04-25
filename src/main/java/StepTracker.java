import java.util.ArrayList;
public class StepTracker
{
 private int minsteps, totalDays;
 private int totalsteps, ActiveD;
 public Steptracker(int goal){
minsteps = goal;
  totalDays= 0;
  totalSteps=0;
  ActiveD=0;
 }
  Public void Adddaily(int steps){
   totalsteps += steps;
   totalDays++;
    if(steps>= minsteps){
    ActiveD++;
     }
  }
  public int activedays(){
   return ActiveD;
 }
 public double averagestep{
  
  return (double) totalsteps/totalDays;

} 
}
