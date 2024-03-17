numeros = []
multiploDeTres = []
for i in range(8):
    numeros.append(int(input("→ ")))
for i in range(8):
    if(numeros[i] % 3 == 0):
        multiploDeTres.append(numeros[i])
print(multiploDeTres)
