package services;

import DataBase.Db;
import models.usuario;

public class usr_service {
    public void ligin(String email, String senha) throws Exception {
        for (usuario usr: Db.getusuarios()) {
            if (usr.getEmail().equals(email)) {
                if (usr.getSenha().equals(senha)) {
                    Db.setUsr_logado(usr);
                    return;
                }else{
                    throw new Exception("Usuário ou senha inválido(s)");
                }
            }
        }
        throw new Exception("Usuário ou senha inválido(s)");
    }
    public void logout() {
        Db.setUsr_logado(null);
    }
    public usuario getUsr_logado() {
        return Db.getUsr_logado();
    }
}
