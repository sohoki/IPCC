<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; minimum-scale=1.0; user-scalable=no;" />
    <title>경륜경정 스마트입장 관리자</title>
    <link rel="stylesheet" href="/resources/css/reset.css">
	<link rel="stylesheet" href="/resources/css/paragraph.css">
    <link rel="stylesheet" href="/resources/css/common.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" />
    <script src="/resources/js/jquery-3.5.1.min.js"></script>
    <script src="/resources/js/bpopup.js"></script>
    <!-- datepicker-->
    <script src="/resources/js/jquery-ui.js"></script>
    <!-- 체크 -->
    <link rel="stylesheet" href="/resources/css/jquery-ui.css">
    <!-- <link rel="stylesheet" href="/css/jquery-ui.css"> -->
    
   	<script src="/resources/js/common.js"></script>
    
    <!-- jqGrid -->
	<link rel="stylesheet" type="text/css" href="/resources/jqgrid/src/css/ui.jqgrid.css">
    <script type="text/javascript" src="/resources/jqgrid/src/i18n/grid.locale-kr.js"></script>
    <script type="text/javascript" src="/resources/jqgrid/js/jquery.jqGrid.min.js"></script>
    
	<script>
		jQuery.browser = {};
		(function () {
		    jQuery.browser.msie = false;
		    jQuery.browser.version = 0;
		    if (navigator.userAgent.match(/MSIE ([0-9]+)\./)) {
		        jQuery.browser.msie = true;
		        jQuery.browser.version = RegExp.$1;
		    }
		})();
	</script>
	
	<style type="text/css">
	    .ui-jqgrid .ui-jqgrid-htable th div{
			outline-style: none;
			height: 30px;
		}
	    
	    .ui-jqgrid tr.jqgrow {
			outline-style: none;
			height: 30px;
		}
    </style>
	
	<script type="text/javascript">
		$(document).ready(function() { 
			jqGridFunc.setGrid("mainGrid");
		});
	    
		var jqGridFunc  = {
			setGrid : function(gridOption){
				var grid = $('#'+gridOption);
				
				//ajax 관련 내용 정리 하기 
				var postData = {"pageIndex": "1"};
				
				grid.jqGrid({
					url : '/backoffice/bld/centerListAjax.do',
					mtype : 'POST',
					datatype : 'json',
					pager: $('#pager'),  
					ajaxGridOptions: { contentType: "application/json; charset=UTF-8" },
					ajaxRowOptions: { contentType: "application/json; charset=UTF-8", async: true },
					ajaxSelectOptions: { contentType: "application/json; charset=UTF-8", dataType: "JSON" }, 
					
					postData : JSON.stringify(postData),
					
					jsonReader : {
						root : 'resultlist',
						"page":"paginationInfo.currentPageNo",
						"total":"paginationInfo.totalPageCount",
						"records":"paginationInfo.totalRecordCount",
						repeatitems:false
					},
					//상단면
					colModel :  
					[
						{label: 'center_cd', key: true, name:'center_cd', index:'center_cd', align:'center', hidden:true},
						{label: '지점', name:'center_img', index:'center_img', align:'center', formatter: jqGridFunc.imageFomatter },
						{label: '지점명', name:'center_nm', index:'center_nm', align:'center'},
						{label: '연락처', name:'center_tel', index:'center_tel', align:'center'},
						{label: '주소', name:'center_addr', index:'center_addr', align:'center', formatter:jqGridFunc.address},
						{label: '사용유무', name:'use_yn', index:'use_yn', align:'center', sortable : false, formatter:jqGridFunc.useYn},
						{label: '사전입장시간', name:'preOpenSetting', index:'preOpenSetting', align:'center', sortable : false, formatter:jqGridFunc.preOpenSettingButton},
						{label: '자동취소', name: 'noshowSetting',  index:'noshowSetting', align:'center', sortable : false, formatter:jqGridFunc.noshowSettingButton},
						{label: '층 관리', name: 'floorInfoSetting',  index:'floorInfoSetting', align:'center', sortable : false, formatter:jqGridFunc.floorInfoButton},
						{label: '휴일 관리', name: 'center_holy_use_yn', index:'center_holy_use_yn', align:'center', sortable : false, formatter:jqGridFunc.holyDaySettingButton},
						{label: '수정자', name:'last_updusr_id', index:'last_updusr_id', align:'center'},
						{label: '수정일자', name:'last_updt_dtm', index:'last_updt_dtm', align:'center'},
						//{label: '삭제', name: 'btn',  index:'btn', align:'center', sortable : false, formatter:jqGridFunc.rowBtn}
					], 
					rowNum : 10,  //레코드 수
					rowList : [10,20,30,40,50,100],  // 페이징 수
					pager : pager,
					refresh : true,
				    multiselect : true, // 좌측 체크박스 생성
					rownumbers : false, // 리스트 순번
					viewrecord : true,  // 하단 레코드 수 표기 유무
					//loadonce : false, // true 데이터 한번만 받아옴 
					loadui : "enable",
					loadtext:'데이터를 가져오는 중...',
					emptyrecords : "조회된 데이터가 없습니다", //빈값일때 표시 
					height : "100%",
					autowidth:true,
					shrinkToFit : true,
					refresh : true,
					loadComplete : function (data) {
						$("#sp_totcnt").text(data.paginationInfo.totalRecordCount);
					},
					loadError:function(xhr, status, error) {
						alert(error); 
					}, 
					onPaging: function(pgButton) {
						var gridPage = grid.getGridParam('page'); //get current  page
						var lastPage = grid.getGridParam("lastpage"); //get last page 
						var totalPage = grid.getGridParam("total");
	    		              
						if (pgButton == "next"){
							if (gridPage < lastPage ){
								gridPage += 1;
							} else {
								gridPage = gridPage;
							}
						} else if (pgButton == "prev") {
							if (gridPage > 1 ){
								gridPage -= 1;
							} else {
								gridPage = gridPage;
							}
						} else if (pgButton == "first") {
							gridPage = 1;
	                    } else if (pgButton == "last") {
							gridPage = lastPage;
						} else if (pgButton == "user") {
							var nowPage = Number($("#pager .ui-pg-input").val());
							
							if (totalPage >= nowPage && nowPage > 0 ) {
								gridPage = nowPage;
							} else {
								$("#pager .ui-pg-input").val(nowPage);
								gridPage = nowPage;
							}
						} else if (pgButton == "records") {
							gridPage = 1;
						}
						
						grid.setGridParam({
							page : gridPage,
							rowNum : $('.ui-pg-selbox option:selected').val(),
							postData : JSON.stringify({
											"pageIndex": gridPage,
											"searchKeyword" : $("#searchKeyword").val(),
											"pageUnit":$('.ui-pg-selbox option:selected').val()
										})
						}).trigger("reloadGrid");
					},
					onSelectRow : function(rowId) {
						// 체크 할떄
						if(rowId != null) {  
							
						}
					},
					ondblClickRow : function(rowid, iRow, iCol, e){
						grid.jqGrid('editRow', rowid, {keys: true});
					},
					onCellSelect : function (rowid, index, contents, action){
						var cm = $(this).jqGrid('getGridParam', 'colModel');
						
						if (cm[index].name !='cb'){
							jqGridFunc.fn_centerInfo("Edt", $(this).jqGrid('getCell', rowid, 'center_cd'));
						}
					},
 					//체크박스 선택시에만 체크박스 체크 적용
					beforeSelectRow: function (rowid, e) { 
						var $myGrid = $(this), i = $.jgrid.getCellIndex($(e.target).closest('td')[0]), 
						cm = $myGrid.jqGrid('getGridParam', 'colModel'); 
						return (cm[i].name === 'cb'); 
					}
				});
			}, 
			imageFomatter : function(cellvalue, options, rowObject) {
				//이미지 URL	
				var centerImg = (rowObject.center_img == "no_image.png") ? "/resources/img/no_image.png": "/upload/"+ rowObject.center_img;
				return '<img src="' + centerImg + ' " style="width:120px">';
	    	},
	    	address : function(cellvalue, options, rowObject) {
				/* return rowObject.center_zipcd + "<br>"+ CommonJsUtil.NVL(rowObject.center_addr1) +"  "+ CommonJsUtil.NVL( rowObject.center_addr2) */
				return CommonJsUtil.NVL(rowObject.center_addr1) +"  "+ CommonJsUtil.NVL( rowObject.center_addr2)
			},
	    	useYn : function(cellvalue, options, rowObject) {
				return (rowObject.use_yn ==  "Y") ? "사용" : "사용안함";
			},
			rowBtn : function (cellvalue, options, rowObject) {
				return '<input type="button" onclick="jqGridFunc.delRow('+rowObject.center_cd+')" value="DEL"/>';
			},
			preOpenSettingButton : function (cellvalue, options, rowObject) {
				return '<a href="javascript:jqGridFunc.fn_preOpenInfo(&#39;list&#39;,&#39;'+rowObject.center_cd+'&#39;);" class="detailBtn">설정</a>';
			},			
			noshowSettingButton : function (cellvalue, options, rowObject) {
				return '<a href="javascript:jqGridFunc.fn_noshowInfo(&#39;list&#39;,&#39;'+rowObject.center_cd+'&#39;);" class="detailBtn">설정</a>';
			},
			floorInfoButton : function (cellvalue, options, rowObject) {
				return '<a href="javascript:jqGridFunc.fn_centerFloorInfo(&#39;'+rowObject.center_cd+'&#39;);" class="orangeBtn">층 관리</a>';	
			},
			holyDaySettingButton : function (cellvalue, options, rowObject) {
				return '<a href="javascript:jqGridFunc.fn_holyDayInfo('+rowObject.center_cd+');" class="blueBtn">휴일 추가</a>';	
			},
			refreshGrid : function(){
				$('#mainGrid').jqGrid().trigger("reloadGrid");
			},
			fn_delCheck  : function(){                        
		    	 var ids = $('#mainGrid').jqGrid('getGridParam','selarrrow'); //체크된 row id들을 배열로 반환
		    	 if (ids.length < 1) {
		    		 alert("선택한 값이 없습니다.");
		    		 return false;
		    	 }
		    	 
		    	 var centerArray = new Array();
		    	 for(var i=0; i <ids.length; i++){
					var rowObject = ids[i]; //체크된 id의 row 데이터 정보를 Object 형태로 반환
					centerArray.push(ids[i]);
		    	 } 
		    	 
		    	 var params = {'centerList' : centerArray.join(',')};
      		     fn_uniDelAction("/backoffice/bld/centerInfoDelete.do",params, "jqGridFunc.fn_search");
		    },
	 		delRow : function (center_id) {
				if(trim(center_id) != "") {
					var params = {'centerCd' : trim(center_id)};
					$("#searchKeyword").val("")
					fn_uniDelAction("/backoffice/bld/centerInfoDelete.do", params, "jqGridFunc.fn_search");
				}
			},
			clearGrid : function() {
				$("#mainGrid").clearGridData();
			},
			fn_search: function(){
				$("#mainGrid").setGridParam({
					datatype : "json",
					postData : JSON.stringify({
						"pageIndex": $("#pager .ui-pg-input").val(),
						"searchKeyword" : $("#searchKeyword").val(),
						"pageUnit":$('.ui-pg-selbox option:selected').val()
					}),
					loadComplete : function(data) {
						$("#sp_totcnt").text(data.paginationInfo.totalRecordCount);
					}
				}).trigger("reloadGrid");
	 		}, 
			fn_floorChange:function(floorinfo) {
				//층수로 input 생성 
				if ($("#startFloor").val() != "" && $("#endFloor").val() != "") {
					//선책 층 유효성 검사
					if (fnIntervalCheck($("#startFloor").val().replace("CENTER_FLOOR_", ""), $("#endFloor").val().replace("CENTER_FLOOR_", ""), "시작 층수가 종료 층수 보다 큽니다.") == false) {
						return false;
					} else {
						fnCreatCheckbox("sp_floorInfo", $("#startFloor").val().replace("CENTER_FLOOR_", ""),  $("#endFloor").val().replace("CENTER_FLOOR_", ""), floorinfo, "floorInfos", "층");	
					}
				}
			},
			fn_centerInfo : function (mode, centerCd) {
				$("#bld_branch_add").bPopup();
				$("#mode").val(mode);
				
				console.log("mode : " + mode);
				console.log("mode val : " + $("#mode").val());
			
				if (mode == "Ins") {
					$("#bld_branch_add .pop_tit").html("지점 정보 등록");
					$("#btnUpdate").text('등록');
					
					$("#centerCd").val("").attr('readonly', true);
					$("#centerNm").val("");
					$("#startFloor").val("");
					$("#endFloor").val("");
					$("#centerAddr1").val("");
					$("#centerAddr2").val("");
					$("#centerTel").val("");
					$("#centerFax").val("");
					$("#centerUrl").val("");
					$("input:radio[name='useYn']:radio[value='Y']").prop('checked', true);

					$("#sp_floorInfo").empty();
					

				} else {
					var url = "/backoffice/bld/centerInfoDetail.do";
					var param = {"centerCd" : centerCd};
	      			  
					uniAjax
					(
					    url, 
						param, 
						function(result) {
							if (result.status == "LOGIN FAIL") {
								alert(result.meesage);
								location.href="/backoffice/login.do";
							} else if (result.status == "SUCCESS") {
								var obj = result.regist;
								
								$("#bld_branch_add .pop_tit").html("[" + obj.center_nm + "] 지점 정보 수정");
								$("#btnUpdate").text('저장');
								
								$("#centerCd").val(obj.center_cd).attr('readonly', true); 
								$("#centerNm").val(obj.center_nm);
								$("#centerAddr1").val(obj.center_addr1);
								$("#centerAddr2").val(obj.center_addr2);
								$("#centerTel").val(obj.center_tel);
								$("#centerFax").val(obj.center_fax);
								$("#startFloor").val(obj.start_floor);
								$("#endFloor").val(obj.end_floor);
								$("#centerUrl").val(obj.center_url);
								$("input:radio[name='useYn']:radio[value='" + obj.use_yn + "']").prop('checked', true);
								
								$("#ir3").val(obj.center_info);
								fnCreatCheckbox("sp_floorInfo", $("#startFloor").val().replace("CENTER_FLOOR_", ""),  $("#endFloor").val().replace("CENTER_FLOOR_", ""), obj.floor_info, "floorInfos", "층") ;
							}
						},
						function(request){
							alert("ERROR : " +request.status);	       						
						}    		
					);
				}
			},
			//지점 사전예약시간 관련 function
			fn_preOpenInfo : function(division,centerCd) {
				centerCd = division == "list" ? centerCd : centerCd.value;
				if(division == "list") {
					$("#searchCenterCd").val(centerCd);
				}
				
				var url = "/backoffice/bld/preOpenInfoListAjax.do"; 
				var param = {"centerCd" : centerCd};

				$("#bld_early_set .inTxt").html("");
				
				uniAjaxSerial
				(
					url, 
					param, 
					function(result) {
						if (result.status == "LOGIN FAIL") {
							alert(result.meesage);
							location.href="/backoffice/login.do";
						} else if (result.status == "SUCCESS") {
							//지점 자동취소 정보 세팅
							if(result.regist != null) {
								var preOpenInfoList = result.regist;
								var setHtml = "";
								
								$("#bld_early_set .pop_tit span").html("[" + preOpenInfoList[0].center_nm + "]");
								
	 							for(var i=0; i < preOpenInfoList.length; i++) {
	 								var obj = preOpenInfoList[i];
									
	 								setHtml += "<tr id='" + obj.optm_cd + "'>";
									setHtml += "<td>" + obj.open_day + "</td>";
									setHtml += "<td><input type='text' id='" + obj.optm_cd + "_open_member_tm" + "'value='" + obj.open_member_tm + "' onKeyup='inputTimeFormat(this);' placeholder='HH:MM' maxlength='5'/></td>";
									setHtml += "<td><input type='text' id='" + obj.optm_cd + "_open_guest_tm" +"'value='" + obj.open_guest_tm + "' onKeyup='inputTimeFormat(this);' placeholder='HH:MM' maxlength='5'/></td>";
									setHtml += "<td>" + obj.last_updt_dtm + "</td>";
									setHtml += "</tr>";
								}
							} else {
								setHtml += "<tr colspan='4'>등록된 정보가 존재하지 않습니다.<tr>";	
							}
							$("#bld_early_set .inTxt").append(setHtml);
							
							//지점 셀렉트 박스 세팅
							if(result.centerInfoComboList != null) {
								var centerInfoComboList = result.centerInfoComboList;
								
								$("#preOpenCenterList").empty();
								$("#preOpenCenterList").append("<option value=''>선택</option>");
								
								for (var i in centerInfoComboList) {
									$("#preOpenCenterList").append("<option value='"+ centerInfoComboList[i].center_cd +"'>"+ centerInfoComboList[i].center_nm +"</option>");
								}
								$("#preOpenCenterList").val(centerCd);
							}
						}
					},
					function(request){
						alert("ERROR : " +request.status);	       						
					}    		
				);
				
				$("#bld_early_set").bPopup();
			},
			fn_preOpenInfoUpdate : function() {
				if (confirm("입력된 지점 사전예약정보를 저장하시겠습니까?")== true) {
					var url = "/backoffice/bld/preOpenInfoUpdate.do";
					var params = new Array();
					
					$("#bld_early_set .inTxt tr").each(function(index, item) {
						var optmCd = $(item).attr('id');
						var param = new Object();
						
	 					param['optmCd'] = optmCd;
						param['openMemberTm'] = $("#" + optmCd + "_open_member_tm").val().replace(/\:/g, "");
						param['openGuestTm'] = $("#" + optmCd + "_open_guest_tm").val().replace(/\:/g, "");	
	
						params.push(param);
					});
					
					uniAjax
					(
						url, 
						params, 
						function(result) {
							if (result.status == "LOGIN FAIL") {
								alert(result.meesage);
								location.href="/backoffice/login.do";
							} else if (result.status == "SUCCESS") {
								$("#bld_early_set").bPopup().close();
								alert(result.message);
							}
						},
						function(request){
							alert("ERROR : " + request.status);	       						
						}    		
					);
				}
			},
			fn_preOpenInfoCopy : function() {
				
				/* if(copyCenterCd == targetCenterCd) {} */
				if (confirm("해당 지점의 사전예약정보를 복사 하시겠습니까?") == true) {
					var url = "/backoffice/bld/preOpenInfoCopy.do";
					var copyCenterCd = $("#preOpenCenterList option:selected").val();
					var targetCenterCd = $("#searchCenterCd").val();
					
					var params = {
									"copyCenterCd" : copyCenterCd,
									"targetCenterCd" : targetCenterCd
								};
					
					uniAjax
					(
						url, 
						params, 
						function(result) {
							if (result.status == "LOGIN FAIL") {
								alert(result.meesage);
								location.href="/backoffice/login.do";
							} else if (result.status == "SUCCESS") {
								$("#bld_early_set").bPopup().close();
								alert(result.message);
							}
						},
						function(request){
							alert("ERROR : " + request.status);	       						
						}    		
					);
				}
			},
			//지점 자동취소시간 관련 function
			fn_noshowInfo : function(division,centerCd) {
				centerCd = division == "list" ? centerCd : centerCd.value;
				
				if(division == "list") {
					$("#searchCenterCd").val(centerCd);
				}
				
				var url = "/backoffice/bld/noshowInfoListAjax.do";
				var param = {"centerCd" : centerCd};

				$("#bld_noshow_set .inTxt").html("");
				
				uniAjaxSerial
				(
					url, 
					param, 
					function(result) {
						if (result.status == "LOGIN FAIL") {
							alert(result.meesage);
							location.href="/backoffice/login.do";
						} else if (result.status == "SUCCESS") {
							//지점 자동취소 정보 세팅
							if(result.regist != null) {
								var noshowInfoList = result.regist;
								var setHtml = "";
								
								$("#bld_noshow_set .pop_tit span").html("[" + noshowInfoList[0].center_nm + "]");
								
	 							for(var i=0; i < noshowInfoList.length; i++) {
	 								var obj = noshowInfoList[i];
									
	 								setHtml += "<tr id='" + obj.noshow_cd + "'>";
									setHtml += "<td>" + obj.noshow_day + "</td>";
									setHtml += "<td><input type='text' id='" + obj.noshow_cd + "_noshow_am_tm" + "'value='" + obj.noshow_am_tm + "' onKeyup='inputTimeFormat(this);' placeholder='HH:MM' maxlength='5'/></td>";
									setHtml += "<td><input type='text' id='" + obj.noshow_cd + "_noshow_pm_tm" +"'value='" + obj.noshow_pm_tm + "' onKeyup='inputTimeFormat(this);' placeholder='HH:MM' maxlength='5'/></td>";
									setHtml += "<td><input type='text' id='" + obj.noshow_cd + "_noshow_all_tm" +"'value='" + obj.noshow_all_tm + "' onKeyup='inputTimeFormat(this);' placeholder='HH:MM' maxlength='5'/></td>";
									setHtml += "<td>" + obj.last_updt_dtm + "</td>";
									setHtml += "<td>" + obj.last_updusr_id + "</td>";
									setHtml += "</tr>";
								}
							} else {
								setHtml += "<tr colspan='6'>등록된 정보가 존재하지 않습니다.<tr>";	
							}
							$("#bld_noshow_set .inTxt").append(setHtml);
							
							//지점 셀렉트 박스 세팅
							if(result.centerInfoComboList != null) {
								var centerInfoComboList = result.centerInfoComboList;
								
								$("#noshowCenterList").empty();
								$("#noshowCenterList").append("<option value=''>선택</option>");
								
								for (var i in centerInfoComboList) {
									$("#noshowCenterList").append("<option value='"+ centerInfoComboList[i].center_cd +"'>"+ centerInfoComboList[i].center_nm +"</option>");
								}
								$("#noshowCenterList").val(centerCd);
							}
						}
					},
					function(request){
						alert("ERROR : " +request.status);	       						
					}    		
				);
				
				$("#bld_noshow_set").bPopup();
			},
			fn_noshowInfoUpdate : function() {
				if (confirm("입력된 지점 자동취소 정보를 저장하시겠습니까?")== true) {
					var url = "/backoffice/bld/noshowInfoUpdate.do";
					var params = new Array();
					
					$("#bld_noshow_set .inTxt tr").each(function(index, item) {
						var noshowCd = $(item).attr('id');
						var param = new Object();
						
	 					param['noshowCd'] = noshowCd;
						param['noshowAmTm'] = $("#" + noshowCd + "_noshow_am_tm").val().replace(/\:/g, "");
						param['noshowPmTm'] = $("#" + noshowCd + "_noshow_pm_tm").val().replace(/\:/g, "");
						param['noshowAllTm'] = $("#" + noshowCd + "_noshow_all_tm").val().replace(/\:/g, "");
	
						params.push(param);
					});
					
					uniAjax
					(
						url, 
						params, 
						function(result) {
							if (result.status == "LOGIN FAIL") {
								alert(result.meesage);
								location.href="/backoffice/login.do";
							} else if (result.status == "SUCCESS") {
								$("#bld_noshow_set").bPopup().close();
								alert(result.message);
							}
						},
						function(request){
							alert("ERROR : " + request.status);	       						
						}    		
					);
				}
			},
			fn_holyDayInfo : function(centerCd) {
				tempAlert();
				return;
				$('#bld_holiday_add').bPopup();
			},
			fn_centerFloorInfo : function(centerCd) {
				$("#searchCenterCd").val(centerCd);
				//location.href= "/backoffice/bld/floorList.do?centerCd=" + centerCd;
				$("form[name=regist]").attr("action", "/backoffice/bld/floorList.do").submit();
			},
			fn_CheckForm : function () {
				if (any_empt_line_id("centerNm", "지점명을 입력해주세요.") == false) return;		  
				if (any_empt_line_id("centerAddr1", "주소를 입력해주세요.") == false) return;
				if (any_empt_line_id("centerTel", "지점연락처를 입력해주세요.") == false) return;
	     		  
				var commentTxt = ($("#mode").val() == "Ins") ? "신규 지점 정보를 등록 하시겠습니까?" : "입력한 지점 정보를 저장 하시겠습니까?";
				var resultTxt = ($("#mode").val() == "Ins") ? "신규 지점 정보가 정상적으로 등록 되었습니다." : "지점 정보가 정상적으로 저장 되었습니다.";
	     		
				if (confirm(commentTxt)== true) {
					var floorInfo = ckeckboxValue("체크된 층수가 없습니다.", "floorInfos");
					if(floorInfo == false) return;
					
					//체크 박스 체그 값 알아오기 
					var formData = new FormData();
	     			  
					formData.append('centerImg', $('#centerImg')[0].files[0]);
					formData.append('centerMap', $('#centerMap')[0].files[0]);
		     	    formData.append('centerCd' , $("#centerCd").val());
		     	    formData.append('centerNm' , $("#centerNm").val());
		     	    formData.append('centerAddr1' , $("#centerAddr1").val());
		     	    formData.append('centerAddr2' , $("#centerAddr2").val());
		     	    formData.append('centerTel' , $("#centerTel").val());
		     	    formData.append('centerFax' , $("#centerFax").val());
		     	   	formData.append('centerUrl' , $("#centerUrl").val());
		     	    formData.append('mode' , $("#mode").val());
		     	    formData.append('centerInfo' , $("#centerInfo").val());
		     	    formData.append('startFloor' , $("#startFloor").val());
		     	    formData.append('endFloor' , $("#endFloor").val());
		     	    formData.append('floorInfo' , floorInfo);
		     	    formData.append('useYn', $('input[name=useYn]:checked').val());
		     	    
		     	    uniAjaxMutipart
		     	    (
						"/backoffice/bld/centerInfoUpdate.do", 
						formData, 
						function(result) {
							//결과값 추후 확인 하기 	
							if (result.status == "SUCCESS"){
								alert(resultTxt);
								$("#bld_branch_add").bPopup().close();
			                    jqGridFunc.fn_search(); 	
							} else if (result.status == "LOGIN FAIL") {
								document.location.href="/backoffice/login.do";
							}
						},
						function(request){
							alert("ERROR : " + request.status);	       						
						}    		
					);
				} 
			}   
		}
	</script>
