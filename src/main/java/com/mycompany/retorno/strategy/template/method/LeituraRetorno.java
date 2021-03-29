/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retorno.strategy.template.method;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author wellikson
 */
public interface LeituraRetorno {

    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    Boleto processarLinhaArquivo(String[] vetor);

}
