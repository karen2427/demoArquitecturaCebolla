package com.pragma.demo.infraestructura.dao;

import com.pragma.demo.dominio.entidad.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, String> {
}
