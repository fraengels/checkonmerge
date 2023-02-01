package com.actions.checkonmerge.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(WelcomeController.class)
class WelcomeControllerMockMVCTest {

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  private MockMvc mvc;

  @Test
  void autowiringWorked() {
    assertNotNull(mvc);
  }

  @Test
  void testHellowWhthoutName() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/welcome")
        .param("name", "Anton")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

}
