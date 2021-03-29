package com.mycompany.retorno.strategy.template.method;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author wellikson
 */
public class Principal{

    public static void main(String[] args) {
        ProcessadorBoletos processador = new ProcessadorBoletos(new LeituraRetornoBradesco());
        String nomeArquivo = "bradesco-1.csv";
        processador.processar(nomeArquivo);
    }
}
