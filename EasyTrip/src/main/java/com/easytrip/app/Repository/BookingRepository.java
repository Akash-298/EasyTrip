package com.easytrip.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easytrip.app.Model.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>{

}
