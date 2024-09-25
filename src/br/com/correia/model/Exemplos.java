/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.correia.model;

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
public class Exemplos {
    
    public static void main(String[] args){
        
        //pegando a data atual no formato ano/mes/dia
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje); //formato ISO
        
        //criando uma variavel com data definida pelo usuario 
        LocalDate ano_novo = LocalDate.of(2025, Month.JANUARY, 1);
        System.out.println(ano_novo);
        
        //pegando trechos da data
        int ano = ano_novo.getYear(); //ano
        Month mes = ano_novo.getMonth(); //mes
        int dia = ano_novo.getDayOfMonth(); //dia        
        DayOfWeek semana = ano_novo.getDayOfWeek(); //dia da semana    
        
        System.out.println("o ano novo sera em: " + dia + " de " + mes + " de " + ano + " de uma " + semana);
        
        int dia_do_ano = hoje.getDayOfYear(); //dia do ano
        System.out.println(dia_do_ano);
        
        
        //calculando o tempo entre duas datas
        Period periodo = Period.between(hoje, ano_novo);
        System.out.println(periodo);
        
        //esse mesmo calculo pode ser separado em ano, mes e dia
        System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays()+ " dias");
        
        //formatador de dada e hora, no caso somente data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println(hoje.format(formatador));
        
        //cria uma variavel com data e hora
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        
        //formata a data e hora
        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        System.out.println(agora.format(formatador_horas));
        
        //cria uma variavel com hora já pre-definida.
        LocalTime intervalo = LocalTime.of(9, 30);
        System.out.println(intervalo);
        
        
        //adiciona ou retira 7 dias da data
        LocalDate finalDEsemanaFuturo = hoje.plusDays(7);
        LocalDate finalDEsemanaPassado = hoje.minusDays(7);
        
        System.out.println("pastWeekLocalDate = " + finalDEsemanaPassado);
	System.out.println("nextWeekLocalDate = " + finalDEsemanaFuturo);
        
    }
    
    
    
}
