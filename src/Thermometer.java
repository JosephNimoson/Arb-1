public class Thermometer extends Meter {
    Double minTemp;
    Double maxTemp;

    public Thermometer(String regNr, boolean meterCondition, String locationCode,double minTemp,double maxTemp){
        super( regNr, meterCondition,locationCode);

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
