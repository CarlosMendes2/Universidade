numeros = []
menorN = 0
for i in range(5):
    numeros.append(int(input("→ ")))
    menorN = numeros[i]

for i in range(5):
    
    if(numeros[i] < menorN):
        menorN = numeros[i]

print(f"Menor número {menorN}")
