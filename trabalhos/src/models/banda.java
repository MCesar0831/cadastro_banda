package models;

public class banda extends usuario{
    private String nome_banda;

    private  int N_de_integrantes;

    public String getnome_banda() {
        return nome_banda;
    }

    public void setnome_banda(String nome_banda) {
        nome_banda = nome_banda;
    }

    public int getN_de_integrantes() {
        return N_de_integrantes;
    }

    public void setN_de_integrantes(int n_de_integrantes) {
        this.N_de_integrantes = n_de_integrantes;
    }
    public void Alterar_integrantes(int integrantes_anterior, int nova_quantidade) throws Exception {
        if (nova_quantidade <= 0) {
            throw new Exception ("Quantidade inválida");
    }else{
            N_de_integrantes = nova_quantidade;
            throw new Exception("Quantidade alterada para" + nova_quantidade);
        }
}