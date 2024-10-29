package com.xworkz.app.employee.movie;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class MoviesDto {
    private int movieId;
    private String movieName;
    private Double movieRating;

}
