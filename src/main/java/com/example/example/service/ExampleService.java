package com.example.example.service;

import com.example.example.dto.ExampleDto;
import com.example.example.repository.ExampleRepository;
import com.example.example.vo.ExampleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleService {

  @Autowired
  private ExampleRepository exampleRepository;

  public List<ExampleDto> getExampleData() {

    List<ExampleVo> exampleVoList = exampleRepository.getExampleData();
    List<ExampleDto> exampleDtoList = new ArrayList<>();


    for (ExampleVo exampleVo : exampleVoList) {
      ExampleDto exampleDto = new ExampleDto();

      exampleDto.setSampleInt(exampleVo.getSampleInt());
      exampleDto.setSampleName(exampleVo.getSampleName());
      exampleDto.setSampleLong(exampleVo.getSampleLong());
      exampleDto.setSampleInteger(exampleVo.getSampleInteger());
      exampleDtoList.add(exampleDto);
    }

    return exampleDtoList;
  }

}
