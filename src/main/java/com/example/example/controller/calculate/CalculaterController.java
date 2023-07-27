package com.example.example.controller.calculate;

import com.example.example.dto.calculate.CalculaterDto;
import com.example.example.service.calculate.CalculaterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/cal")
public class CalculaterController {

  @Autowired private CalculaterService calculaterService;

  @PostMapping("/add")
  public int getResultAfterAdd(@RequestBody CalculaterDto domain) throws Exception {
    log.info("getResultAfterAdd >>>> " + domain.getValueNumber());
    int resultValue = calculaterService.getResultAfterAdd(domain);
    return resultValue;
  }

  @PostMapping("/subtract")
  public int getResultAfterSubtract(@RequestBody CalculaterDto domain) {
    log.info("getResultAfterSubtract >>>> " + domain.getValueNumber());
    return 0;
  }

  @PostMapping("/multiply")
  public int getResultAfterMultiply(@RequestBody CalculaterDto domain) {
    log.info("getResultAfterMultiply >>>> " + domain.getValueNumber());
    return 0;
  }

  @PostMapping("/divideSubmit")
  public int getResultAfterDivideSubmit(@RequestBody CalculaterDto domain) {
    log.info("getResultAfterDivideSubmit >>>> " + domain.getValueNumber());
    return 0;
  }

}