</head>

<body>
	<form:form name="regist" commandName="regist" method="post" action="/backoffice/bld/centerList.do">
	
	<input type="hidden" id="searchCenterCd" name="searchCenterCd">
	<input type="hidden" id="mode" name="mode">
	<input type="hidden" id="pageIndex" name="pageIndex">
	<input type="hidden" id="floorInfo" name="floorInfo">
	
	<div class="wrapper">
	<c:import url="/backoffice/inc/top_inc.do" />
  	
  		<!-- header //-->
  		<!--// contents-->
		<div id="contents">
    		<div class="breadcrumb">
      			<ol class="breadcrumb-item">
        			<li>시설 관리</li>
        			<li class="active">　> 지점 시설 관리</li>
				</ol>
    		</div>

    		<h2 class="title">지점 시설 관리</h2><div class="clear"></div>
    		
    		<!--// dashboard -->
    		<div class="dashboard">
    			<!--contents-->
      			<div class="boardlist">
     				<!--// search -->
        			<div class="whiteBox searchBox">
            			<div class="sName">
              				<h3>검색 옵션</h3>
            			</div>
						
						<div class="top">
							<p>지점명</p>
            				<input type="text" id="searchKeyword" name="searchKeyword"placeholder="검색어를 입력하세요.">
          				</div>
          				
          				<div class="inlineBtn">
							<a href="javascript:jqGridFunc.fn_search();" class="grayBtn">검색</a>
          				</div>
        			</div>

        			<div class="right_box">
            			<a data-popup-open="bld_branch_add" onclick="jqGridFunc.fn_centerInfo('Ins','0')" class="blueBtn">지점 등록</a>
            			<a href="#" onClick="jqGridFunc.fn_delCheck()" class="redBtn">삭제</a>
        			</div>
        			<div class="clear"></div>
        			
        			<div class="whiteBox">
        				<table id="mainGrid">
        				
        				</table>
        				<div id="pager" class="scroll" style="text-align:center;"></div>     
          				
          				<div id="paginate"></div>
        			</div>
      			</div>
			</div>
    	</div>
  		<!-- contents//-->
	</div>
