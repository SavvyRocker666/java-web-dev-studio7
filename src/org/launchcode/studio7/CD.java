package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

     @Override
     public int getCdMaxSpeed() {
       System.out.println("Max speed is actually 670");
      return 670;
      }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
