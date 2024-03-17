# Digite um número
# Deseja continuar?
# Se não, exibir a soma dos números que são multiplos de 3.

#Variáveis de controle
entradaBool = "SIM"
multiplosTres = 0
#Processamento
while(entradaBool!= "NÃO"):
    entradaNumero = int(input("Dados de entrada: \n"))
    if (entradaNumero%3 == 0):
        multiplosTres+=entradaNumero
    entradaBool = input("continuar?\n").upper()

if(entradaBool == "NÃO"):
    print(f"Soma dos múltiplos de 3: {multiplosTres}")
    
