package com.booking.flightbooking.service;

import com.booking.flightbooking.entity.BookingBean;
public interface BookingService {

   public  boolean createBooking(BookingBean bean);

    public boolean cancelBooking(int bId);

    public BookingBean getBookingInfo(int bId);

}
