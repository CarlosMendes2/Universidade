letras = []
quantidade = 0

for i in range(3):
    letras.append(input("→ ").upper())

for i in range(3):
    if(letras[i] == "A"):
        quantidade += 1

print(quantidade)

