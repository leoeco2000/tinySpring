package tinySpring.test.service.Impl;

import tinySpring.test.service.OutputService;

public class OutputServiceImpl implements OutputService {

  @Override
  public void output(String text){
      System.out.println(text);
  }

}