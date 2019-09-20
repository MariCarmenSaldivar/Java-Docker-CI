package com.tbo.controllers;

import java.util.List;

import com.tbo.beans.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HotelsRetrieveController
 */
@Controller
public class HotelsRetrieveController {

    @RequestMapping(method = RequestMethod.GET, value = "/hotel/allhotels")
    
    @ResponseBody
    public List<Hotel> getAllHotels() {
        Hotel htl= new Hotel();
        htl.setResultIndex(1);
        htl.setName("Hotel Test 1");
        htl.setCitycode("CUN");
        htl.setInfo("Hotel All Inclusive vista al Mar");
        RegisteredHotels.getHotel().add(htl);
        return RegisteredHotels.getHotel().getHotelRegistered();
    }
}