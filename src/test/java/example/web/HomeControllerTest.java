package example.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.junit.Assert.*;

/**
 * Created by yookeun on 2016. 9. 13..
 */
public class HomeControllerTest {

    @Test
    public void testHome() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/"))  //GET 수행
                .andExpect(view().name("home")); //home 뷰를 보여줌
    }

}