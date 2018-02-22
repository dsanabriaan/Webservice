/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuesto;

import java.util.Scanner;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Singleton
@LocalBean


public class calculo {
    @WebMethod(operationName = "calcular")
    public double calcular(@WebParam(name = "valor") double valor){
        
        double impuesto = 0;
        double iva = 0.16;
        double total = 0;
        impuesto = valor * iva;
        total = valor + impuesto;
        return total;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese valor");
        calculo c = new calculo();
        System.out.println("el valor es " + c.calcular(entrada.nextDouble()));
        
        
    }
    
    
    
}
