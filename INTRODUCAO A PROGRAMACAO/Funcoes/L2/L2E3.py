import Ano

dados = []
for i in range(6):
    entrada = input()
    mesQuant = entrada.split()
    dados.append(mesQuant)

visitantesPrimavera = 0
for i in range(len(dados)):
    if(Ano.defineEstacao(dados[i][0]) == "Primavera"):
        visitantesPrimavera += int(dados[i][1])

print(visitantesPrimavera)
