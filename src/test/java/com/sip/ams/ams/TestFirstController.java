/*package com.sip.ams.ams;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class TestFirstController {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void Test1() throws Exception
    {
        this.mockMvc.perform(get("/info")).andExpect(status().isOk())
                .andExpect(content().string(containsString("page")));
    }
    @Test
    public void Test1_home() throws Exception
    {
        this.mockMvc.perform(get("/provider/add")).andExpect(status().isOk())
                .andExpect(content().string(containsString("Add")));
    }
    @Test
    public void Test2_home() throws Exception
   {
       this.mockMvc.perform(get("/home")).andExpect(status().isOk())
                .andExpect(content().string(containsString("is")));
   }
    @Test
    public void Test3_home() throws Exception
    {
       this.mockMvc.perform(get("/home")).andExpect(status().isOk())
                .andExpect(content().string(containsString("framework"))); }

}
*/