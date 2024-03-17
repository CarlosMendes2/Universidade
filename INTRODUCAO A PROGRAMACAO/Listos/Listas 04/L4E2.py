# Mes, receita, despesas
# Recebidos nos 5 primeiros meses
# Nome dos meses que despesas > 2500
# Quantidade meses que receita maior que despesas
# Mes com maiaor despesa
# Receita média anual


orcamentoVinteTres = []
recebidosCincoPrimeirosMeses = 0
mesMaiorQueDoisQuinhentos = []
quantidadeMesesNoLucro = 0

for i in range(12):
    mes = input("Mês: ").upper()
    receita = float(input("Receita: "))
    despesas = float(input("Despesas: "))
    p = [mes,receita,despesas]
    orcamentoVinteTres.append(p)

quantidadeMeses = len(orcamentoVinteTres)

for i in range(5):
    recebidosCincoPrimeirosMeses += orcamentoVinteTres[i][1]


for i in range(quantidadeMeses):
    if(orcamentoVinteTres[i][2] > 2500):
        mesMaiorQueDoisQuinhentos.append(orcamentoVinteTres[i][0])
        
for i in range(quantidadeMeses):
    if(orcamentoVinteTres[i][1] > orcamentoVinteTres[i][2]):
        quantidadeMesesNoLucro += 1
        
mesMaisGastadorCompara = orcamentoVinteTres[0][2]
mesMaisGastador = ""
for i in range(quantidadeMeses):
    if(orcamentoVinteTres[i][2] > mesMaisGastadorCompara):
        mesMaisGastadorCompara = orcamentoVinteTres[i][2]
        mesMaisGastador = orcamentoVinteTres[i][0]

receitaTotal = 0
for j in range(quantidadeMeses):
    receitaTotal += orcamentoVinteTres[j][1]

receitaMediaAnual = receitaTotal / quantidadeMeses



print(orcamentoVinteTres)
print("------")
print("Total recebido nos 5 primeiros meses:\n",recebidosCincoPrimeirosMeses)
print("------")
print("Meses em que a despesa foi superior a R$ 2500:\n",mesMaiorQueDoisQuinhentos)
print("------")
print("Quantidade de meses em que a receita foi maior que a despesa:\n",quantidadeMesesNoLucro)
print("------")
print("Mês em que houve a maior despesa: \n",mesMaisGastador)
print("------")
print("Receita média anual:\n",receitaMediaAnual)

