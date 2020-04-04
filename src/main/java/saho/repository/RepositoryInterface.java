package saho.repository;

import java.util.List;

public interface RepositoryInterface<T, t> {
    T create(T t);
    T read(String t);
    T delete(String t);
    T update(T t);
    List<T> readAll();
}
