package projeto_final_bloco_1;

public class PacoteBasico implements PacoteTuristico {
    @Override
    public double calcularPreco() {
        return 100.0; /

    @Override
    public String descricao() {
        return "Básico: 2 dias + acomodação + refeição";
    }
}