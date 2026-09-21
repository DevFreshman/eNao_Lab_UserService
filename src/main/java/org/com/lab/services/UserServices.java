package org.com.lab.services;

import lombok.extern.slf4j.Slf4j;
import org.com.lab.dto.response.UserInfoResponse;
import org.com.lab.error.LabErrorCode;
import org.com.lab.repository.UserJpaRepository;
import org.example.javaframework.infra.security.CurrentUserContext;
import org.example.javaframework.web.exception.BusinessException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServices {

    private final UserJpaRepository userJpaRepository;

    public  UserServices(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    public UserInfoResponse getUserInfo() {
        String userId = CurrentUserContext.get().userId();
        return userJpaRepository.findByUserId(userId)
                .map(userInfo -> UserInfoResponse.builder()
                        .fullName(userInfo.getFullName())
                        .email(userInfo.getEmail())
                        .phoneNumber(userInfo.getPhoneNumber())
                        .avatarUrl(userInfo.getAvatarUrl())
                        .dateOfBirth(userInfo.getDateOfBirth())
                        .createdAt(userInfo.getCreatedAt())
                        .updatedAt(userInfo.getUpdatedAt())
                        .build())
                .orElseThrow(() -> new BusinessException(LabErrorCode.NOT_FOUND_USER_INFO));
    }

}
