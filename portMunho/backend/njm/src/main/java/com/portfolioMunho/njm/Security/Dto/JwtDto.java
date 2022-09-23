/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioMunho.njm.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author usuario
 */
public class JwtDto {
  private String token;
  private String bearer = "Bearer";
  private String nombreUsuario;
  private Collection<? extends GrantedAuthority> authorities; 
  
  //* constructor

    public JwtDto() {
    }

    public JwtDto(String token, String nombreusuario, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }
  //* getter y setters

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreusuario() {
        return nombreUsuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreUsuario = nombreusuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    
}
