package com.system.backoffice.sys.pbx.avaya.models;


import javax.validation.constraints.NotBlank;

import com.system.backoffice.infra.bld.cnt.models.CenterInfo;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(title="SmsModelInfo : SMS MODELS " )
public class SmsModelInfo {

	
	
	@Schema(description="sms models 시퀀스", example="1288")
	private int notiSeq;
	
	@Schema(description="sms models 영문명", example="AARAnalysis")
	private String smsModel;
	
	@Schema(description="sms models 영문 Field명", example="Dialed_String|Dialed_String")
	private String smsFields;
	
	@Schema(description="sms models 지원 작동명", example="change,  display,  list")
	private String smsOperation;
	
	
	@Schema(description="sms models 사용 유무", example="Y/N")
	private String smsUseyn;
	
	@Schema(description="sms models 구분")
	private String smsGubun;
	
	@Schema(description="sms models 한글명")
	private String smsName;
	
	@Schema(description="sms models 한글 필드")
	private String smsFieldsDc;
	
	@Schema(description="최초 등록일자")
	private String frstRegistPnttm;
	
	@Schema(description="최종 등록자")
	private String frstRegisterId;
	
	@Schema(description="최종 수정일자")
	private String lastUpdtPnttm;
	
	@Schema(description="최종 수정자")
	private String lastUpdusrId;
	
}
