Enunciado
Se define el valor de trayectoria pesada de una hoja de un arbol binario como la suma del
contenido de todos los nodos desde la raz hasta la hoja multiplicado por el nivel en el que se
encuentra. Implemente un metodo que, dado un arbol binario, devuelva el valor de la trayectoria
pesada de cada una de sus hojas. Considere que el nivel de la raz es 1.
Para el ejemplo de la gura: trayectoria pesada de la hoja 4 es: (4 * 3) + (1 * 2) + (7 * 1) = 21


Algorithm 1 versión en pseudocódigo de un recorrido preorden:  


Método_Principal(A)

if A no es Vacío  then
    
   Nivel = Nivel + 1 ;	
   
   void Función_Sumar(A.dato)
	  
   if A tiene hijo izquierdo then
       Método_Principal(A.Izq)
    end if
	
   if A tiene hijo derecho then
      Método_Principal(A.Der)
	  
    end if
end if

else Si A es Vacío 
     Imprimir ( La suma total hasta la hoja es %d, &Lista_de_Suma_Parcial.getDato());
	 
	 return (A, Nivel, Lista_de_Suma_Parcial) ;
	 
	 
end function




void Función_Sumar( A, Nivel, Lista_de_Suma_Parcial)  {
	
	Lista_de_Suma_Parcial.getDato() = Lista_de_Suma_Parcial.getDato() + (Lista_de_Suma_Parcial.getDato()* Nivel );
	
	return Lista_de_Suma_Parcial();
	
		
	
	
}



