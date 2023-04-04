package com.example.SeatReservationSystem.Entity;



import lombok.Data;

import java.util.Date;


@Data

public class SeatEntity {


  private   int seatNo;

  private int employeeId;

   private Date   date;

   private boolean Reserved;


}
