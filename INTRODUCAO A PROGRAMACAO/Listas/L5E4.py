# Crédito ou débito
# Sair, while(entrada!="SAIR"):
# quantidade de créditos realizados
# sáldo do hospital ( C´redito - débito)
# Positivo ou negativo , saldo



credito = 0
debito = 0
saldo = 0
negativoPositivo = ""
sinal = 0
movimentacaoCreditos = 0
entradaConfirm = ""

while(entradaConfirm != "SAIR"):
    entradaConfirm = input("Débito ou Crédito").upper()
    if(entradaConfirm == "DÉBITO"):
        entrada = float(input("Valor"))
        debito += entrada
    elif(entradaConfirm == "CRÉDITO"):
        entrada = float(input("Valor"))
        credito += entrada
        movimentacaoCreditos+=1

saldo = credito - debito
if(saldo > 0):
    negativoPositivo = "Saldo Positivo"
    sinal = ""
else:
    negativoPositivo = "Saldo Negativo"
    sinal = "-"


print(f"Quantidade de créditos: {movimentacaoCreditos}")
print(f"Saldo financeiro: {sinal}R$ {saldo:.2f} ")
print(negativoPositivo)
