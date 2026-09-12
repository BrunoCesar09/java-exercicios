public class CentralDeComando {
    void acionarDispositivo (Dispositivo d){
        d.executarAcaoPrincipal();
    }
    void autenticarEAcionar(Dispositivo d, String senha){
        if(d instanceof Autenticavel){
            Autenticavel d1 = (Autenticavel) d;
            if(d1.autenticar(senha)) {
                d.ligar();
                d.executarAcaoPrincipal();
            }
            else{
                System.out.println("Senha incorreta.");
            }

            }
        else{
            d.ligar();
            d.executarAcaoPrincipal();

        }
        }
    }

