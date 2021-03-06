package cn.zpro.sso.service.impl;

import cn.zpro.sso.core.AuthenticateInfo;
import cn.zpro.sso.core.JwtTokenProcessor;
import cn.zpro.sso.service.TokenService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import org.springframework.stereotype.Service;

/**
 * @author dell
 */
@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public AuthenticateInfo findAuthenticateInfoByToken(String token) {
        JwtTokenProcessor processor = new JwtTokenProcessor();
        Jws<Claims> parser = processor.parser();
        Object userId = parser.getBody().get("userId");
        AuthenticateInfo info = new AuthenticateInfo();
        info.setUserId(userId.toString());
        return info;
    }

    @Override
    public String generateToken() {
        JwtTokenProcessor processor = new JwtTokenProcessor();
        return processor.generrateToken();
    }
}
