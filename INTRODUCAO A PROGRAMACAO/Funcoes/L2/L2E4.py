# Qual mes com maiar público
# exibe a estacao do mes

import Ano

dados = []
for i in range(6):
    entrada = input()
    mesQuant = entrada.split()
    m = mesQuant[0]
    p = int(mesQuant[1]) 
    dados.append([m,p])

mesSucesso = dados[0][1]
nomeMesSucesso = ""

for i in range(len(dados)):
    if(dados[i][1] > mesSucesso):
        mesSucesso = dados[i][1]
        nomeMesSucesso = dados[i][0]
       
print(Ano.defineEstacao(nomeMesSucesso))
