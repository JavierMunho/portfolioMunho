/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioMunho.njm.Security.Jwt;

import com.portfolioMunho.njm.Security.Entity.UsuarioPrincipal;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {

    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private String expiration;
    
    public String generateToken (Authentication authentication){
    UsuarioPrincipal usuarioPrincipal =(UsuarioPrincipal) authentication.getPrincipal();
    return Jwts.builder().setSubject(usuarioPrincipal.getUsername())
            .setIssuedAt(new Date())
            .setExpiration(new Date(new Date().getTime()+expiration*1000))
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
            
            }
    
    }


