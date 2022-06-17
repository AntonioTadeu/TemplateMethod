ublic abstract class Aluno {

    private int Chamada;
    protected String nome;
    private float Presenca;
    private float falta;

    public int getChamada() {
        return chamada;
    }

    public void setChamada(int Chamada) {
        this.Chamada = Chamada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPresenca() {
        return Presenca;
    }

    public void setPResenca(float Presenca) {
        this.Presenca = Presenca;
    }

    public float getFalta() {
        return falta;
    }

    public void setFalta(float falta) {
        this.falta = falta;
    }

    public float calcularMedia() {
        return (this.Presenca + this.falta) / 2;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Aluno";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matricula=" + this.Presenca +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}