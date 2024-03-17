numeros = []

for i in range(5):
    numeros.append(int(input('| ')))

menor = numeros[0]

for i in range(5):
    if(numeros[i]<menor):
        menor = numeros[i]

print("O menor número é: ",menor)
