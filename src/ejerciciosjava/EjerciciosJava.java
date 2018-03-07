/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * @author bea y bequi
 */
public class EjerciciosJava {

    public int calendario(int d) { 
      int diaS = 31;
      int I = 0;
      int dia = 0;
 
    for(int i =1; i < d ; i++){ 
        System.out.print("XX "); 
        if(i%7 == 0){ 
            System.out.println();
             } 
        }
    for(int i =d; i < diaS -1 ; i++){ 
        if(i+1-d <= 9){ 
            System.out.print("0");
        } 
        
        System.out.print(i+1-d);
           System.out.print(" ");
           if(i%7 == 0){ 
            System.out.println();
        } 
       I = i;   
    } 
   
    for(int j= I+2-d; j<=diaS -1; j++){ 
                System.out.print(j);
                System.out.print(" "); 
                dia +=1;
                if( dia == 6 ){ 
            System.out.println();
        }  
                
           }
   return diaS;
    
    } 
    
    
    
   public String acronimo (String frase){ 
   String acro="";
       String letra1 = frase.substring(0,1);
       
       for(int i=0; i<frase.length(); i++){
        
         if(frase.charAt(i)== ' ' && (!frase.substring(i+1,i+2).equals("y") && !frase.substring(i+1,i+2).equals("e") &&
           !frase.substring(i+1,i+3).equals("de") && !frase.substring(i+1,i+3).equals("la") && !frase.substring(i+1,i+4).equals("las"))){
          i++;
          acro+= frase.substring(i,i+1);
         }
           
       }
        
       return letra1+acro;
    } 
   
    public boolean anagrama(String p1, String p2){
            p1.toLowerCase();//Ponemos ambos strings a lowercase por sistema para evitar problemas con mayúsculas.
            p2.toLowerCase();
            String cadena="";//string auxiliar donde vamos a guardar el resultado.
            int aux=0; //contador para determinar la posición de los char y poder recorrer todo el string con un while.
            boolean stopb=false; //booleano que cambiará a true cuando detecte la letra, para parar el bucle while.
            
            
            for(int i=0; i<p1.length();i++){
                aux=0;         //se resetean los valores al inicio de una nueva vuelta del bucle.
               stopb=false;
                
              if(p2.length() != p1.length()){ //Si las longitudes varían, devuelve false.
                return false;
              }
              while(aux<p1.length() && stopb == false){  //Condiciones del bucle while que se va a ejecutar con intención
                 if(p1.charAt(i)==p2.charAt(aux)){  //de comprobar cada char dentro de cada vuelta del bucle, creando
                   cadena+=p1.substring(i,i+1);                //un nuevo string con las letra recolocadas.
                   stopb=true;
                 }
                 aux++;
       
              }
              
            }
          
            return stopb;
    } 
    
    public boolean escaleraDePalabras(char[][]listaPalabras){  
         boolean korso = true;
      int numFallos = 0;

        for (int fila = 1; fila < listaPalabras.length; fila++) 
        {
            for (int columna= 0; columna < listaPalabras[fila].length; columna++) {      
              

                if (listaPalabras[fila][columna] != listaPalabras[fila - 1][columna]) 
                {
                    numFallos++;
                }
            }
            if (numFallos != 1)
            {
               korso = false;
            }
         numFallos= 0;
        }
        return korso;
    }
    public int adn(char[][] cadenaADN) {
    int fallos = 0;
	
	    for (int columna = 0; columna < cadenaADN[1].length; columna++) {
                
            
if (cadenaADN[0][columna] == cadenaADN[1][columna] && cadenaADN[0][columna] != '-') {			//Ahora comprueba si los nucleotidos son iguales
	    fallos++;
             
	  
	}
	if (cadenaADN[0][columna] == '-' || cadenaADN[1][columna] == '-') {				//Aquí comprueba si hay algún par vacío 
	    fallos ++;
          
	    
	}
										//Para el resto de comprobaciones transforma las 'A' en 'T' y las 'G' en 'C' para luego compararlas 
	if (cadenaADN[0][columna] == 'A') {
	    cadenaADN[0][columna] = 'T';
	}
	if (cadenaADN[1][columna]== 'A') {
	    cadenaADN[1][columna] = 'T';
	}
	if (cadenaADN[0][columna] == 'G') {
	   cadenaADN[0][columna] = 'C';
	}
	if (cadenaADN[1][columna] == 'G') {
	    cadenaADN[1][columna] = 'C';
	}
	if (cadenaADN[0][columna] != cadenaADN[1][columna]) {					//Ahora las compara, si no son iguales, suma 1 fallo.
	    fallos++;
	

   
        }
            }
            return fallos;
        } 

            
 
    public static void main (String[] args) { 
          EjerciciosJava ejercicio1 = new EjerciciosJava();  
          System.out.println("");
       System.out.println(ejercicio1.calendario(10)); 
         System.out.println(ejercicio1.acronimo("Tecnología de	la Información y de las	Comunicaciones")); 
       System.out.println(ejercicio1.anagrama("amor","mora"));
         
	//Pruebas para esEscalera
	char[][] listaPalabras = {
	    {'P', 'A', 'T', 'A'},
	    {'P', 'A', 'T', 'O'},
	    {'R', 'A', 'T', 'O'},
	    {'R', 'A', 'M', 'O'},
	    {'G', 'A', 'M', 'O'},
	    {'G', 'A', 'T', 'O'},
	    {'M', 'A', 'T', 'O'},};


	
	System.out.println(ejercicio1.escaleraDePalabras(listaPalabras));
        
        char[][] cadenaADN = {
	    {'T', '-', '-', '-'},
	    {'T', 'G', 'C', 'A'}}; 
        System.out.println(ejercicio1.adn(cadenaADN));
        
    }
    }
    
        
    

