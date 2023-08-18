public class app {
    public static void main(String[] args) {
        Aluno al = new Aluno("Vinicius", "1017");
        al.setEndereco("Rua Vinicius Cadorin");
        al.setNota1(10.0);
        al.setNota2(7.0);
        al.setNota3(8.0);
        al.imprimir();
        al.calcularMedia();
        System.out.println("Cadastro completo: " + al.validar());

    }
}
