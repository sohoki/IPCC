package com.system.backoffice.bas.code.models;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Schema(title="CmmnClCode : 대분류" )
public class CmmnClCode implements Serializable {


	private static final long serialVersionUID = 1L;
	@Schema(description="대분류 코드")
	private String clCode = "";
	@Schema(description="대분류명")
	private String clCodeNm = "";
	@Schema(description="대분류 설명")
	private String clCodeDc = "";
	@Schema(description="사용 유무")
	private String useAt = "";
	@Schema(description="최초 등록자 아이디")
	private String frstRegisterId = "";
	@Schema(description="최초 등록일자")
	private String frstRegistPnttm;
	@Schema(description="최종 수정자 아이디")
	private String lastUpdusrId   = "";
	@Schema(description="최종 수정일자")
	private String lastUpdtPnttm;
	@Schema(description="시스템 코드")
	private String systemCode;

}
