import random

numeros = []
soma = 0
impares = 0



# Processamento

for i in range(10):
    numeros.append(random.randint(1,40))

primeiro = numeros[0]
ultimo = numeros[9]
menor = numeros[0]

for i in range(5):
    soma += numeros[i]

for i in range(10):
    if(numeros[i] < menor):
        menor = numeros[i]
for i in range(10):
    if(numeros[i]%2 != 0):
        impares += 1




# Prints
print(f"Primeiro: {primeiro} | Último: {ultimo}")
print(f"Soma 5 primeiros: {soma}")
print(f"Menor elemento: {menor}")
print(f"Ímpares: {impares}")
print(numeros)
