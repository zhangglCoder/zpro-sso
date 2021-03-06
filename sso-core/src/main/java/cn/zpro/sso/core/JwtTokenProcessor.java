package cn.zpro.sso.core;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Web token 处理器
 * @author zhanggl
 */
public class JwtTokenProcessor {

    Key key = MacProvider.generateKey();

    public String generrateToken(){
        Map<String,Object> map = new HashMap<>();
        map.put("userId", "userZ00001");
        return Jwts.builder()
                .setSubject("Joe")
                .setClaims(map)
                .signWith(SignatureAlgorithm.HS512, key)
                //.setExpiration() 设置超时时间
                .compact();

    }


    public Jws<Claims> parser(){
        Jws<Claims> parseClaimsJws = null;
        try {
            parseClaimsJws = Jwts.parser().setSigningKey(key).parseClaimsJws(generrateToken());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return parseClaimsJws;
    }
}
