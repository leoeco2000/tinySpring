package com.springStudy.io;

import java.io.InputStream;

public interface Resource{
  InputStream getInputStream() throws Exception;
}