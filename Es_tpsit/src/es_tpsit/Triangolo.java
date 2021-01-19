/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_tpsit;

/**
 *
 * @author Nicolo
 */
public class Triangolo {
    
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    public String classificaTriangolo(){
        
        String definizione ="";
        if(lato1 == lato2 && lato1 == lato3 && lato2 == lato3 ){
            
            return definizione = "il triangolo è equilatero";
           
        }
        
        else if(lato1 != lato2 && lato1 != lato3 && lato2 != lato3){
           
           return definizione = "il triangolo è scaleno";
       }
       else if((lato1 == lato2 && lato1 != lato3) || (lato2 == lato3 && lato2 != lato1) || (lato1 == lato3 && lato1 != lato2)){
           
           return definizione = "il triangolo è isoscele";
       }
       
       return definizione = "il triangolo è rettangolo";
    }
    
    
    
    public double calcolaPerimetro(){
        
        return lato1 + lato2 + lato3;
        
    }
    
    public double calcolaArea(){
        
        double semiperimetro = this.calcolaPerimetro() / 2;
        double ris = semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3) ;
        
        return Math.sqrt(ris);
    }
  

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }
    

}
