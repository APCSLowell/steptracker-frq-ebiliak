import java.util.ArrayList;
public class StepTracker
{
 private int minsteps, totalDays;
 private int totalsteps, ActiveD;
 public StepTracker(int goal){
minsteps = goal;
  totalDays= 0;
  totalsteps=0;
  ActiveD=0;
 }
  public void Addaily(int steps){
   totalsteps += steps;
   totalDays++;
    if(steps>= minsteps){
    ActiveD++;
     }
  }
  public int activedays(){
   return ActiveD;
 }
 public double averagestep(){
  
  return (double) totalsteps/totalDays;

} 
}
