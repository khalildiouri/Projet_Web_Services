package com.upem.converter.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ConverterDAOImpl implements IConverterDAO {

	@Override
	@WebMethod
	public double ConvertirPoundToDollar(double pound) {
		// TODO Auto-generated method stub
		return pound*1.6;
	}

	@Override
	@WebMethod
	public double ConvertirEURToDollar(double montant) {
		// TODO Auto-generated method stub
		return montant*1.10;
	}

	@Override
	@WebMethod
	public double ConvertirEURToPound(double montant) {
		// TODO Auto-generated method stub
		return montant*0.72;
	}

	@Override
	@WebMethod
	public double ConvertirPoundToEUR(double montant) {
		// TODO Auto-generated method stub
		return montant*1.37;
	}

	@Override
	public double ConvertirDollarToPound(double montant) {
		// TODO Auto-generated method stub
		return montant*0.65;
	}

	@Override
	public double ConvertirDollarToEur(double montant) {
		// TODO Auto-generated method stub
		return montant*0.90;
	}
	
}
