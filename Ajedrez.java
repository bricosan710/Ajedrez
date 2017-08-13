
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

public class Ajedrez
{
   
    public static void inicio(){
      
      int fi = Integer.parseInt(JOptionPane.showInputDialog("fila inicial"));
      while(fi >= 8 ){
          JOptionPane.showMessageDialog(null, "La fila inicial supera el rango del tablero ");
          fi = Integer.parseInt(JOptionPane.showInputDialog("fila inicial"));
      }

      int ci = Integer.parseInt(JOptionPane.showInputDialog("columna inicial"));
      while(ci >= 8 ){
          JOptionPane.showMessageDialog(null, "La columna inicial supera el rango del tablero ");
          ci = Integer.parseInt(JOptionPane.showInputDialog("columna inicial"));
      }      
      
      int ff = Integer.parseInt(JOptionPane.showInputDialog("fila final"));
      while(ff >= 8 ){
          JOptionPane.showMessageDialog(null, "La fila final supera el rango del tablero ");
          ci = Integer.parseInt(JOptionPane.showInputDialog("fila final"));
      }     
      
      int cf = Integer.parseInt(JOptionPane.showInputDialog("columna final"));
      while(cf >= 8 ){
          JOptionPane.showMessageDialog(null, "La columna final supera el rango del tablero ");
          cf = Integer.parseInt(JOptionPane.showInputDialog("fila final"));
      }    

      int movimientos = evaluar(fi,ci,ff,cf); 
        //System.out.println("se requieren: "+movimientos+" movimientos");
        JOptionPane.showMessageDialog(null, "minima cantidad de movimientos: " + movimientos);
    }
        
    public static int evaluar(int fi, int ci,int ff,int cf){
    int movimientos=0;
   
    List<int[]> listaInicial = new ArrayList();
    List<int[]> listaSalida = new ArrayList();
    boolean cumplido=false;
    int FC[]= {fi,ci}; //pasa la fila inicial del vector coordenadas a la mariz de entrada
    listaInicial.add(FC);
    
    while(cumplido == false && movimientos<=20){
    
    
    for(int[] i: listaInicial){
        if((i[0]== ff) && (i[1]== cf)){
            cumplido=true;
        }
    }
    if(cumplido == true){
    return movimientos;
    }else{
    
        for(int[] i: listaInicial){
        int fila;
        int columna;
            
        fila = i[0]-2;
        columna = i[1]+1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]-2;
        columna = i[1]-1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]-1;
        columna = i[1]+2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]+1;
        columna = i[1]+2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]+2;
        columna = i[1]+1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]+2;
        columna = i[1]-1;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            fila = i[0]-1;
        columna = i[1]-2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
            
            
            fila = i[0]+1;
        columna = i[1]-2;
            if(fila>=0 && columna >= 0 && fila <=7 && columna <=7){
                int FCn[]= {fila,columna};
                listaSalida.add(FCn);
            }
        
        
        }
    
        listaInicial.clear();
        
        
        listaSalida.stream().forEach((i) -> {
            listaInicial.add(i);
        });
        
        listaSalida.clear();
        movimientos = movimientos +1;
        
    }
}
    return movimientos;
    }
    
    
}