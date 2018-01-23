package cn.zpro.sso.service;

import cn.zpro.sso.core.AuthenticateInfo;

/**
 * Token接口服务
 * @author dell
 */
public interface TokenService {


    /**
     * 根据token获取 AuthenticateInfo 对象
     * @param token
     * @return
     */
    AuthenticateInfo findAuthenticateInfoByToken(String token);

    /**
     * 生成token
     * @return
     */
    String generateToken();

}
