package com.example.SeatReservationSystem.Controller;


import com.example.SeatReservationSystem.Entity.EmployeeEntity;
import com.example.SeatReservationSystem.Entity.SeatEntity;
import com.example.SeatReservationSystem.Service.SeatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeatController {

    @Autowired
    SeatService seatService;
    @Autowired
    EmployeeEntity employeeEntity;

    @PostMapping("/addseat")
    public String addSeat(@RequestBody SeatEntity seatEntity){

seatService.addSeat(seatEntity);
return "seatadded successfully";

    }
    @PostMapping("/addemployee")
    public String  addEmployee(EmployeeEntity employeeEntity){

        seatService.addEmployee(employeeEntity);
        return "employee added succesfully";
    }

    @GetMapping("/vacant")
    public int vacantseats(){
       return  seatService.vacantseats();
    }

    @GetMapping
    public int noofemployees(){
        return seatService.nofoemployees();
    }
}
