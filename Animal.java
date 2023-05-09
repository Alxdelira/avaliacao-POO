public class Animal {
  private String nome;
  private String raca;
  private int idade;
  private boolean cinomose;
  private boolean fivFelv;
  private String tipo;

  public Animal(String nome, String raca, int idade, boolean cinomose, boolean fivFelv, String tipo) {
    this.nome = nome;
    this.raca = raca;
    this.idade = idade;
    this.cinomose = cinomose;
    this.fivFelv = fivFelv;
    this.tipo = tipo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public boolean isCinomose() {
    return cinomose;
  }

  public void setCinomose(boolean cinomose) {
    this.cinomose = cinomose;
  }
  public boolean isfivfel() {
    return fivFelv;
  }

  public void setfivFelv(boolean fivFelv) {
    this.fivFelv = fivFelv;
  }
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
