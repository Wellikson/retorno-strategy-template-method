/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retorno.strategy.template.method;

import java.time.LocalDate;

/**
 *
 * @author wellikson
 */
public class LeituraRetornoBancoBrasil implements LeituraRetorno {

    @Override
    public Boleto processarLinhaArquivo(String[] vetorLinhaArq) {
        Boleto boleto = new Boleto();
        boleto.setId(Integer.parseInt(vetorLinhaArq[0]));
        boleto.setCodBanco(vetorLinhaArq[1]);
        boleto.setDataVenc(LocalDate.parse(vetorLinhaArq[2], FORMATO_DATA));
        boleto.setDataPag(LocalDate.parse(vetorLinhaArq[3], FORMATO_DATA).atTime(0, 0, 0));

        boleto.setCpfCliente(vetorLinhaArq[4]);
        boleto.setValor(Double.parseDouble(vetorLinhaArq[5]));
        boleto.setMulta(Double.parseDouble(vetorLinhaArq[6]));
        boleto.setJuros(Double.parseDouble(vetorLinhaArq[7]));

        return boleto;
    }

}
