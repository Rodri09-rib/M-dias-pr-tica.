import java.util.Scanner;
 public class HelloWorld{
     public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);
         
            System.out.println ("---------------------------------");
            System.out.println ("             Médias          ");
            System.out.println ("---------------------------------"); 
            System.out.println ("Informe seu nome: ");
            
              String nome = scanner.nextLine();
              
               System.out.println (nome + ", informe sua primeira nota:");
                double n1 = scanner.nextDouble();
              
               System.out.println ("Infome sua segunda nota:");
                double n2 = scanner.nextDouble();
              
               System.out.println ("Por fim, informe sua última nota:");
                double n3 = scanner.nextDouble();
              
                 double M = (n1 + n2 + n3) / 3; 
              
                  if (M >= 7) 
                   {System.out.printf (nome + ", Parabéns, você foi aprovado com média:  %.1f",  M);}
                    else {System.out.printf (nome + ", você não atingiu a média... Sua média foi: %.1f", M);}
              
          /*Lembrar de fechar o scanner!
          Lembrar de usar o %2.f para casa decimais,
          com o printf!*/ 
          
           scanner.close();   
     }
 }