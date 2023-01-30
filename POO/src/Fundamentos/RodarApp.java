class RodarApp {
    
    public static void main(String[] args) {
         //vamos criar um objeto
         Carro carro1 = new Carro(); //carro1 é um objeto;
         //e tem acesso a todos os atributos em Carro.java;
         
         carro1.setCor("Azul");
         carro1.setModelo("Palio");
         carro1.setCapacidadeDoTanque(45);
        
         System.out.println(carro1.getModelo());
         System.out.println(carro1.getCor());
         System.out.println(carro1.getCapacidadeDoTanque());
         System.out.println(carro1.totalValorTanque(5.29));

         //Bora de novo
         Carro carro2 = new Carro("Branco", "Corsa", 45);
         System.out.println(carro2.getCor());
         System.out.println(carro2.getModelo());
         System.out.println(carro2.getCapacidadeDoTanque());
         System.out.println(carro2.totalValorTanque(4.99));

        }
}
