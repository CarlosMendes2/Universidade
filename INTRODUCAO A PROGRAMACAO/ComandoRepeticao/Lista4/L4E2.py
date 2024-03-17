# Depois de entrar com 5 números, imprimir a quantidade de pares && positivos
paresEpositivos = 0
controle = 5

while(controle > 0):
    entrada = int(input("Digite um número: "))
    if(entrada % 2 == 0 and entrada > 0):
        paresEpositivos+=1
    controle-=1
if(controle == 0): print(f"Quantidade: {paresEpositivos}")
