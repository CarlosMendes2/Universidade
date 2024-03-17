tabela = []
timesParaibaPernambucoMais = []
pontosTotais = 0
pontuacaoMG = 0


quantidadeTimes = int(input("Informe a quantidade de Times: "))

for i in range(quantidadeTimes):
    print("Informe os dados do time")
    entradaNome = input("Nome: ").upper()
    entradaEstado = input("Estado: ").upper()
    entradaPontos = int(input("Pontuação: "))
    time = [entradaNome,entradaEstado,entradaPontos]
    tabela.append(time)

for i in range(quantidadeTimes):
    if(tabela[i][1] == "PB" or tabela[i][1] == "PE" and tabela[i][2]> 100):
        timesParaibaPernambucoMais.append(tabela[i][0])

timeInformado = input("Qual time de interesse?")

for i in range(quantidadeTimes):
    if(tabela[i][0] == timeInformado):
        print(f"Pontuação do {tabela[i][0]}: {tabela[i][2]}") #

for i in range(quantidadeTimes):
    if(tabela[i][1] == "MG"):
        pontuacaoMG += tabela[i][2]

quantidadeTimesRJ = 0
pontosTimesRJ = 0
for i in range(quantidadeTimes):
    if(tabela[i][1] == "RJ"):
        quantidadeTimesRJ += 1
        pontosTimesRJ += tabela[i][2]

mediaPontosRJ = pontosTimesRJ / quantidadeTimesRJ

maiorPontuacao = tabela[0][2]
timeCampeao = tabela[0][0]
for i in range(quantidadeTimes):
    if (tabela[i][2] > maiorPontuacao):
        maiorPontuacao = tabela[i][2]
        timeCampeao  = tabela[i][0]


print(tabela)
print("Pontuação PB e PE com mais de 100 pontos: ",timesParaibaPernambucoMais)#
print(f"Pontuação times de MG: {pontuacaoMG}")#
print(f"Media de pontos dos times do RJ: {mediaPontosRJ}")#
print(f"O Campeão é o {timeCampeao}")
