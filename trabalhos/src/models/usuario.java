package models;

public abstract class usuario {
    private String email;
    private String senha;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void trocarsenha(String senha_anterior, String nova_senha, String conferir_senha) throws Exception{
        if (nova_senha == null || nova_senha.isEmpty()){
            throw new Exception("Senha inválida");
        }
        if (!nova_senha.equals(conferir_senha)) {
            throw new Exception("Confirmação incorreta");
        }
        if (senha.equals(senha_anterior)) {
            senha = nova_senha;
        }else{
            throw new Exception("Senha inválida");
        }
    }
}
