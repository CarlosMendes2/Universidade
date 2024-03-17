# Controle
precoBolsaTecido = 100.00
precoBolsaCouro = 180.00
precoRelogioCouro = 150.00
precoRelogioMetal = 215.00
brinde = "→ Ganhou Chaveiro"

# Entrada
entrada = (input("O que deseja comprar?\n:")).upper()

# Processamento && Saída
if (entrada == "BOLSA"):
    bolsaEscolha = input("Deseja a bolsa de Couro ou de Tecido?\n:").upper()
    if (bolsaEscolha == "TECIDO"):
        print(f"{precoBolsaTecido:.2f}")
    elif (bolsaEscolha == "COURO"):
        print(f"{precoBolsaCouro:.2f}")
    else:
        print("Você digitou algo errado, tente novamente.")
elif (entrada == "RELOGIO"):
    relogioEscolha = input("Deseja o relógio de Couro ou de Metal:\n:").upper()
    if (relogioEscolha == "COURO"):
        print(f"{precoRelogioCouro:.2f}")
        print(brinde)
    elif(relogioEscolha == "METAL"):
        print(f"{precoRelogioMetal:.2f}")
        print(brinde)
else:
    print("Você digitou algo errado, tente novamente.")
