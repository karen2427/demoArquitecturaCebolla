package com.pragma.demo.aplicacion.mapper;

import com.pragma.demo.aplicacion.dto.BookDto;
import com.pragma.demo.dominio.entidad.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookDtoMapperBook {

    BookDto toBookDto(Book book);

    Book toBook(BookDto bookDto);

}
