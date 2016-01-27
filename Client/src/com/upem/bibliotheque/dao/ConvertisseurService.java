package com.upem.bibliotheque.dao;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import org.tempuri.ConverterSoapProxy;

public class ConvertisseurService {

	public ConvertisseurService() {
		// TODO Auto-generated constructor stub
	}

	public double convert(String from,String to,double mt) throws RemoteException{
		return (new ConverterSoapProxy().getConversionAmount(from, to, new ConverterSoapProxy().getLastUpdateDate(),
				BigDecimal.valueOf(mt)).doubleValue());
		
	}
}
