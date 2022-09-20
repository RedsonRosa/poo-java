package poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void Main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Aluno a1 = new Aluno();
		a1.setCpf(Long.valueOf(431098657));
		a1.setMatricula(Long.valueOf(123456789));	
		a1.setNome("Red");
		a1.setDataNasc(LocalDate.now());
		
		Aluno a2 = new Aluno();
		a2.setCpf(Long.valueOf(974362789));
		a2.setMatricula(Long.valueOf(212345636));	
		a2.setNome("Blue");
		a2.setDataNasc(LocalDate.now());
		
		Aluno a3 = new Aluno();
		a3.setCpf(Long.valueOf(234654129));
		a3.setMatricula(Long.valueOf(432654789));	
		a3.setNome("Black");
		a3.setDataNasc(LocalDate.now());
			
		Professor p1 = new Professor();
		p1.setCpf(Long.valueOf(193567289));
		p1.setSiape(Long.valueOf(432654789));	
		p1.setNome("Pink");
		p1.setDataNasc(LocalDate.now());
		
		Professor p2 = new Professor();
		p2.setCpf(Long.valueOf(434567027));
		p2.setSiape(Long.valueOf(432654789));	
		p2.setNome("Green");
		p2.setDataNasc(LocalDate.now());
		
		Professor p3 = new Professor();
		p3.setCpf(Long.valueOf(323232323));
		p3.setSiape(Long.valueOf(432654789));	
		p3.setNome("Yellow");
		p3.setDataNasc(LocalDate.now());
	}
}
