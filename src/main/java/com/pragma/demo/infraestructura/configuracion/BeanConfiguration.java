package com.pragma.demo.infraestructura.configuracion;

import com.pragma.demo.aplicacion.mapper.BookDtoMapperBook;
import com.pragma.demo.aplicacion.servicio.BookServiceImpl;
import com.pragma.demo.dominio.repositorio.BookRepository;
import com.pragma.demo.dominio.servicio.BookDomainServiceImpl;
import com.pragma.demo.dominio.servicio.BookDomainServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public BookServiceImpl bookService(BookDomainServiceInterface bookDomainServiceInterface, BookDtoMapperBook bookDtoMapperBook){
        return new BookServiceImpl(bookDomainServiceInterface, bookDtoMapperBook);
    }

    @Bean
    public BookDomainServiceImpl bookDomainServiceImpl(BookRepository bookRepository){
        return new BookDomainServiceImpl(bookRepository);
    }

}
