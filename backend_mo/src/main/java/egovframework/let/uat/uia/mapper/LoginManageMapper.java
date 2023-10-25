package egovframework.let.uat.uia.mapper;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.com.cmm.AdminLoginVO;

@Mapper
public interface LoginManageMapper {

	
	public AdminLoginVO actionLogin(AdminLoginVO vo) ;

	
	public AdminLoginVO actionLoginSso(String adminId) ;
	
	/**
	 * 아이디를 찾는다.
	 * @param vo LoginVO
	 * @return LoginVO
	 * @exception Exception
	 */
	public String searchId(AdminLoginVO vo) ;

	/**
	 * 비밀번호를 찾는다.
	 * @param vo LoginVO
	 * @return LoginVO
	 * @exception Exception
	 */
	public AdminLoginVO searchPassword(AdminLoginVO vo);

	/**
	 * 변경된 비밀번호를 저장한다.
	 * @param vo LoginVO
	 * @exception Exception
	 */
	public int updatePassword(AdminLoginVO vo);
}
