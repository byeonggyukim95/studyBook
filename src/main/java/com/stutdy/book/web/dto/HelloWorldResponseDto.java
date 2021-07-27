package com.stutdy.book.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloWorldResponseDto {

    private final String name;
    private final Integer amount;
}
