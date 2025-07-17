package estudante;

public class Estudante {
	public double nota;
	public String nome;
	public  double[] notas;
	
	public void CalcularNota(double nota, String nome, double[] notas){
		this.nome=nome;
		this.nota=nota;
		this.notas=notas;
		double notaTotal=0;
		  for (int i = 0; i < notas.length; i++) {
			  notaTotal += notas[i];
	        }
		
		 notaTotal+=this.nota;
		  
		 
		 if(notaTotal>60) {
			 System.out.println("Nota Final: "+notaTotal+"\n PASS ");
		 }else {
			 System.out.println("Nota Final: "+notaTotal+"\n Faltam: "+(60-notaTotal));
		 }
		 
		 
	}


}
