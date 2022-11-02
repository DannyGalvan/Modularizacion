Funcion resultado<-Suma(operadorUno,operadorDos)
	
	Definir resultado como Real
	
	resultado <- operadorUno + operadorDos
FinFuncion


Funcion resultado<-Resta(operadorUno, operadorDos)
	
	Definir resultado Como Real
	
	resultado <- operadorUno - operadorDos

FinFuncion

Funcion resultado<-Multiplicacion(operadorUno,operadorDos)
	
	Definir resultado Como Real
	
	resultado <- operadorUno * operadorDos
	
FinFuncion

Funcion resultado<-Division(operadorUno,operadorDos)
	
	Definir resultado Como Real
	
	resultado <- operadorUno / operadorDos
FinFuncion



Algoritmo calculadora
	
	Definir operacion Como Entero
	Definir res,num1,num2 como Real
	Escribir "1.- Para Sumar";
	Escribir "2.- Para Restar";
	Escribir "3.- Para Multiplicar";
	Escribir "4.- Para Dividir";
	
	Leer operacion
	Escribir "Ingresa el primer numero"
	leer num1
	Escribir "Ingresa el segundo numero"
	leer num2
	
	Segun operacion Hacer
		1: res <- Suma(num1,num2)
		2: res <- Resta(num1,num2)
		3: res <- Multiplicacion(num1,num2)
		4: res <- Division(num1,num2)
	FinSegun
	
	Escribir "El resultado de su operacion es ", res;
	
FinAlgoritmo