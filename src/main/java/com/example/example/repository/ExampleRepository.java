package com.example.example.repository;

import com.example.example.vo.ExampleVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExampleRepository {

  public List<ExampleVo> getExampleData(){

    /*
      List data 임의 설정
     */
    List<ExampleVo> exampleVoList = new ArrayList<>();

    ExampleVo exampleVo = new ExampleVo();
    // data1
    exampleVo.setSampleInt(1);
    exampleVo.setSampleInteger(2);
    exampleVo.setSampleName("혿길동");
    exampleVo.setSampleLong(12341249812894L);

    exampleVoList.add(exampleVo);

    exampleVo = new ExampleVo();
    // data2
    exampleVo.setSampleInt(2);
    exampleVo.setSampleInteger(2);
    exampleVo.setSampleName("길동홍");
    exampleVo.setSampleLong(23412498128941L);

    exampleVoList.add(exampleVo);

    exampleVo = new ExampleVo();
    // data3
    exampleVo.setSampleInt(3);
    exampleVo.setSampleInteger(3);
    exampleVo.setSampleName("동길홍");
    exampleVo.setSampleLong(23412498128941L);

    exampleVoList.add(exampleVo);

    return exampleVoList;
  }
}
