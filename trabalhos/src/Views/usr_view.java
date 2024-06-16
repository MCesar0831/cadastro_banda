package Views;

import DataBase.Db;
import models.usuario;
import services.usr_service;

import java.util.Scanner;

public class usr_view {
    public static void login() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Login:");
            System.out.println("Email");
            String email = sc.nextLine();
            System.out.println("Senha");
            String senha = sc.nextLine();

            usr_service servico = new usr_service();

            try {
                servico.login(email, senha);
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void logout() {
        usr_service servico = new usr_service();
        servico.logout();
        System.out.println("Usuário desconectado");
    }

    public static boolean mostrarMenu(usuario usrLogado) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Opções:");
        System.out.println(" 0 = Sair:");
        System.out.println(" 1 = Logout:");
        System.out.println(" 2 = Participantes:");
        int opcao = sc.nextInt();

        while (true) {
            switch (opcao) {
                case 0:
                    return false;
                case 1:
                    usr_service servico = new usr_service();
                    servico.logout();
                    return true;
                case 2:
                        System.out.println(Db.getusuarios());
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void iniciar() {
        usr_service servico = new usr_service();
        usuario usrLogado;

        boolean continuar;

        do {
            usrLogado = servico.getUsr_logado();
            if (usrLogado == null) {
                login();
            }
            usrLogado = servico.getUsr_logado();

            continuar.mostrarMenu(usrLogado);
        }while (continuar);
    }
}