<!-- wrapper_end-->
<!-- // 지점 등록 팝업 -->
<div id="bld_branch_add" data-popup="bld_branch_add" class="popup">
	<div class="pop_con">
		<a class="button b-close">X</a>
      	<h2 class="pop_tit">지점 등록</h2>
      	<div class="pop_wrap">
          	<table class="detail_table">
				<tbody>
                	<tr>
                    	<th>지점 CODE</th>
                    	<td><input type="text" id="centerCd" value="KD237893"></td>
                    	<th>지점명</th>
                    	<td><input type="text" id="centerNm" value="장안지점"></td>
                	</tr>
                	<tr>
                  		<th>주소</th>
                  		<td colspan="3">
                    		<input type="text" id="centerAddr1" style="width: 200px; margin-right: 5px;">
                    		<input type="text" id="centerAddr2" style="width: 200px; margin-right: 5px;">
                    		<input type ="button" onclick="execDaumPostcode()" value ="우편번호 찾기" >
                  		</td>
                	</tr>
                	<tr>
                    	<th>대표번호</th>
                    	<td><input type="text" id="centerTel" value="02-3422-0000"></td>
                    	<th>Fax</th>
                    	<td><input type="text" id="centerFax" value="02-3422-0001"></td>
                	</tr>
                	<tr>
                  		<th>전경사진</th>
                  		<td><input type="file" id="centerImg"></td>
                  		<th>내부이미지</th>
                  		<td><input type="file" id="centerMap"></td>
                	</tr>
                	<tr>
                  		<th>전체 사용 층</th>
                  		<td>
	                     	<select id="startFloor" onChange="jqGridFunc.fn_floorChange('')" style="width:120px">
		                        <option value="">시작 층수</option>
		                         <c:forEach items="${floorInfo}" var="floorList">
									<option value="${floorList.code}">${floorList.codenm}</option>
		                         </c:forEach>
	                    	</select> ~
	                    	<select id="endFloor" onChange="jqGridFunc.fn_floorChange('')"  style="width:120px">
		                        <option value="">종료 층수</option>
		                        <c:forEach items="${floorInfo}" var="floorList">
		                            <option value="${floorList.code}">${floorList.codenm}</option>
								</c:forEach>
	                    	</select> 
                  		</td>
                  		<th>사용 층수</th>
                  		<td>
							<span id="sp_floorInfo"></span> 
                  		</td>
					</tr>
                	<tr>
						<th>URL</th>
	                  	<td><input type="text" id="centerUrl"></td>
	                  	<th>사용 유무</th>
	                  	<td>
                    		<label for="useYn_Y"><input id="useYn_Y" type="radio" name="useYn" value="Y" checked>Y</label>
                    		<label for="useYn_N"><input id="useYn_N" type="radio" name="useYn" value="N">N</label>
                  		</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="right_box">
			<a id="btnUpdate" href="javascript:jqGridFunc.fn_CheckForm();" class="blueBtn">저장</a>
			<a href="javascript:bPopupClose('bld_branch_add');" class="grayBtn">취소</a>
          	
		</div>
		<div class="clear"></div>
	</div>
