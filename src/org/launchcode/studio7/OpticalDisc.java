package org.launchcode.studio7;

public interface OpticalDisc {

    int cdMaxSpeed = 300;
    int dvdMaxSpeed = 600;

    void spinDisc();


    default int spinDiscMaxSpeed(String discType) {
        if(discType == "CD") {
            return cdMaxSpeed;
        } else {
            return dvdMaxSpeed;
        }
    }

    static int getCdMaxSpeed() {
        System.out.println(cdMaxSpeed);
        return cdMaxSpeed;
    }

}