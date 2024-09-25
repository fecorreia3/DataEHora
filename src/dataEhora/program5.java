/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataEhora;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fe_li
 */
public class program5 {
    
    public static void main(String[] args){
        
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); //formato ISO
        
        LocalDate ano_novo = LocalDate.of(2025, Month.JANUARY, 1);
        System.out.println(ano_novo);
        
        int ano = ano_novo.getYear();
        Month mes = ano_novo.getMonth();
        int dia = ano_novo.getDayOfMonth();        
        DayOfWeek semana = ano_novo.getDayOfWeek();    
        
        System.out.println("o ano novo sera em: " + dia + " de " + mes + " de " + ano + " de uma " + semana);
        
        int dia_do_ano = hoje.getDayOfYear();
        System.out.println(dia_do_ano);
        
        
        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);
        
        System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays()+ " dias");
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(hoje.format(formatador));
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        
        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        System.out.println(agora.format(formatador_horas));
        
        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println(intervalo);
        
        
    }
    
    
}
