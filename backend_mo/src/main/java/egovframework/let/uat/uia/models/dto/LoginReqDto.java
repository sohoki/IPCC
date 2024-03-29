package egovframework.let.uat.uia.models.dto;

import javax.validation.constraints.NotBlank;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(title="LoginReqDto : 로그인 요청 화면 " )
public class LoginReqDto {

	@NotBlank(message="아이디를 입력해 주세요.")
	@Schema(description="관리자 아이디")
	private String adminId;
	@NotBlank(message="패스워드를 입력해 주세요.")
	@Schema(description="관리자 패스워드")
	private String adminPassword;
}
