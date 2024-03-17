# Crianças<10 anos e idosos>60 não pagam
# Entrada idade e confirmação para continuar
# Exibir gratuidades


gratuidades = 0
entradaBool = ""

while(entradaBool != "NÃO"):
    entradaIdade = int(input("Idade:\n→"))
    entradaBool = input("Deseja Continuar?").upper()
    if (entradaIdade <= 10 or entradaIdade > 60):
        gratuidades+=1
if(entradaBool == "NÃO"):
    print(f"Total de entradas gratuitas: {gratuidades}")

