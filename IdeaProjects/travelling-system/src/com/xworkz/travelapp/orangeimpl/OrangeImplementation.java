package com.xworkz.travelapp.orangeimpl;

import com.xworkz.travelapp.contract.RedBusContract;

public  class OrangeImplementation implements RedBusContract {
    @Override
    public int tickets() {
        return 20;
    }

    @Override
    public boolean busCondition() {
        return true;
    }

}
