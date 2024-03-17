estados = []

for i in range(10):
    nome = input("Nome: ").upper()
    regiao = input("Região: ").upper()
    quantidadeMunicipios = int(input("Quant de municípios: "))
    quantidadeHabitantes = int(input("Quant de habitantes: "))
    p = [nome, regiao,quantidadeMunicipios,quantidadeHabitantes]
    estados.append(p)

quantidade = len(estados)

estadosSul = []
for i in range(quantidade):
    if(estados[i][1] == "SUL"):
        estadosSul.append(estados[i][0])

estadosNordesteMaisCem = 0
for i in range(quantidade):
    if(estados[i][1] == "NORDESTE" and estados[i][2]>100):
        estadosNordesteMaisCem += 1

quantidadeCitiesNorth = 0
for i in range(quantidade):
    if(estados[i][1] == "NORTE"):
        quantidadeCitiesNorth += estados[i][2]

quantidadeCentOesQuin = 0
for i in range(quantidade):
    if(estados[i][1] == "CENTRO-OESTE" and estados[i][3] < 500000):
        quantidadeCentOesQuin+=1

quantEstSudeste = 0
quantHabSudeste = 0

for i in range(quantidade):
    if(estados[i][1] == "SUDESTE"):
        quantEstSudeste += 1
        quantHabSudeste += estados[i][3]
        
mediaHabSudeste = quantHabSudeste/quantEstSudeste


print("Estados do sul\n",estadosSul)#
print("-------")
print("Quant estados do nordeste com > 100 muni:\n", estadosNordesteMaisCem)#
print("-------")
print("Quant total de cidades dos Estados da Região Norte:\n",quantidadeCitiesNorth)#
print("-------")
print("Quant de Estados Centro-Oeste com menos de 500 mil habitantes:\n",quantidadeCentOesQuin)#
print("-------")
print("Quant média habitantes da Região Sudeste:\n",mediaHabSudeste)#


