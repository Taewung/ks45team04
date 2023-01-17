package ks45team04.sos.member.interceptor;

import java.io.PrintWriter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.util.WebUtils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ks45team04.sos.member.dto.LoginInfo;
import ks45team04.sos.member.dto.MMember;
import ks45team04.sos.member.mapper.MemberMapper;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	
	private final MemberMapper memberMapper;
	
	public LoginInterceptor (MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	/**
	 * HandlerMapping이 핸들러 객체를 결정한 후 HandlerAdapter가 핸들러를 호출하기 전에 호출되는 메소드
	 * @return true(controller 진입 허용) false (controller 진입 불허) 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		LoginInfo loginInfo = (LoginInfo) session.getAttribute("S_MEM_INFO");
		
		//cookie 하루동안 로그인
		Cookie cookie = WebUtils.getCookie(request, "loginKeepId");
		
		if(cookie != null && loginInfo == null) {
			String loginKeepId = cookie.getValue();
			MMember mmember = memberMapper.MemberList(loginKeepId);
			if(mmember != null) {
				loginInfo = new LoginInfo(loginKeepId
													, member.getMemName()
													, member.getMemBirth());
				session.setAttribute("S_MEM_INFO", loginInfo);
			}
		}
		return false;
	}



	public static void msgRedirect(HttpServletResponse response) {
		try {
			response.setContentType("text/html; charset=utf-8;");
			PrintWriter writer = response.getWriter();
			writer.write("<script>alert('비정상적인 접근입니다.'); location.href='/';</script>");
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}