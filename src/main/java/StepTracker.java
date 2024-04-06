import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
private int myGoalStep;
private ArrayList <Integer> record;
 public StepTracker(int goalStep){
     record = new ArrayList <Integer> ();
     myGoalStep = goalStep;
 }
 public void addDailySteps(int step){
  record.add(step);
 }
 public double averageSteps(){
  if (record.size() == 0){
    return 0;
  }
  int totalStep = 0;
  for (Integer steps : record){
    totalStep += steps;
  }
  return (double) totalStep / record.size();
 }
 public int activeDays(){
  int count = 0;
  for (Integer active : record){
    if (active >= myGoalStep){
      count++;
    }
  }
  return count;
 }
} 
