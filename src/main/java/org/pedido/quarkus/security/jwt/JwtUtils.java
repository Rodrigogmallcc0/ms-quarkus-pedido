package org.pedido.quarkus.security.jwt;

import org.springframework.beans.factory.annotation.Value;

public class JwtUtils {

    @Value("${jwt.secret.key}")
    private String secretKey;

    @Value("${jwt.time.expiration}")
    private String timeExpiration;

    public String GenerateTokenAccess(String username){
        return null;
    }
}
