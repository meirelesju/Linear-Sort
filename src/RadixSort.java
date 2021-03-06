
import java.io.*; 
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julianny Meireles
 */
 
  
class RadixSort extends CountingSort{ 
  
    static void RadixSort(int A[]) 
    { 
        CountingSort counting = new CountingSort();

        //O maior tamanho de int que existe em java é na casa do bilhão
        int maiorInt = 1000000000;
        
        //inicializa no 1 pois é a primeira casa decimal a ser "analizada"
        //o for vai percorrer todas as casas dos elementos e dar countingSort em cada uma delas
        for (int i = 1; i <maiorInt; i *= 10) {
          
            Ordena(A, i);
        }
       
        
    } 
        static void print(int []A, int comprimento){
        for(int j = 0; j<comprimento;j++)
            System.out.println(A[j]);
        }
  
    //Ler o arquivo e armazenar os valores
    static  ArrayList<Integer> lista = new ArrayList<>();
        
        static ArrayList<Integer> arquivo(String arq) throws FileNotFoundException {

            Scanner ler = null;
           ler = new Scanner(new File(arq));
           while (ler.hasNext()) {
               lista.add(ler.nextInt());
           }
           ler.close();
           return lista;
       }
  
   
    public static void main (String[] args) throws FileNotFoundException 
    { 
        arquivo("src/num.1000.1.in");
        
        int A[] = new int [lista.size()];
           for(int i = 0; i<lista.size();i++){
               A[i]=lista.get(i);
           } 
         int comprimento = A.length;
        
         RadixSort(A); 
         print(A, comprimento);
    } 
} 
