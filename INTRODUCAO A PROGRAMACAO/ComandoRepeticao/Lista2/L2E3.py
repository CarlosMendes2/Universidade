# A entrada será vários anos.
# Entrada de número negativa sai do laço e exibe quantos anos bissextos entraram
# Um ano bissexto é múltiplo de 400
# // // // múltiplo de 4 mas não é múltiplo de 100

entrada = int(input("Digite um ano: "))
anosBissextos = 0

while(entrada > 0):
    if(entrada % 400 == 0 or (entrada % 4 == 0 and entrada % 100 != 0)):
        anosBissextos += 1
    entrada = int(input("Digite um ano: "))
if(entrada < 0):
    print(anosBissextos)
