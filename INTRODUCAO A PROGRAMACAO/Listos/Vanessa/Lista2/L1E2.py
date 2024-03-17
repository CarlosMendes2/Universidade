numero = []

for i in range(5):
    numero.append(int(input("→")))

for i in range(5):
    if (numero[i]%2 == 0):
        print(f"{numero[i]} é par.")
tamanho = len(numero)

print(f"a lista possui {tamanho} números")
