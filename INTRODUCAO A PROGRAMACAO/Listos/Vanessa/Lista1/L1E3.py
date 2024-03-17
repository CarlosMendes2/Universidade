numeros = []
multiplo = []
for i in range(8):
    numeros.append(int(input("|→ ")))
    if((numeros[i]%3)==0):
        multiplo.append(numeros[i])  

print(multiplo)
