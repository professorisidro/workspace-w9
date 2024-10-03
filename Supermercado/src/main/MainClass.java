package main;

import model.Cliente;
import repo.CrudRepo;
import repo.GenericRepo;

public class MainClass {
	public static void main(String[] args) {
		
		CrudRepo<Cliente, Integer> repo = new GenericRepo<>();
		
		repo.create(new Cliente(1,"Professor","Isidro"));
		repo.create(new Cliente(2,"Matheus", "Freitas"));
		repo.create(new Cliente(3,"Marcos","Goulart"));
		repo.create(new Cliente(4,"Jorge","Milagres"));
		repo.create(new Cliente(5,"Carlos","Castro"));
		repo.create(new Cliente(6,"Thiago","Cordeiro"));
		repo.create(new Cliente(7,"Gustavo","Breve"));
		
		
		System.out.println(repo.findAll());
		
		System.out.println(repo.findById(2));
		
	}
	
	
}
