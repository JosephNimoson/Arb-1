public class Clock extends Meter {

    double minClock;


    public Clock(String regNr, boolean meterCondition, String locationCode, double minClock){
        super( regNr, meterCondition,locationCode);

    }

    public double getMinClock() {
        return minClock;
    }

    public void setMinClock(double minClock) {
        this.minClock = minClock;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "minClock=" + minClock +
                '}';
    }
}
