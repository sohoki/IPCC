package com.system.backoffice.uat.uia.models;

import java.io.Serializable;
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
public class GroupInfo implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	private String groupId;
	private String groupNm;
	private String groupCreateDe;
	private String groupDc;
	private String useYn;
	private String parentGroupId;
	private String mode;
	private String groupOrder;
	private String groupLevel;
	
	
	
}
