package pl.zajecia.jankiensroku;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static  org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class JankiensrokuApplicationTests {
@Autowired
private MockMvc mockmvc;



	@Test
	void Shouldreturdefault() throws Exception{
	this.mockmvc.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string("hello dcarkness my old friend"));



	}
}
