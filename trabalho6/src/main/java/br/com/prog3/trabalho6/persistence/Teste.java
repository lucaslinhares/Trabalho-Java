package br.com.prog3.trabalho6.persistence;

import java.sql.Connection;
import java.util.List;

import br.com.prog3.trabalho6.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Teste Save
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(8);
		a.setNome("Mariaaaa");
		a.setRa("Taguatinga");
		System.out.println(ad.save(a));
		
		//Teste update
		/*AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula Almeida");
		a.setRa("Taguatinga Norte");
		System.out.println(ad.update(a));*/
		
		//teste delete
		/*AlunoDaoImp ad = new AlunoDaoImp();
		System.out.println(ad.delete(6));*/
		
		//teste list
		/*AlunoDaoImp ad = new AlunoDaoImp();
		List<Aluno> alunos = ad.list();
		if(alunos != null){
		for(Aluno al : alunos){
		System.out.println("Aluno: "+al.getNome());
		}
		}*/
		
		//teste findByMatricula
		/*AlunoDaoImp ad = new AlunoDaoImp();
		Aluno aluno = ad.findByMatricula(2);
		if(aluno != null){
		System.out.println(aluno.getNome());
		}*/

	}

}
