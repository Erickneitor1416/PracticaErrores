/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author LabP3103
 */
public class Usuario {
    private String nombreUsuario;
    private String clave;

    public Usuario(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public static boolean esUsuarioValido(String usuario){
        return usuario.matches("[A-z1-9]+");
    }
    
    public static boolean esClaveValida(String clave){
        return clave.length() <= 8;
    }
}
