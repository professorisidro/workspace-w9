package br.com.meli.databaseexample.service;

import java.util.List;

import br.com.meli.databaseexample.model.Miniserie;

public interface IMiniserieService {
	public Miniserie save(Miniserie miniserie);
	public Miniserie update(Miniserie miniserie);
	public Miniserie findById(Integer id);
	public List<Miniserie> findAll();
	public void deleteById(Integer id);
	public List<Miniserie> findSorted(String field, String sortingCriteria);
	
	public List<Miniserie> customSort(String field[], String sort[]);
}
