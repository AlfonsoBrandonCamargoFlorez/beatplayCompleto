package com.jsnunez.model;

public class UsuarioInicioSesion {
String user;
String pass;

public UsuarioInicioSesion() {
}
public UsuarioInicioSesion(String user, String pass) {
    this.user = user;
    this.pass = pass;
}
public String getUser() {
    return user;
}

public void setUser(String user) {
    this.user = user;
}
public String getPass() {
    return pass;
}
public void setPass(String pass) {
    this.pass = pass;
}

}
