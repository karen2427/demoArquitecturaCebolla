package com.pragma.demo.dominio.servicio;

import com.pragma.demo.dominio.entidad.Book;
import com.pragma.demo.dominio.repositorio.BookRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookDomainServiceImpl implements BookDomainServiceInterface{

    private final BookRepository bookRepository;

    @Override
    public Book findBookById(String id) {
        return bookRepository.getById(id);
    }

}
