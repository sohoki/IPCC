package com.system.backoffice.sys.pbx.avaya.models.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.system.backoffice.sys.pbx.avaya.models.StationButtonInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;

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
@Schema(title="StationInfoReqDto : pbx 내선번호 정보 Dto " )
public class StationInfoReqDto {

	@Schema(title="mode " )
	@NotBlank(message="mode")
	private String mode;
	
	@Schema(title="내선번호 " )
	@NotBlank(message="내선번호 가 없습니다.")
	private String extension;
	
	@Schema(title="전화기 타입 " )
	private String type;
	
	@Schema(title="tn " )
	private String tn;
	
	@Schema(title="cor" )
	private String cor;
	
	@Schema(title="cos" )
	private String cos;
	
	@Schema(title="내선번호 명 영문으로 기입" )
	private String name;
	
	@Schema(title="비밀번호" )
	@NotBlank(message="비밀번호 가 없습니다.")
	private String securityCode;
	
	@Schema(title="display 언어" )
	private String displayLangage;
	
	@Schema(title="상담사 사용 유무" )
	private String consultUseyn;
	
	@Schema(title="업데이트 일자" )
	private String updateDate;
	
	@Schema(title="ip softphone 사용 여부" )
	private String ipSoftphone;
	
	@Schema(title="단축 버튼" )
	private List<StationButtonInfo> stationButton;
}
