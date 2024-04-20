/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alura;

/**
 *
 * @author elani
 */
public class Semana5 {
    public static void main(String[] args) {
       //jeito hard       
       System.out.println(">>> Listagem Clientes - jeito Hard");
       System.out.println("--------------------------");
       System.out.println("Nome: Fulano");
       System.out.println("Data de Nascimento: 1950");
       System.out.println("--------------------------");
       System.out.println("Nome: Pessoa");
       System.out.println("Data de Nascimento: 1990 \n ");
      
       
       //hard
       double preco1 = 49.95;
       System.out.println("\n>>> Listagem Produtos");
       System.out.println("--------------------------");
       System.out.println("Nome: Celular ");//sem var
       System.out.println("Preço R$: "+ preco1);
       System.out.println("--------------------------");
       //*****
       String produto = "Livro";
       double preco = 49.95;
       int precoInt = (int)preco;
       System.out.println("\n>>> Listagem Produtos");
       System.out.println("--------------------------");
       System.out.println("Nome: "+ produto);
       System.out.println("Preço R$: "+ preco);
       System.out.println("Preço R$: "+ precoInt);
       System.out.println("--------------------------");
       
       //jeito primitivo
       String nome = "Cicrano";
       int dataNasc = 2000;
       int idade = 2024 - dataNasc;
       String caracteristicaEtaria = getCaracteristicaEtaria(idade);
                          
       System.out.println(" >>> Listagem Clientes - jeito Primitivo");
       System.out.println("--------------------------");
       System.out.println("Nome: "+ nome);
       System.out.println("Data de Nascimento: "+ dataNasc);
       System.out.println("Idade: "+ idade);
       System.out.println("Caracteristica etaria: "+ caracteristicaEtaria);
       System.out.println("--------------------------");
    }
       
    private static String getCaracteristicaEtaria(int idade){
        if(idade <=17){
           return "ADOLESCENTE";
        }
        if (idade >=18 && idade <=29){
           return "JOVEM";
        }
        if (idade >=30 && idade >=59){
           return "ADULTO";
        }
        return "IDOSO" ;  
    }

    /**
    Nosso desafio será alterar a listagem de clientes 
    para implementar a característica etária do cliente.
    Regra de negócio. 
    Classificação etária
    Se idade <= 17 então "ADOLESCENTE"
    Se idade >= 18 E idade <=29 então "JOVEM"
    Se idade >=30 E idade <=59 então "ADULTO"
    Se idade >= 60 então "IDOSO"
    **/
       
       
}     
      
           

    
         

