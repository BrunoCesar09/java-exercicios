public class Ex101 {
    public static void main(String[]args){
        CartaoCredito p1 = new CartaoCredito("Mitla Yuki", 50000);
        p1.realizarCompra(3000);
        p1.realizarCompra(55000);
        System.out.println("Titular do cartão: " + p1.getTitular() + " - Limite atualizado: R$" + p1.getLimite());
        p1.pagarFatura(1500);
        System.out.println("Saldo devedor: " + p1.getSaldoDevedor());

        }
    }

