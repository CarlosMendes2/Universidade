# Atraso < 2 horas = R$30
# Atraso até 3 horas R$ 80
# Atraso > 3 horas 40 reais a hora

# Valor da diaria do veículo alugado
# Quantidade de dias de alugel
# Tempo de atraso na devolução em horas

atrasoMenosDuasH = 30.00
atrasoAteTresH = 80
atrasoMaisDeTresh = 40.00
# Horrível não poder fazer isso

entradaValorDiario = int(input("Valor diária\n:→ "))
entradaQuantidadeDias = int(input("Quantidade dias\n:→ "))
entradaAtraso = input("Entregou atrasado?\n").upper()

if (entradaAtraso == "SIM"):
    horasAtraso = int(input("Quantas horas atrasado?\n:→ "))
    if (horasAtraso < 2):
        valorTotal = (entradaValorDiario*entradaQuantidadeDias)+atrasoMenosDuasH
        print(f"{valorTotal:.2f}")
    elif(horasAtraso <=3):
        valorTotal = (entradaValorDiario*entradaQuantidadeDias)+atrasoAteTresH
        print(f"{valorTotal:.2f}")
    else:
        atrasoMaisDeTresh = horasAtraso * 40.00
        valorTotal = (entradaValorDiario*entradaQuantidadeDias)+atrasoMaisDeTresh
        print(f"{valorTotal:.2f}")
elif(entradaAtraso == "NAO"): 
    valorTotal = (entradaValorDiario*entradaQuantidadeDias)
    print(f"{valorTotal:.2f}")
else:
    print("Você digitou algo incorreto, tente novamente.")
        
