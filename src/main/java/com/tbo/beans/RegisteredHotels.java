package com.tbo.beans;

import java.util.ArrayList;
import java.util.List;
import com.tbo.beans.*;

/**
 * RegisteredHotels
 */
public class RegisteredHotels {
    
    private List<Hotel> hotelsRecords;
    
    private static RegisteredHotels hotelreg = null;

    private RegisteredHotels() {
        hotelsRecords= new ArrayList<Hotel>();
    }
    public static RegisteredHotels getHotel() {
        if (hotelreg==null){
            hotelreg= new RegisteredHotels();
            return hotelreg;
        }
        else{
            return hotelreg;
        }
    }

    public void add(Hotel htl){
        hotelsRecords.add(htl);
    }
    public List<Hotel> getHotelRegistered(){

        return hotelsRecords;
    }
    

}