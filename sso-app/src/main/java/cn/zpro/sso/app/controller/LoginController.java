package cn.zpro.sso.app.controller;

import cn.zpro.sso.app.dto.ResponseMsg;
import cn.zpro.sso.app.vo.UserVo;
import cn.zpro.sso.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 登录视图类
 * @author zhanggl
 */
@Controller
@RequestMapping("sso")
public class LoginController {

    @Autowired
    private TokenService tokenService;

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView();
        view.setViewName("login");
        return view;
    }

    @GetMapping("info")
    public ModelAndView info(){
        ModelAndView view = new ModelAndView();
        view.setViewName("info");
        return view;
    }

    @GetMapping("403")
    public ModelAndView error403(){
        ModelAndView view = new ModelAndView();
        view.setViewName("error/403");
        return view;
    }

    @PostMapping("login")
    @ResponseBody
    public ResponseMsg login(HttpServletResponse response, UserVo userVo){
        Map<String,Object> objectMap = new HashMap<>();
        String token = tokenService.generateToken();
        objectMap.put("token",token);
        //TODO 写入cookies
        Cookie cookie = new Cookie("token", token);
        cookie.setMaxAge(2 * 60);// 设置为30min
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
        return new ResponseMsg<>(true,objectMap);
    }
}
