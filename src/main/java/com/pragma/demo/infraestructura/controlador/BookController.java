package com.pragma.demo.infraestructura.controlador;

import com.pragma.demo.aplicacion.servicio.BookServiceInterface;
import com.pragma.demo.aplicacion.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookServiceInterface bookServiceInterface;

    @GetMapping("/{idBook}")
    public ResponseEntity<BookDto> findBookById(@PathVariable String idBook){
        BookDto bookDto = bookServiceInterface.findBookById(idBook);
        return ResponseEntity.status(HttpStatus.OK).body(bookDto);
    }

}
