package com.xworkz.examapp.hallticket;

public class HallTicket {

    public int hallTicketId;
    public String usn;
    public String subject;
    public String subjectCode;
    public String candidateName;

    public  void getDetails(){
        System.out.println("Hall Ticket Id is: "+this.hallTicketId);
        System.out.println("Candidate name is: "+this.candidateName);
        System.out.println("subject name is: "+this.subject);
        System.out.println("subject code is: "+this.subjectCode);
        System.out.println("Usn is: "+this.usn);
    }

}
