package com.pragma.demo.dominio.servicio;

import com.pragma.demo.dominio.entidad.Book;

public interface BookDomainServiceInterface {

    Book findBookById(String id);

}
