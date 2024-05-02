//Diederich isaac Gonzalez Lopez 2024 1365U
import java.util.Scanner;
public class App {

   public static int dimensionarreglo=0;
   public static Scanner leer=new Scanner (System.in);
   public static boolean cont = true;
    public static void main(String[] args) throws Exception {      
        
            do { 

                try{
                System.out.println("Digite la dimension de su arreglo");
                dimensionarreglo= leer.nextInt();
                if (dimensionarreglo>=2 && dimensionarreglo<=16 ) {
                System.out.println("Su arreglo es:");
                cont=false;
                } else {
                    System.out.println("Rango no valido");
                }
                } catch (Exception e) {
                    System.out.println(e);   
                    System.out.println("Opcion invalida, no puede colocar letras");
                    leer.nextLine();
                }
            } while (cont); 

            int array []= llenararreglo();
            System.out.println("Mostrar Arreglo:");
            Mostrar(array);
            System.out.println("Arreglo Inverso:");
            inverso(array);
            }
            //Llenando arreglo
            public static int [] llenararreglo(){
            int [] arreglo = new int[dimensionarreglo];
            do {
                    try{
                        for (int i = 0; i < arreglo.length; i++) {
                         arreglo[i]=leer.nextInt();  
                        } 
                        cont=false;
                    }  catch (Exception e){
                        System.out.println(e);
                        System.out.println("Digite unicamente numeros:");
                        leer.nextLine(); 
                    }
            } while (cont);

            return arreglo;
        }
            //Mostrando arreglo
            public static void Mostrar (int[]dimensionarreglo){
            for (int i : dimensionarreglo) {
            System.out.println(i);  
                    }
          }   
            //Arreglo Inverso
            public static void inverso(int[]arregloinverso){
            for (int i = arregloinverso.length-1; i >=0; i--) {
                System.out.println(arregloinverso[i]);           
            }
        } 
 }      