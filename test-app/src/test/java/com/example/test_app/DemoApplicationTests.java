package com.example.test_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

  @Test
  public void testThatAlwaysFails() {
    assertEquals(1, 2, "This test must fail");
  }
}
