package com.pragma.demo.aplicacion.servicio;

import com.pragma.demo.aplicacion.dto.BookDto;

public interface BookServiceInterface {

    BookDto findBookById(String id);

}
