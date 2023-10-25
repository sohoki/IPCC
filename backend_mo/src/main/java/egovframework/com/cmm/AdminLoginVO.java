package egovframework.com.cmm;


import java.util.List;

import com.system.backoffice.uat.uia.models.UserRoleInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminLoginVO {

	
	private String adminId;
	private String adminName;
	private String adminPassword;
	private String adminEmail;
	private String adminTel;
	private String regDate;
	private String updatePassword;
	private String lockYn;
	private String useYn;
	private String empNo;
	private String centerId;
	private String partId;
	private String partNm;
	private String userIp = "";
	private String adminStatus;
	private List<UserRoleInfo> roleInfo;  
}
