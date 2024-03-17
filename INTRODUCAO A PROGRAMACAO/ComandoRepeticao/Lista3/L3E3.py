# Entrada idade
# Registrar x>2 e x<7
# Sair do laço com não


entradaBool = ""
totalVacinas = 0

while(entradaBool != "NÃO"):
    entradaIdade = int(input("Idade:\n→"))
    entradaBool = input("Deseja Continuar?\n→").upper()
    if(entradaIdade > 2 and entradaIdade < 7):
        totalVacinas+=1
if(entradaBool == "NÃO"):
    print(f"Total de vacinas aplicadas: {totalVacinas}")