</div>

<!-- 지점 정보 수정 팝업 // -->
<!-- 사전 예약  -->
<div id="bld_early_set" data-popup="bld_early_set" class="popup">
	<div class="pop_con">
		<a class="button b-close">X</a>
      	<h2 class="pop_tit">사전 예약 설정 <span>[장안지점]</span></h2>
      	<div class="pop_wrap">
        <fieldset class="whiteBox searchBox">
			<div class="top" style="border-bottom: 0px; padding: 0px;">
	            <p>복사지점</p>
	            <select id="preOpenCenterList" onChange="jqGridFunc.fn_preOpenInfo('change',this)">
	              	<option value="0">지점1</option>
	              	<option value="1">지점2</option>
	            </select>
	            <a href="javascript:jqGridFunc.fn_preOpenInfoCopy();" class="grayBtn">복사</a>
			</div>
		</fieldset>
        <table class="whiteBox main_table">
			<thead>
				<tr>
	            	<th>요일</th>
	            	<th>회원 오픈 시간</th>
	            	<th>비회원 오픈 시간</th>
	            	<th>최종 수정 일자</th>
            	</tr>
          </thead>
          <tbody class="inTxt">

          </tbody>
        </table>
		<div class="center_box">
          	<a href="javascript:jqGridFunc.fn_preOpenInfoUpdate();" class="blueBtn">저장</a> 
          	<a href="javascript:bPopupClose('bld_early_set');" class="grayBtn">취소</a>
        </div>
		</div>
  </div>
