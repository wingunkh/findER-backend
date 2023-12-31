package com.finder.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LinkDto {
    private String userEmail;

    private String linkedUserEmail;

    private String familyRelations;
}