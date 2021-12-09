package com.pragma.demo.aplicacion.servicio;

import com.pragma.demo.aplicacion.dto.BookDto;
import com.pragma.demo.aplicacion.mapper.BookDtoMapperBook;
import com.pragma.demo.dominio.servicio.BookDomainServiceInterface;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookServiceImpl implements BookServiceInterface {

    private final BookDomainServiceInterface bookDomainServiceInterface;
    private final BookDtoMapperBook bookDtoMapperBook;

    @Override
    public BookDto findBookById(String id) {
        return bookDtoMapperBook.toBookDto(bookDomainServiceInterface.findBookById(id));
    }

}
