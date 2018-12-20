package me.shijunjie.SiteAccountingSystem.Interceptor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import me.shijunjie.SiteAccountingSystem.common.Constant;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		HttpSession session = request.getSession(true);
		if(session.getAttribute(Constant.USER_NAME) == null || session.getAttribute(Constant.OPERATE_TIME) == null) {
			logOut(request, response);
			return false;
		}
		// 最新操作时间
		Long operateTime = session.getLastAccessedTime();
		// 上次操作时间
		Long lastOperateTime = (Long) session.getAttribute(Constant.OPERATE_TIME);
		// 计算差值
		int intervalTime = (int)((operateTime - lastOperateTime)/1000);
		if(intervalTime > 600) {
			logOut(request, response);
			return false;
		}
		//更新最新操作时间
		session.setAttribute(Constant.OPERATE_TIME, operateTime);
		return true;
	}
	
	private void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<script>");
		out.println("window.open('"+request.getContextPath()+"/toLogin', '_top')");
		out.println("</script>");
		out.println("</html>");
	}

}
