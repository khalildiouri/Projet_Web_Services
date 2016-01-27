package com.upem.converter.dao;

public interface IConverterDAO {

	public double ConvertirDollarToPound(double montant);
	public double ConvertirDollarToEur(double montant);
	public double ConvertirPoundToDollar(double montant);
	public double ConvertirPoundToEUR(double montant);
	public double ConvertirEURToDollar(double montant);
	public double ConvertirEURToPound(double montant);
}
