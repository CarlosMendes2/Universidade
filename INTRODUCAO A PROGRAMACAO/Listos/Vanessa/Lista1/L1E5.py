numeros = []
maiorQue = 0
for i in range(5):
    numeros.append(float(input("| → ")))

for i in range(5):
    if(numeros[i] > 8):
        maiorQue+=1
print(f"{maiorQue} notas.")
