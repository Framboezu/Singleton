package Fila;

public class Fila {
	
	private static Fila instancia;
		
		private Fila(){}
		
		public static Fila getIntancia() 
		{
			if(instancia == null)
			{
				instancia = new Fila();
			}
			
			return instancia;
		}
		
		public void ImprimeDocumento() {}
		public void RemoveDocumento() {}
		public void RemoveTodosDocumentos() {}
		

}