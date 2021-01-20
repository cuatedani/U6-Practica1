
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER}
 */
public class MetodosBusqueda {
    public int[] Datos=new int[25];
    
    MetodosBusqueda(){
        CrearArreglo();
    }
    
    public void CrearArreglo(){
        for(int i=0; i<25; i++){
            double v=Math.random()*100;
            int d=(int)v;
            Datos[i]=d;
        }
    }
    
    public String MostrarArreglo(){
        String Cadena="-";
        for(int i=0; i<25; i++){
            Cadena+=" "+Datos[i]+" -";
        }
        return Cadena;
    }
    
    public boolean BuscarSecuecial(int v){
        for(int i=0; i<25; i++){
            if(i==v){
                JOptionPane.showMessageDialog(null, "Valor encontrado despues de: "+i+" Secuencias");
                return true;
            }
        }
        return false;
    }
    
    public boolean BuscarBinario(int v){
        int LS=0;
        int LI=Datos.length;
        int M=(LS+LI)/2;
        
        if(v==Datos[M]){
            JOptionPane.showMessageDialog(null, "Valor encontrado en la posicion: " + M);
            return true;
        }
        if(v<Datos[M]){
            for(int i=M; i>=LS; i--){
                if(v==Datos[i]){
                    JOptionPane.showMessageDialog(null, "Valor encontrado despues de: " + (M-i)+" secuencias");
                    return true;
                }
            }
        }
        if(v>Datos[M]){
            for(int i=M; i<LS; i++){
                if(v==Datos[i]){
                    JOptionPane.showMessageDialog(null, "Valor encontrado despues de: " + (M+i)+" secuencias");
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public void OrdenarBurbuja(){
        int t;
        for(int i=0; i<25; i++){
            for(int j=1; j<25; j++){
                if(Datos[j]<Datos[j-1]){
                    t=Datos[j];
                    Datos[j]=Datos[j-1];
                    Datos[j-1]=t;
                }
            }
        }
    } 
}
