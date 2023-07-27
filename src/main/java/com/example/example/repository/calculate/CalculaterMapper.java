package com.example.example.repository.calculate;

import com.example.example.vo.calculate.CalculaterVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CalculaterMapper {
  int getValueByIdNumberOne(CalculaterVo calculaterVo);

}
