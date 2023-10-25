package com.system.backoffice.uat.uia.models.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleInfoRequestDto {

	private String userRoleSeq;
	private String roleId;
	private String userId;
}
