package cn.zpro.sso.app.controller;

import cn.zpro.sso.app.dto.ResponseMsg;
import cn.zpro.sso.app.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录视图类
 * @author zhanggl
 */
@Controller
@RequestMapping("sso")
public class LoginController {

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView();
        view.setViewName("login");
        return view;
    }

    @PostMapping("login")
    public ResponseMsg login(UserVo userVo){
        Map<String,Object> objectMap = new HashMap<>();
        ResponseMsg<Map<String,Object>> msg = new ResponseMsg<>();

        return msg;
    }
}
