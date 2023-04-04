package com.example.SeatReservationSystem.Entity;


//Seat: Seat No, EmployeeId, Date, Reserved (Yes/No)
//        Employee: EmployeeId, Team


import lombok.Data;


@Data

public class EmployeeEntity {

   private int EmployeeId;


   private  String Team;

}
