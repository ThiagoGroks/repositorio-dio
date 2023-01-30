/*A ordem de orgnização seria: 1 os construtores; 2 os métodos simples;
 * e 3 os métodos mais complexos.
 */

class Carro {

    String cor;
    String modelo;
    int capacidadeDoTanque;

    //construtor aqui
    Carro() {

    }
    //sobrecarga de método (alteração na assinatura). Isso ajuda muito!!!!
    Carro(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }

    //método encher tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeDoTanque * valorCombustivel;
    }
}
