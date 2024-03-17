import revisao3prova

dados = []
for i in range(6):
    x = input()
    y = int(input())
    p = [x,y]
    dados.append(p)

maior = dados[0][1]
maiorMes = ""
for i in range(len(dados)):
    if(dados[i][1]>maior):
        maior = dados[i][1]
        maiorMes = dados[i][0]
mestacao = revisao3prova.defineEstacao(maiorMes)
print(mestacao)
