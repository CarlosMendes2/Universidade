# Entrada quantidade de veículos
# Salvar cada valor acima de dois, se entrada = 3 entao salvar = 1
# 555 sai do laço e exibe multa



entrada = int(input("Dados de entrada: "))
valorMulta = 10
totalCarros = 0

while(entrada != 555):
    if(entrada > 2):
        totalCarros += (entrada - 2)
        totalAmais= entrada - 2
        multa = totalAmais * valorMulta
        print(f"Multa casa: R${multa}")
    else:
        print("Multa Casa: R$0")
    entrada = int(input("Dados de entrada: "))

if(entrada == 555):
    total = totalCarros * valorMulta
    print(f"Total arrecadado R${total}")
