package com.booking.flightbooking.service;


import com.booking.flightbooking.entity.BookingBean;
import com.booking.flightbooking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImp implements BookingService {

    @Autowired
    BookingRepository bookingRepository;
   public boolean createBooking(BookingBean bean){
       return bookingRepository.save(bean);
    }

   public boolean cancelBooking(int bId){
      return bookingRepository.deleteById(bId);

    }

    public BookingBean getBookingInfo(int bId) {
      return bookingRepository.findById(bId).get();
    }
}
