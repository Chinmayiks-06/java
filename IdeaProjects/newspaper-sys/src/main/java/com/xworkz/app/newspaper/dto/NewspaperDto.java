package com.xworkz.app.newspaper.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NewspaperDto {
    private int id;
    private String paperName;
    private int noOfPages;
    private String language;
    private double price;
    private String editorName;
    private String date;
    private int noOfArticles;

}