</div>

<!-- 자동 취소 정보  -->
<div id="bld_noshow_set" data-popup="bld_noshow_set" class="popup">
	<div class="pop_con">
		<a class="button b-close">X</a>
		<h2 class="pop_tit">자동 취소 설정 <span>[장안지점]</span></h2>
		<div class="pop_wrap">
		<fieldset class="whiteBox searchBox">
			<div class="top" style="border-bottom: 0px; padding: 0px;">
				<p>복사지점</p>
				<select id="noshowCenterList" onChange="jqGridFunc.fn_noshowInfo('change',this)">

	            </select>
	            <a href="javascript:jqGridFunc.fn_noshowInfoCopy();" class="grayBtn">복사</a>
			</div>
        </fieldset>
        <table class="whiteBox main_table">
			<thead>
				<tr>
		            <th>요일</th>
		            <th>자동취소 오전 시간</th>
		            <th>자동취소 오후 시간</th>
		            <th>자동취소 종일 시간</th>
		            <th>최종 수정 일자</th>
		            <th>최종 수정자</th>
	            </tr>
          	</thead>
			<tbody class="inTxt">

          	</tbody>
		</table>
        <div class="center_box">
          	<a href="javascript:jqGridFunc.fn_noshowInfoUpdate();" class="blueBtn">저장</a> 
          	<a href="javascript:bPopupClose('bld_noshow_set');" class="grayBtn">취소</a>
        </div>
      </div>
  </div>
