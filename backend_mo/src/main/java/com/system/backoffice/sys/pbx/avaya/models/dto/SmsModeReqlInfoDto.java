package com.system.backoffice.sys.pbx.avaya.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsModeReqlInfoDto {

	private String mode;
	private int notiSeq;
	@NotBlank(message="Model 명을 입력해 주세요.")
	private String smsModel;
	@NotBlank(message="Field을 입력해 주세요.")
	private String smsFields;
	private String smsObjectName;
	
	private String smsUseyn;
	private String smsName;
	private String smsFieldsDc;
	
	
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	
	
}
