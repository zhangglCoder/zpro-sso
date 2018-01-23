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
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId", UUID.randomUUID().toString());
        return Jwts.builder()
                .setSubject("Joe")
                .setClaims(map)
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();

    }


    public Jws<Claims> parser(){
        Jws<Claims> parseClaimsJws = null;
        try {
            parseClaimsJws = Jwts.parser().setSigningKey(key).parseClaimsJws(generrateToken());
            //OK, we can trust this JWT

        } catch (Exception e) {
            e.printStackTrace();
            //don't trust the JWT!
        }

        return parseClaimsJws;
    }

    public static void main(String[] args) {
        JwtTokenProcessor jwtTokenProcessor = new JwtTokenProcessor();
        String token = jwtTokenProcessor.generrateToken();
        System.out.println(token);


        Jws<Claims> claimsJws = jwtTokenProcessor.parser();



    }
}
