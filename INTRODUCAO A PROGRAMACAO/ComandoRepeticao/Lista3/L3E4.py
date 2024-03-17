# Entrada número de familiares
# "Não",sai do laço e exibe custo e quantidade de familiares
# Cada familiar vale R$14

valorFamiliar = 14
quantidadePessoas = 0
entradaBool = ""

while(entradaBool != "NÃO"):
    entrada = int(input("Quantidade Familiares: \n→"))
    quantidadePessoas+= entrada + 1
    entradaBool = input("Deseja informar mais dados? \n→").upper()

if(entradaBool == "NÃO"):
    custoFesta = quantidadePessoas * valorFamiliar
    print(f"Custo da festa: {custoFesta}")
    print(f"Total de participantes: {quantidadePessoas}")
