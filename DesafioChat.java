import java.util.Scanner;
public class DesafioChat{
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        int opcao,indice = 0;
        String [] nomes = new String[10];
        int [] quantidade = new int [10];
        double [] preco = new double[10];

        do{
            System.out.println();
            System.out.println("      Menu de prdutos       ");
            System.out.println(" 1 - Cadastrar produto      ");
            System.out.println(" 2 - Listar produtos        ");
            System.out.println(" 3 - Atualizar quantidade   ");
            System.out.println(" 4 - Buscar produto         ");
            System.out.println(" 0 - Sair         ");
            System.out.println();
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    entrada.nextLine();
    
                    System.out.print("Informe o nome do produto ");
                    nomes[indice]= entrada.nextLine();
                    
                    System.out.print("Informe a quantidade do produto ");
                    quantidade[indice] = entrada.nextInt();
                    
                    System.out.print("Informe o preco do produto ");
                    preco[indice] = entrada.nextDouble();

                    indice++;
                    break;
                case 2:
                    entrada.nextLine();

                    for(int i=0; i < indice; i++){
                        System.out.println("Produto : " + nomes[i] + " Quantidade : " + quantidade[i] + " Preço : " + preco[i]);
                    }    
                    break;
                case 3:
                    entrada.nextLine();
                    boolean produtoEncontrado = false;

                    System.out.print(" Informe Qual produto deseja atualizar : ");
                    String produto = entrada.nextLine();
                    for(int i=0; i < indice; i++){
                            if (nomes[i].equals(produto)){
                                    System.out.print("Informe a nova quantidade do produto :");
                                    quantidade[i] = entrada.nextInt();
                                    produtoEncontrado = true;
                                    break;
                            }
                    }        
                    if (!produtoEncontrado){
                        System.out.println("Produto não encontrado");
                    }

                    break;
                case 4:
                    entrada.nextLine();

                    System.out.print("Informe qual produto deseja buscar :");
                    String produtoBusca = entrada.nextLine();
                    for (int i=0; i < indice; i++){
                        if (nomes[i].equals(produtoBusca)){
                            System.out.println("Produto : " + nomes[i]);
                            System.out.println("Quantidade : " + quantidade[i]);
                            System.out.println("Preço : " + preco[i]);
                            break;
                        }else{
                            System.out.println("Produto não encontrado");
                        }break;
                    }    
                    break;   
            
                }
        }
        while (opcao != 0);
        System.out.println("Programa encerrado");
        entrada.close();
    }
}