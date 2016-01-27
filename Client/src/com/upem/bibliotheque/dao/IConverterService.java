package com.upem.bibliotheque.dao;

public interface IConverterService {

	public double ConvertirDollarToPound(double montant);
	public double ConvertirDollarToEur(double montant);
	public double ConvertirPoundToDollar(double montant);
	public double ConvertirPoundToEUR(double montant);
	public double ConvertirEURToDollar(double montant);
	public double ConvertirEURToPound(double montant);
}
