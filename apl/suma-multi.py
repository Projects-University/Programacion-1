"""
1. El usuario quiere leer 2 números enteros positivos de hasta 8 cifras, realizar la suma e imprimir su resultado
2. El usuario quiere leer 2 números enteros positivos de hasta 8 cifras, realizar la multiplicación, utilizar sumas sucesivas y presentar su resultado
"""
def leerNumeros():
    num1 = int(input("Ingrese el primero número (hasta 8 cifras): "))
    if(len(str(num1)) > 8 or num1 < 0):
        print("No puedes ingresar un número mayor a 8 cifras o número negativo")
        return
    num2 = int(input("Ingrese el segundo número (hasta 8 cifras): "))
    if(len(str(num2)) > 8 or num2 < 0):
        print("No puedes ingresar un número mayor a 8 cifras o número negativo")
        return
    decision = input("Escribe para sumar (+) ó para multiplicar (*): ")
    if decision == "*":
        resultado = multiplicacion(num1,num2)
    elif decision == "+":
        resultado = suma(num1,num2)
    else:
        print("El valor dado no es válido")
        return
    imprimir(resultado)

def imprimir(resultado):
    print(f"El resultado es {resultado}")

def suma(num1,num2):
    suma = 0
    suma = num1+num2
    return suma
def multiplicacion(num1,num2):
    multiplicacion = 0
    for i in range(num2):
        multiplicacion = multiplicacion+num1
    return multiplicacion

def main():
    leerNumeros()

main()
