package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity, contents);
    }

    @Override
    public int getCdMaxSpeed() {
        return 0;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

}
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


