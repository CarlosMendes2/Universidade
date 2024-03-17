notas = []
acimaDeOito = 0


for i in range(5):
    notas.append(float(input("→ ")))

for i in range(5):
    if(notas[i] > 8):
        acimaDeOito += 1

print("Notas acima de 8: ",acimaDeOito)
