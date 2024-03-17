import bibLetras

entrada = input()

letras = entrada.split()

contador = 0
for i in range(len(letras)):
    if (bibLetras.testaVogal(letras[i]) == True):
        contador+=1

print(contador)
