numeros = []
soma = []

for i in range(5):
    numeros.append(int(input("→ ")))

numeros.append(0)


for i in range(5):
    soma.append(numeros[i]+numeros[i+1])

numeros.pop()

print(numeros)
print(soma)
