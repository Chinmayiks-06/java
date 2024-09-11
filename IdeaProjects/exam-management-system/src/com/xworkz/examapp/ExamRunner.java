package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamRunner {
    public static void main(String[] args) {

        Exam exam=new Exam();
        exam.fees=1800;
        HallTicket hallTicket=new HallTicket();
        hallTicket.candidateName="Chinmayi";
        hallTicket.usn="4MC20CS028";
        hallTicket.hallTicketId=326557;
        hallTicket.subject="DSA";
        hallTicket.subjectCode="20DSA032";

        exam.allow(hallTicket);

    }
}
