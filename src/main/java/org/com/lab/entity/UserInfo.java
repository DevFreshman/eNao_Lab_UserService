package org.com.lab.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "LAB_USER_INFO")
@Getter
@Setter
@NoArgsConstructor
public class UserInfo {

    @Id
    @Column(name = "USER_ID", length = 25)
    private String userId;

    @Column(name = "FULL_NAME", length = 255)
    private String fullName;

    @Column(name = "EMAIL", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;

    @Column(name = "AVATAR_URL", length = 500)
    private String avatarUrl;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @CreationTimestamp
    @Setter(AccessLevel.NONE)
    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Setter(AccessLevel.NONE)
    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAt;
}