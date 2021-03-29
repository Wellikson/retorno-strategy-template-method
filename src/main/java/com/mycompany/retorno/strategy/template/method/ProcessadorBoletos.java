/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retorno.strategy.template.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wellikson
 */
public class ProcessadorBoletos {
    
    private LeituraRetorno leituraRetorno;
    
    public ProcessadorBoletos(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
    
    public final List<Boleto> processar(String nomeArquivo){
        try{
            BufferedReader  reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String line;
            List<Boleto> boletos = new ArrayList<>();
            while((line = reader.readLine())!=null){
                String [] vetor = line.split(";");
                Boleto boleto = leituraRetorno.processarLinhaArquivo(vetor);
                boletos.add(boleto);
                System.out.println(boleto);
            }
            return boletos;
        }catch(IOException ex){
            throw new UncheckedIOException(ex);
        }
    }
}
