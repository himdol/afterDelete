package com.example.example.controller;

import com.example.example.dto.ExampleDto;
import com.example.example.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.Charset;
import java.util.List;

@Controller
@Slf4j
public class ExampleController {

  @Autowired
  private ExampleService exampleService;

  @GetMapping("/exampleData")
  @ResponseBody
  public List<ExampleDto> getExampleDate() {
    return exampleService.getExampleData();
  }


}
