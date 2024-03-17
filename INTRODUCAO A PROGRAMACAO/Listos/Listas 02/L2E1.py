letra = "A"
letras = []
contador = 0

for i in range(15):
    letras.append(input("→ ").upper())

for i in range(15):
    if(letras[i] == "A"):
        contador += 1
print(f"A letra {letra} apareceu {contador} vezes.")
