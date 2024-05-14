public class Personagem {
  private String nome;
  private String dano;
  private String textura;
  private String movimento;


    public Personagem(String movimento, String textura, String dano, String nome) {
        this.movimento = movimento;
        this.textura = textura;
        this.dano = dano;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }
}
