package com.pragma.demo.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {

    private String title;
    private String author;
    private String description;

}
