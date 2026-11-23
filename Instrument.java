import java.io.Serializable;

public class Instrument implements Serializable {
    private double[] weekPractice;
    private double[] lastWeek;
    private double allTimeTotal = 0.0;
    private boolean practicedToday = false;
    private int instrumentStreak;

    public Instrument() {
        this.weekPractice = new double[7];
        this.instrumentStreak = 0;
    }
    public double[] getWeekPractice() { return weekPractice; }
    public double[] getLastWeek() { return lastWeek; }
    public double getAllTimeTotal() { return allTimeTotal; }
    public boolean getPracticedToday() { return practicedToday; }
    public int getInstrumentStreak() { return instrumentStreak; }


    public void addPracticeTime(double minutes) {
        if (this.getPracticedToday()) {
            weekPractice[6] += minutes;
        } else {
            weekPractice[6] = minutes;
            instrumentStreak++;
        }
    }
    
    public void dayPassed() {
        if (!getPracticedToday()) {
            this.instrumentStreak = 0;
        } 
        this.practicedToday = false;
    }
}
