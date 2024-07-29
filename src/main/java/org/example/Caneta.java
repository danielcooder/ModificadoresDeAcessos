package org.example;

    public class Caneta {

        public String modelo;
        public String cor;
        public float ponta;
        protected int carga;
        protected boolean tampada;

        public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Caneta de cor: " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga: " + this.carga + "%");
            System.out.println("Está tampada? " + this.tampada);
        }

        public void rabiscar(){

            if (this.tampada == true){
                System.out.println("Erro! Não posso rabiscar, a caneta esta tampada.");
            }else {
                System.out.println("Estou Rabiscando");
            }

        }
        protected void tampar(){
            this.tampada = true;
        }

        protected void destampar(){
            this.tampada = false;
        }

    }



