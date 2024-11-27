package com.xworkz.app.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="registration_details")

public class AeroplaneDto {
@Id
@GenericGenerator(name = "ref",strategy = "increment")
@GeneratedValue(generator = "ref")
@Column(name = "r_id")
 private int id;
@Column(name = "r_name")
 private String userName;
@Column(name = "r_email")
 private String email;
@Column(name = "r_phoneNumber")
 private long phoneNumber;
@Column(name = "r_origin")
 private String origin;
 @Column(name = "r_destinaation")
 private String destination;
 @Column(name = "r_date")
 private String Date;
 @Column(name = "flight_class")
private String FlightClass;
 @Column(name = "r_numOfPassenger")
 private int numberOfPassengers;
}
