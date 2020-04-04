package saho.service;

import java.util.List;

public interface ServiceInterface<T, t> {
    T create(T t);
    T read(String t);
    T delete(String t);
    T update(T t);
    List<T> readAll();
}
