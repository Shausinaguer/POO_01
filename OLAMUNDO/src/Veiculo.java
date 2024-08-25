public class Veiculo {
    private String cor;
    public String Modelo;
    private String Marca;
    float capacidadeTanque;
    int qtdPorta;
    int velocidade;

    public void acelerar(){
        velocidade = velocidade +1;
    }

    public void parar(){
        velocidade = velocidade -1;
    }

    public String buzina(){
        return "BI-BI!";
    }
}
