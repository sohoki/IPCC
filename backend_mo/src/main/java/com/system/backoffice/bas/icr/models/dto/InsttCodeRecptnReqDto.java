package com.system.backoffice.bas.icr.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsttCodeRecptnReqDto {

	private String mode;
	/*
	 * 발생일자
	 */
	private String occrrDe = "" ;

	/*
	 * 기관코드
	 */
	private String insttCode = "" ;

    /**
     * 작업일련번호
     */
    int	opertSn = 0;

	/*
	 * 변경구분코드
	 */
	private String changeSeCode = "" ;

	/*
	 * 처리구분
	 */
	private String processSe = "" ;

	/*
	 * 기타코드
	 */
	private String etcCode = "" ;

	/*
	 * 전체기관명
	 */
	private String allInsttNm = "" ;

	/*
	 * 최하위기관명
	 */
	private String lowestInsttNm = "" ;

	/*
	 * 기관약칭명
	 */
	private String insttAbrvNm = "" ;

	/*
	 * 차수
	 */
	private String odr = "" ;

	/*
	 * 서열
	 */
	private String ord = "" ;

	/*
	 * 기관차수
	 */
	private String insttOdr = "" ;

	/*
	 * 최상위기관코드
	 */
	private String bestInsttCode = "" ;

	/*
	 * 상위기관코드
	 */
	private String upperInsttCode = "" ;

	/*
	 * 대표기관코드
	 */
	private String reprsntInsttCode = "" ;

	/*
	 * 기관유형대분류
	 */
	private String insttTyLclas = "" ;

	/*
	 * 기관유형중분류
	 */
	private String insttTyMclas = "" ;

	/*
	 * 기관유형소분류
	 */
	private String insttTySclas = "" ;

	/*
	 * 전화번호
	 */
	private String telno = "" ;

	/*
	 * 팩스번호
	 */
	private String fxnum = "" ;

	/*
	 * 생성일자
	 */
	private String creatDe = "" ;

	/*
	 * 폐지일자
	 */
	private String ablDe = "" ;

	/*
	 * 폐지유무
	 */
	private String ablEnnc = "" ;

	/*
	 * 변경일자
	 */
	private String changede = "" ;

	/*
	 * 변경시간
	 */
	private String changeTime = "" ;

	/*
	 * 기초일자
	 */
	private String bsisDe = "" ;

	/*
	 * 정렬순서
	 */
	private int sortOrdr = 0 ;

	/*
	 * 최초등록자ID
	 */
	private String userId = "" ;

}
