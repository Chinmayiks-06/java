package com.xworkz.app.dao;

import com.xworkz.app.dto.AeroplaneDto;

public interface AeroplaneDao {

boolean addBookDetails(AeroplaneDto aeroplaneDto);
AeroplaneDto getDetailsById(int id);

}
