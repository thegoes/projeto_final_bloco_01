package projeto_final_bloco_1;

public class PacotePremium implements PacoteTuristico {
    @Override
    public double calcularPreco() {
        return 200.0;
    }

    @Override
    public String descricao() {
        return "Premium - 2 dias + acomodação - refeição + tour personalizado com guia + passeio de barco";
    }
}