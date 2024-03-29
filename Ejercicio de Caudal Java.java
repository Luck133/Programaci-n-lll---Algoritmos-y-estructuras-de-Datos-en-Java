public class ArbolGeneral<Float> (){ // no se pide que el arbol sea de ese tipo sino que solo se recorra
	//metodos de la clase arbol
	private NodoGeneral<Float> Raiz;

	public float[] caudalMinimo(){//ojo!!! el enunciado dice que recibe el parametro de n litros
				
		float acum = new float();
		float[] caudMin = {new float(999999)};
		calcularCaudalMinimo(this ,acum ,caudMin);
		return caudMin[0];		
		
	}

	public void calcularCaudalMinimo(ArbolGeneral<float> Red, float acum ,float[] caudMin){
		// FIJATE QUE EN EL CASO DE QUE LA TENGA SOLO UN ELEMENTO EL ARBOL, O SEA SEA UNA HOJA NO ACTUALIZAS BIEN EL MINIMO		
		if ( red.getDatoRaiz() != null ){
			acum = red.getDatoRaiz();
			listaEnlazadaGenerica<ArbolGeneral<float>> hijos = red.getHijos();
			if ( hijos.tamanio() > 0 ){
				if (caudMin[0] > acum/hijos.tamanio()){
					caudMin[0] = acum/hijos.tamanio();
				}
				hijos.comenzar();
				while ( !hijos.fin()) {
					ArbolGeneral<float> aux = hijos.proximo();
					if ( aux.getDatoRaiz() != null ){
						calcularCaudalMinimo(aux, acum, caudMin);// FIJATE QUE ACUM NUNCA LO ESTAS MODIFICANDO ->
												//A MEDIDA QUE SE VA METIENDO RECURSIVAMENTE EN PROFUNDIDAD
					}
				}
			}		
		}
	}

}

POSIBLE SOLUCION

public class ArbolGeneral<T> (){ 
	//metodos de la clase arbol

	public float[] caudalMinimo(float n){ 
				
		
		float[] caudMin = {99999.0};
		calcularCaudalMinimo(n ,caudMin);
		return caudMin[0];		
		
	}	
	public void calcularCaudalMinimo(float litros ,float[] caudMin){
		// este metodo lo separaría en 2 partes, primero evaluar si estoy en una hoja para poder actualizar el minimo de ser necesario
		// de no ser asi preguntaria por el else y llamaria recursivamente
		if (this.getDatoRaiz() != null){
			if (this.getHijos().tamanio() == 0){ // es una hoja 
				if (caudMin[0]> acum) caudMin[0] = listros;			
			}else{
				listaEnlazadaGenerica<ArbolGeneral<float>> hijos = this.getHijos();
				hijos.comenzar();
				while (! hijos.fin()){
					hijos.proximo().calcularCaudalMinimo(litros/hijos.tamanio(),caudMin);
				}
			}
		}
	}
	
}
