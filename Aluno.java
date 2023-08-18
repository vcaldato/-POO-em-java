public class Aluno{
    private String nome;
    private String numeroMatricula;
    private String endereco;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno() {
        this.nome = "";
        this.numeroMatricula = "";
        this.endereco = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public Aluno(String nome,String numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.endereco = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroMatriula(String numeroMatricula) {
        return numeroMatricula;
    }
    public void  setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

   public void calcularMedia() {
    double media = (nota1 + nota2 + nota3) / 3;
    System.out.println("Média das notas é: " + media);

   }
   public void imprimir(){
    System.out.println("Nome: "+ nome);
    System.out.println("Número de Matrícula: "+ numeroMatricula);
    System.out.println("Endereço: "+ endereco);
    System.out.println("Nota 1 é: "+ nota1);
    System.out.println("Nota 2 é: "+ nota2);
    System.out.println("Nota 3 é: "+ nota3);

   }
   public boolean validar() {
    return nome.length() >= 3 && numeroMatricula.length() >= 3 && endereco.length() >= 3;
   }


    }
