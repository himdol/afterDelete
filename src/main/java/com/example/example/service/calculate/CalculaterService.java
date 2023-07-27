package com.example.example.service.calculate;

import com.example.example.dto.calculate.CalculaterDto;
import com.example.example.repository.calculate.CalculaterMapper;
import com.example.example.vo.calculate.CalculaterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
@Slf4j
@Service
public class CalculaterService {

  @Autowired
  private CalculaterMapper CalculaterMapper;

  public int getResultAfterAdd(CalculaterDto domain) throws Exception {

    //validation check
    if (ObjectUtils.isEmpty(domain)) {
      throw new Exception("domain 값이 null 이예요");
    }

    CalculaterVo calculaterVo = new CalculaterVo();
    calculaterVo.setId(1);

    final int value = CalculaterMapper.getValueByIdNumberOne(calculaterVo);

    // 계산식
    return domain.getValueNumber() + value;
  }

}
