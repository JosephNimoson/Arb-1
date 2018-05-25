import java.util.ArrayList;

public class Client {


    public static void main(String[] args) {
        MeterArchive meterArkiv = new MeterArchive();

        meterArkiv.addMeter(new Clock("CL100", true, "ROM100", 2.70));
        meterArkiv.addMeter(new Thermometer("TM101", true, "ROM101",-55.00,55.00));
        meterArkiv.addMeter(new Weight("WT102",true,"ROM102",10,50));
        meterArkiv.addMeter(new Clock("CL103", true, "ROM103", 2.70));
        meterArkiv.addMeter(new Thermometer("TM104", true, "ROM104",0.00,100.00));
        meterArkiv.addMeter(new Weight("WT105",true,"ROM105",20,70));

        System.out.println(meterArkiv.getMeter("CL100"));
        System.out.println(meterArkiv.getMeter("TM101"));
        System.out.println(meterArkiv.getMeter("WT102"));

        meterArkiv.removeMeter("TM101");

        meterArkiv.getAllMeters();



    }
}