</div>

<!-- // 휴일관리 팝업 -->
<div id="bld_holiday_add" data-popup="bld_holiday_add" class="popup">
  <div class="pop_con">
      <a class="button b-close">X</a>
      <h2 class="pop_tit">지점 휴일 정보</h2>
      <div class="pop_wrap">
        <fieldset class="whiteBox searchBox">
          <div class="top" style="border-bottom: 0px; padding: 0px;">
            <p>복사지점</p>
            <select>
              <option value="0">지점1</option>
              <option value="1">지점2</option>
            </select>
            <a href=""class="grayBtn">복사</a>
          </div>
        </fieldset>
        <table class="whiteBox main_table">
          <thead>
            <th>날짜</th>
            <th>휴일명</th>
            <th>사용유무</th>
            <th>최종수정자</th>
            <th>추가 ｜ 삭제</th>
          </thead>
          <tbody>
            <tr class="cur_poin" >
              <td>2021.09.04</td>
              <td>토요일</td>
              <td>사용</td>
              <td>관리자</td>
              <td><a href="" class="blueBtn">수정</a><a href="" class="redBtn" style="margin-left: 5px;">삭제</a></td>
            </tr>
            <tr class="cur_poin" >
              <td>2021.09.04</td>
              <td>토요일</td>
              <td>사용</td>
              <td>관리자</td>
              <td><a href="" class="blueBtn">수정</a><a href="" class="redBtn" style="margin-left: 5px;">삭제</a></td>
            </tr>
            <tr class="cur_poin" >
              <td>2021.09.04</td>
              <td>토요일</td>
              <td>사용</td>
              <td>관리자</td>
              <td><a href="" class="blueBtn">수정</a><a href="" class="redBtn" style="margin-left: 5px;">삭제</a></td>
            </tr>
            <tr>
              <td><input type="text" id="to" class="cal_icon" name="date_to" autocomplete=off></td>
              <td><input type="text"></td>
              <td><input type="text"></td>
              <td><input type="text"></td>
              <td><a href="javascript:bPopupClose('bld_holiday_add');" class="blueBtn">추가</a></td>
            </tr>
          </tbody>
        </table>
      </div>
  </div>
</div>
<!-- 휴일관리 팝업 // -->
<script src="/js/kses/common.js"></script>
<script type="text/javascript" src="/resources/js/common.js"></script>
</form:form>
</body>
</html>