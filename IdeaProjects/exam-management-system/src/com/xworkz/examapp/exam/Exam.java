package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {

 public HallTicket ticket;
 public int fees;

  public boolean allow(HallTicket ticket){
      boolean isallowed=false;
      if(fees==1800){
          System.out.println("fees is paid collect your hall ticket");
          if(ticket!=null){

              this.ticket=ticket;
              this.ticket.getDetails();
              isallowed=true;
              System.out.println("hall ticket is issued");
          }else {
              System.out.println("no hall ticket found");
          }
      }else System.out.println("pay the fees");
      return isallowed;
  }

}
