package demo.ignat.licenseservice.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(LicenseController.class)
class LicenseControllerTest {

    @Test
    @DisplayName("Positive /health endpoint test")
    public void isAlive() {
    }


    //  @Test
    //  public void findTask() throws Exception {
    //    Task laundryTask = new Task();
    //    laundryTask.setDescription("Laundry");
    //    when(repository.findAll()).thenReturn(List.of(laundryTask));
    //    this.mockMvc.perform(get("/api/tasks"))
    //        .andExpect(status().isOk())
    //        .andExpect(jsonPath("$[0].description").value("Laundry"));
    //  }
}