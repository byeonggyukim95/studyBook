package com.stutdy.book.dto;

import com.stutdy.book.web.dto.HelloWorldResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldResponseDtoTest {

   @Test
   public void lombokTest(){
      String name = "test";
      Integer amount = 1000;

      HelloWorldResponseDto dto = new HelloWorldResponseDto(name, amount);

      assertThat(dto.getName()).isEqualTo(name);
      assertThat(dto.getAmount()).isEqualTo(amount);
   }
}
