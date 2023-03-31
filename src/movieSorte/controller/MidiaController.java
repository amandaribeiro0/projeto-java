package movieSorte.controller;

import java.util.ArrayList;

import movieSort.model.Midia;
import movieSort.repository.MidiaRepository;

public class MidiaController implements MidiaRepository{
	private ArrayList<Midia> listaMidias = new ArrayList<Midia>();
	@Override
	public void cadastrar(Midia midia) {
		// TODO Auto-generated method stub
		listaMidias.add(midia);
	}
	
}
