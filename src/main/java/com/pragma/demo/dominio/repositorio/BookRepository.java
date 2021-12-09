package com.pragma.demo.dominio.repositorio;

import com.pragma.demo.dominio.entidad.Book;

public interface BookRepository {

    Book getById(String id);

}
