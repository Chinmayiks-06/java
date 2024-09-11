package com.xworkz.travelapp.travelagency;

import com.xworkz.travelapp.contract.RedBusContract;

public class TravelAgency {

    RedBusContract contract;

    public boolean booking(RedBusContract contract) {
        System.out.println("Booking started");
        boolean isBookingDone = false;
        if (contract != null) {
            System.out.println("contract is initiated ..check the booking");
            boolean isConditionGood = contract.busCondition();
            if (isConditionGood) {
                System.out.println("bus condition is good...proceed the booking");
                this.contract = contract;
                isBookingDone = true;

            } else System.out.println("Bus condition is not good..cannot proceed");
        } else System.out.println("No contract made");
        return isBookingDone;
    }
}
