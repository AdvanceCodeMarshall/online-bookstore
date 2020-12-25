package in.santosh.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.santosh.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
