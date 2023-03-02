package com.cursospringboot.controller;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Component;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Component
public class ReportUtil implements Serializable{

	
	//retorna nosso pdf em Byte para download no navegador
	public byte[] gerarRelatorio(List listDados, String relatorio, ServletContext servletContext) throws Exception{
		
		//cria a lista de dados para o relatorio com nossa lista de objetos para imprimir
		JRBeanCollectionDataSource jrbcds = new JRBeanCollectionDataSource(listDados);
		
		//carregar o caminho do arquivo jasper compilado
		String caminhoJasper = servletContext.getRealPath("relatorios") + File.separator + relatorio + ".jasper";
		
		//carregar o arquivo jasper passando os dados
		JasperPrint impressoraJasper = JasperFillManager.fillReport(caminhoJasper, new HashMap(), jrbcds);
		
		//exporta para byte e retorna em pdfs
		return JasperExportManager.exportReportToPdf(impressoraJasper);
		
		
		
	}
	
	
	
	
	

}
