package org.example.librarymanagement;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository<Books> extends CrudRepository<Books, Integer>
{
}
