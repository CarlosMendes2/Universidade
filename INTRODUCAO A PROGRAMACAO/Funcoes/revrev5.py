quantSilva = 0
nomesCentro = []
bairrosVogal = []
dados = []
for i in range(5):
    nome = input()
    bairro = input()
    p = [nome,bairro]
    dados.append(p)

for i in range(len(dados)):
    nome = dados[i][0].split()
    for j in range(len(nome)):
        if(nome[j].upper() == "SILVA" or nome[j].upper() == "SOUSA"):
            quantSilva += 1

for i in range(len(dados)):
    if(dados[i][1].upper() == "CENTRO"):
        nome = dados[i][0].split()
        nomesCentro.append(nome[0].capitalize())

for i in range(len(dados)):
    vogal = ["A","E","I","O","U"]
    if (dados[i][0][0].upper() in vogal):
        if(dados[i][1] not in bairrosVogal):
            bairrosVogal.append(dados[i][1])

print(quantSilva)
print(nomesCentro)
print(bairrosVogal)
        
