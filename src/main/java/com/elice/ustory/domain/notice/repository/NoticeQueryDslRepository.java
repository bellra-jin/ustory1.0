package com.elice.ustory.domain.notice.repository;

import com.elice.ustory.domain.notice.dto.NoticeResponse;

import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;

public interface NoticeQueryDslRepository {
    List<NoticeResponse> findAllNoticesByUserId(Long userId, LocalDateTime requestTime, Pageable pageable);
}
