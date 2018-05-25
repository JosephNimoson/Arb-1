public class Thermometer extends Meter {
    private Double minTemp;
    private Double maxTemp;

    public Thermometer(String regNr, boolean meterCondition, String locationCode,double minTemp,double maxTemp){
        super( regNr, meterCondition,locationCode);
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;

    }

    public Thermometer(){

    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                '}';
    }
}
