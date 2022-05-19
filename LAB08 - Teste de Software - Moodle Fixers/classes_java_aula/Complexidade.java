/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mackenzie.complexidade;

/**
 *
 * @author Gustavo
 */
public class Complexo {
    
    public static void acimaMedia(double a[]){

	double soma = 0, media;
	String msg = "";

	for(int i = 0; i < a.length; i++){
		msg += a[i] + " ";
		soma += a[i];
	}

	media = soma / a.length;
	msg += "\nSoma: " + soma;

	int cont = 0;

	for(int i = 0; i < a.length; i++){
		if(a[i] > media){
			cont++;
		}
	}

	msg += "\nQuantidade de elementos acima da media: " + cont;
	System.out.println(msg);
    }  
    
    
    public static void abaixoMedia(double a[]){

	double soma = 0, media;
	String msg = "";

	for(int i = 0; i < a.length; i++){
		msg += a[i] + " ";
		soma += a[i];
	}

	media = soma / a.length;
	msg += "\nSoma: " + soma;

	int cont = 0;

	for(int i = 0; i < a.length; i++){
		if(a[i] < media){
			cont++;
		}
	}

	msg += "\nQuantidade de elementos abaixo da media: " + cont;
	System.out.println(msg);
    }
    
}
