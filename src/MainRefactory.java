public class MainRefactory {

    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();
        novoPedido.criarPedido();

        System.out.println(novoPedido.valor);
    }
}
