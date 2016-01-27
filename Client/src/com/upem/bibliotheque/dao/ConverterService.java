package com.upem.bibliotheque.dao;

import com.upem.converterServices.ConverterDAOImpl;
import com.upem.converterServices.ConverterDAOImplService;

public class ConverterService implements IConverterService {

	ConverterDAOImpl dao;

	public ConverterService() {
		dao = new ConverterDAOImplService().getConverterDAOImplPort();
	}

	@Override
	public double ConvertirDollarToPound(double montant) {
		// TODO Auto-generated method stub
		return dao.convertirDollarToPound(montant);
	}

	@Override
	public double ConvertirDollarToEur(double montant) {
		// TODO Auto-generated method stub
		return dao.convertirDollarToEur(montant);
	}

	@Override
	public double ConvertirPoundToDollar(double montant) {
		// TODO Auto-generated method stub
		return dao.convertirPoundToDollar(montant);
	}

	@Override
	public double ConvertirPoundToEUR(double montant) {
		// TODO Auto-generated method stub
		return dao.convertirPoundToEUR(montant);
	}

	@Override
	public double ConvertirEURToDollar(double montant) {
		// TODO Auto-generated method stub
		return dao.convertirEURToDollar(montant);
	}

	@Override
	public double ConvertirEURToPound(double montant) {
		// TODO Auto-generated method stub
		return dao.convertirEURToPound(montant);
	}

}
