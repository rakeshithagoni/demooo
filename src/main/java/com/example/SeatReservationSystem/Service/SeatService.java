package com.example.SeatReservationSystem.Service;

import com.example.SeatReservationSystem.Entity.EmployeeEntity;
import com.example.SeatReservationSystem.Entity.SeatEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SeatService {

    Map<Integer,SeatEntity> seatdb=new HashMap<>();
    Map<Integer,EmployeeEntity> employeeDb=new HashMap<>();
public void addSeat(SeatEntity seatEntity){
     seatdb.put(seatEntity.getSeatNo(),seatEntity);
}


    public void addEmployee(EmployeeEntity employeeEntity) {
    employeeDb
            .put(employeeEntity.getEmployeeId(),employeeEntity);

    }

    public int vacantseats() {

    int count=0;
    for(Integer s:seatdb.keySet()){
        if(seatdb.get(s).isReserved()==false){

            count++;

        }
    }

    return count;
    }

    public int nofoemployees() {

    return 5;
    }
}
