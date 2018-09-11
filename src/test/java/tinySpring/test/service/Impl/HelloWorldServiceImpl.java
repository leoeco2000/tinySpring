package tinySpring.test.service.Impl;

import tinySpring.test.service.HelloWorldService;
import tinySpring.test.service.OutputService;

public class HelloWorldServiceImpl implements HelloWorldService {

  private String text;

  private OutputService outputService;

  @Override
  public void helloWorld() {
     this.outputService.output(this.text);
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setOutputService(OutputService outputService) {
    this.outputService = outputService;
  }

  public String getText() {
    return text;
  }

  public OutputService getOutputService() {
    return outputService;
  }


}
