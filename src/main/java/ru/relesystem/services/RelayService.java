package ru.relesystem.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.relesystem.entity.Relay;

import java.util.List;

public interface RelayService {
    List<Relay> findAll();
    Relay findById(Long id);
    Relay save(Relay relay);
    Page<Relay> findAllByPage(Pageable pageable);
}