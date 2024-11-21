package org.example.example.repository;
import org.example.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository {




    Option find();


    List<User> findAll();


    User save(User user);


    Optional<User> findById(Long id);
}

