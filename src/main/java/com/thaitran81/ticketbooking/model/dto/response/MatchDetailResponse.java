package com.thaitran81.ticketbooking.model.dto.response;

import com.thaitran81.ticketbooking.model.enums.MatchStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ThaiTran81
 * @since 04/01/2025
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetailResponse {
    private MatchStatus status;
}
