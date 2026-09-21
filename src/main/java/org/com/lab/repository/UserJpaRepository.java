package org.com.lab.repository;

import org.com.lab.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserInfo, String> {
    boolean existsByUserId(String userId);

    Optional<UserInfo> findByUserId(String userId);
}
