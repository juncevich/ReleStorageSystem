package ru.relesystem.repository;

import ru.relesystem.entity.Relay;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface RelayRepository extends PagingAndSortingRepository<Relay, Long> {
}