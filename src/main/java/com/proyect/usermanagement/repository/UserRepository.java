package com.proyect.usermanagement.repository;

import com.proyect.usermanagement.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    boolean existsByUsername(String username);
<<<<<<< HEAD

    boolean existsByEmail(String email);
}

=======
}
>>>>>>> ac9deff (depure code)
