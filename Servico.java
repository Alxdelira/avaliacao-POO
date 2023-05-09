public class Servico {
    private Cliente cliente;
    private String descricao;
    private double valor;
    private Animal animal;

    public Servico(Cliente cliente, String descricao, double valor, Animal animal) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.animal = animal;
    }

    // getters e setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
