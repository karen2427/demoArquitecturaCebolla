package com.pragma.demo.infraestructura.repositorio;

import com.pragma.demo.dominio.entidad.Book;
import com.pragma.demo.dominio.repositorio.BookRepository;
import com.pragma.demo.infraestructura.dao.BookDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private final BookDao bookDao;

    @Override
    public Book getById(String id) {
        return bookDao.getById(id);
    }

}
