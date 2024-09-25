/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.correia.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author fe_li
 */
public class Carregando_ano {
    
    
    public void carregando(){
        
        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        LocalDate primeiro_dia = LocalDate.of(ano, Month.JANUARY, 1);
        LocalDate ultimo_dia = LocalDate.of(ano, Month.DECEMBER, 31);
        int dia_ano = hoje.getDayOfYear();
        
//        Duration dias = Duration.between(primeiro_dia, ultimo_dia);

        long dias = ChronoUnit.DAYS.between(primeiro_dia, ultimo_dia);
        
        long porce = dia_ano*100/dias;
        
        System.out.println("dias do ano de " + ano + " = " + dias);
        System.out.println("hoje e o dia " + dia_ano + " do ano de " + ano);
        System.out.println("equivale a " + porce + "% do ano de " + ano);
        
    }
    
    public static void main(String[] args){
        Carregando_ano p = new Carregando_ano();
        p.carregando();
    }
    
}
