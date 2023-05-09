public class Principal {
    public static void main(String[] args) {
        // criando o endereço do cliente
        Endereco endereco = new Endereco("Centro", "Rua das Flores", 2502, "Vilena", "Ro", "76985-048");

        // criando o cachorro do cliente
        Animal animal = new Animal("Mateus", "Vira-lata", 2, true,false,"Cachorro");

        // criando o cliente com o cachorro e o endereço
        Cliente cliente = new Cliente("Theodoro", 20, endereco, animal);

        // criando o serviço realizado no Pet Shop
        Servico servico = new Servico(cliente, "Banho e tosa", 50.0, animal);

        // exibindo as informações do serviço realizado
        System.out.println("Serviço realizado: " + servico.getDescricao());
        System.out.println("Valor cobrado: R$ " + servico.getValor());
        System.out.println("Cliente: " + servico.getCliente().getNome());
        System.out.println("Animal: " + servico.getAnimal().getNome());
        System.out.println("Tipo de Animal: " + animal.getTipo());
        System.out.println("Teste de Cinomose: " + animal.isCinomose());
    }
}
