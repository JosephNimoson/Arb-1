public class Meter extends MeterArchive {

    private String regNr;
    private boolean meterCondition;
    private String locationCode;

    public Meter(){

    }

    public Meter(String regNr, boolean meterCondition, String locationCode){
        this.regNr = regNr;
        this.meterCondition = meterCondition;
        this.locationCode = locationCode;

    }

    public String getRegNr() {
        return regNr;
    }

    public void setLocationCode(String locationCode){
        this.regNr = regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public boolean isMeterCondition() {
        return meterCondition;
    }

    public void setMeterCondition(boolean meterCondition) {
        this.meterCondition = meterCondition;
    }

    public String getLocationCode() {
        return locationCode;
    }
}