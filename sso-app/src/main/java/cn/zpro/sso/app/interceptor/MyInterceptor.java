package cn.zpro.sso.app.interceptor;

import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhanggl
 */

public class MyInterceptor extends HandlerInterceptorAdapter {

    public static String token;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1.拦截到请求中，cookies中携带token的请求，

        System.out.println("MyInterceptor>>>");

        Cookie[] cookies = request.getCookies();
        if(!ObjectUtils.isEmpty(cookies)){
            for (Cookie c:cookies) {
                if(c.getName().equals("token")){
                    //2.token校验
                    token = c.getValue();
                    return true;
                }
            }
        }

        System.out.println("Permission denied");
        response.sendRedirect("/sso/403");

        return true;
    }
}
