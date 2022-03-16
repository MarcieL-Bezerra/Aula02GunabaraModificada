public class Caneta {
    public String modelo;
    public String cor;
    private Double ponta;
    protected int carga;
    protected boolean tampada;

    public Double getPonta() {
        return ponta;
    }

    public void setPonta(Double ponta) {
        this.ponta = ponta;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta : " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);

    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rasbicar");
        }else {
            System.out.println("Rabiscando");
        }

    }

    public void tampar(){
        this.tampada = true;

    }
    public void destampar(){
        this.tampada = false;

    }
}
