package com.bookclub.service;

import java.util.List;

public interface GenericCrudDao<E, K> {
    void add(E entity);
    void update(E entity);
    boolean remove(String entity);
    List<E> list(K key);
    E find(K key);
}
