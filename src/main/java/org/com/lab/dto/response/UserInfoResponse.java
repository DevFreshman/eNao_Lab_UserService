package org.com.lab.dto.response;
import lombok.Builder;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public record UserInfoResponse(
        String fullName,
        String email,
        String phoneNumber,
        String avatarUrl,
        LocalDate dateOfBirth,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
