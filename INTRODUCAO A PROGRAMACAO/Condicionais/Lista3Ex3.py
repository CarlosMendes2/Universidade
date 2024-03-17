brindePosto = "Ganhou troca de óleo"
naoBrinde = "Não ganhou troca de óleo"
precoLGasolina = 2.53
precoLEtanol = 2.09
precoLDiesel = 1.92

entrada = input("Qual o tipo de combústível\n:").upper()

if(entrada == "GASOLINA"):
    entradaValorL = float(input("Valor?\n")) # Float/int entrada questao
    valorTotal = entradaValorL/precoLGasolina
    print(f"Litros → {valorTotal:.2f}")
    print(naoBrinde)
elif(entrada == "ETANOL"):
    entradaValorL = float(input("Valor?\n")) 
    if(entradaValorL>=40):
        valorTotal = entradaValorL/precoLEtanol
        print(f"Litros → {valorTotal:.2f}")
        print(brindePosto)
    elif(entradaValorL<40):
        valorTotal = entradaValorL/precoLEtanol
        print(f"Litros → {valorTotal:.2f}")
        print(naoBrinde)
elif(entrada == "DIESEL"):
    entradaValorL = float(input("Valor?\n")) 
    valorTotal = entradaValorL/precoLDiesel
    print(f"Litros → {valorTotal:.2f}")
    print(naoBrinde)
else:print("Digite um combustível válido")
    
