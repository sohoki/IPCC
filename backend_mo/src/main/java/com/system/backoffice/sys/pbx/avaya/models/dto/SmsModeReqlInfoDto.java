package com.system.backoffice.sys.pbx.avaya.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

import io.swagger.v3.oas.annotations.media.Schema;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(title="SmsModeReqlInfoDto : SMS MODELS REQ DTO " )
public class SmsModeReqlInfoDto {

	@NotBlank(message="mode  입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	
	@Schema(description="sms models 시퀀스", example="1288")
	private int notiSeq;
	
	@NotBlank(message="Model 명을 입력해 주세요.")
	@Schema(description="sms models 영문명", example="AARAnalysis")
	private String smsModel;
	
	@NotBlank(message="Field을 입력해 주세요.")
	@Schema(description="sms models 영문 Field명", example="Dialed_String|Dialed_String")
	private String smsFields;
	
	@Schema(description="sms models 지원 작동명", example="change,  display,  list")
	private String smsOperation;
	
	@NotBlank(message="사용 유무를 선택해 주세요.")
	@Schema(description="sms models 사용 유무", example="Y/N")
	private String smsUseyn;
	
	@Schema(description="sms models 구분")
	private String smsGubun;
	
	@Schema(description="sms models 한글명")
	private String smsName;
	
	@Schema(description="sms models 한글 필드")
	private String smsFieldsDc;
	
	@Schema(description="sms models 등록자 아이디")
	private String userId;
	
	
}
