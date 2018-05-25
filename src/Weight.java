public class Weight extends Meter {
    double minWeight;
    double maxWeight;

    public Weight(String regNr, boolean meterCondition, String locationCode, double minWeight, double maxWeight){
        super( regNr, meterCondition,locationCode);

    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
