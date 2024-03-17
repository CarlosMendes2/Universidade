#entrada serão vários números
#o valor 100 vai finalizar o laço e exibir a média dos números pares da entrada.

entrada = 1
contadorPares = 0
valorPares = 0

while( entrada != 100 ):
    if(entrada%2 == 0):
        contadorPares += 1
        valorPares += entrada
        print("+1 par")
    entrada = int(input("Digite um número: ")) 
        
if(entrada == 100 and contadorPares != 0):
    media = valorPares // contadorPares
    print(media)
else:
    print("Não foram lidos números pares: ")
    
















  
