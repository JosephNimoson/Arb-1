import java.util.ArrayList;

public class MeterArchive extends Client {
    ArrayList<Meter> objectList;

    public MeterArchive() {
        objectList = new ArrayList<>();

    }
//Legger til metode for å legge til et meter
    public void addMeter(Meter meter) {
        objectList.add(meter);


        for(Meter m : objectList){
            System.out.println("PINT LIST" + m.getRegNr());
        }
        System.out.println("-------------------------");
    }
/*Ønsker å hente et meter. Dersom meter ikke
eksisterer vil den returnere null
 */
    public Meter getMeter(String regNr) {
        for (Meter m : objectList) {
            System.out.println("REG nr: " + m.getRegNr());
            System.out.println("SAmenlikn: " + regNr);
            System.out.println(m.getRegNr().equals(regNr));


            if (m.getRegNr().equals(regNr)) {
                System.out.println("SUCSESS! " + m.toString());

                return m;
            }
        }
        return null;
    }
    //Endrer locationCode. Henter metoder fra meterklassen.
    public void setLocationCode(String regNr, String locationCode) {
        for (Meter m : objectList) {
            if (m.getRegNr().equals(regNr)) {
                m.setLocationCode(locationCode);
            }

        }

    }
    //Her sletter jeg valgt meter. dette gjøres ved at jeg velger locationcode
    public void removeMeter(String regNr) {
        for (Meter m : objectList) {

            if (m.getRegNr().equals(regNr)) {
                objectList.remove(m);
            }

        }
    }
    //returnerer alle meterne
    public ArrayList<Meter> getAllMeters(){
       return objectList;
    }

    //Endrer tilstanden til meter, om den fungerer eller ikke.
    public void setStatus(String regNr) {
        for (Meter m : objectList) {
            if (m.getRegNr().equals(regNr)) {
                if (m.isMeterCondition() == true) {
                    m.setMeterCondition(false);
                } else {
                    m.setMeterCondition(true);
                }
            }


        }


    }
}