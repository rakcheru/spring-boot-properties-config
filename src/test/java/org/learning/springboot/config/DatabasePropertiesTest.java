package org.learning.springboot.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@Import(DatabaseProperties.class)
public class DatabasePropertiesTest {
  
  @Autowired
  DatabaseProperties databaseProperties;
  
  @Test
  public void config() {
    assertNotNull(databaseProperties);
    assertEquals("scott-properties", databaseProperties.getUser());
  }
  
}