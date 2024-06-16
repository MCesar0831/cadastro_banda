package DataBase;

import models.banda;
import models.organizador;
import models.usuario;

import java.util.ArrayList;

public class Db {
    public static ArrayList<usuario> getusuarios() {
        if (usuarios.isEmpty()) {
            organizador org = new organizador();
            org.setNome("Organizador01");
            org.setSenha("org123");
            usuarios.add(org);
        }
        return usuarios;
    }
    public static usuario getUsr_logado() {
        return usr_logado;
    }

    public static void setUsr_logado(usuario usr_logado) {
        Db.usr_logado = usr_logado;
    }
    private static usuario usr_logado = null;
    private static ArrayList<usuario> usuarios = new ArrayList<usuario>();
}
