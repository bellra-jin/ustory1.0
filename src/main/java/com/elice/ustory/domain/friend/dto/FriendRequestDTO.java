package com.elice.ustory.domain.friend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendRequestDTO {
    private Long senderId;
    private Long receiverId;
    private LocalDateTime invitedAt;
    private String nickname;
    private String name;
    private String profileImg;
}
