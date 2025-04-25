import java.util.ArrayList;
public class StepTracker {
    private int minsteps, totalDays, totalsteps, ActiveD;

    public StepTracker(int goal) {
        minsteps = goal;
        totalDays = 0;
        totalsteps = 0;
        ActiveD = 0;
    }

    public void addDaily(int steps) {
        totalsteps += steps;
        totalDays++;
        if (steps >= minsteps) {
            ActiveD++;
        }
    }

    public int activeDays() {
        return ActiveD;
    }

    public double averageStep() {
        if (totalDays == 0) return 0.0; // Avoid divide-by-zero
        return (double) totalsteps / totalDays;
    }
}
