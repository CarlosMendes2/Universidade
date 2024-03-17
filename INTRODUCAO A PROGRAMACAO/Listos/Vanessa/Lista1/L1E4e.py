numeros = []
soma = []

for i in range(5):
    numeros.append(int(input("| → ")))

for i in range(5):
    soma.append(numeros[i]+numeros[i+1])

print(numeros)
print(soma)
