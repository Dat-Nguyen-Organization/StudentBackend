package com.datnguyen.student.mapper;

public interface BaseMapper<D, E> {
    E dtoToEntity(D d);
    D entityToDto(E e);
}
