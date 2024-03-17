import revisao3prova

prima = 0
dados = []

for i in range(6):
    x = input()
    y = int(input())
    p = [x,y]
    dados.append(p)
for i in range(len(dados)):
    if(revisao3prova.defineEstacao(dados[i][0])== "Primavera"):
        prima += dados[i][1]
print(prima)
