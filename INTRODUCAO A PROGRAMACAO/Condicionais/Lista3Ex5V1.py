precoFilmeDoisD = 8.50
precoFilmeTresD = 14.50
precoComboSimples = 10
precoComboCompleto = 12

entradaTipoFilme = input("Filme 2D ou 3D?\n: ").upper()

if (entradaTipoFilme == "2D"):
    lanche = input("Deseja comprar lanche?\n: ").upper()
    if (lanche == "NAO"):
        print(f"{precoFilmeDoisD:.2f}")
    elif (lanche == "SIM"):
        escolhaLanche = input("Deseja o combo Simples ou Completo?").upper()#
        if (escolhaLanche == "SIMPLES"):
            precoTotal = precoFilmeDoisD+precoComboSimples
            print(f"{precoTotal:.2f}")
        elif (escolhaLanche == "COMPLETO"):
            precoTotal = precoFilmeDoisD+precoComboCompleto
            print(f"{precoTotal:.2f}")
        else:
            print("Você digitou algo incorreto, tente novamente.")
    else:
        print("Você digitou algo incorreto, tente novamente.")
elif (entradaTipoFilme == "3D"):
    lanche = input("Deseja comprar lanche?\n: ").upper()
    if (lanche == "NAO"):
        print(f"{precoFilmeTresD:.2f}")
    elif (lanche == "SIM"):
        escolhaLanche = input("Deseja o combo Simples ou Completo?").upper()#
        if (escolhaLanche == "SIMPLES"):
            precoTotal = precoFilmeTresD+precoComboSimples
            print(f"{precoTotal:.2f}")
        elif (escolhaLanche == "COMPLETO"):
            precoTotal = precoFilmeTresD+precoComboCompleto
            print(f"{precoTotal:.2f}")
        else:
            print("Você digitou algo incorreto, tente novamente.")
    else:
        print("Você digitou algo incorreto, tente novamente.")
else:
    print("Você digitou algo incorreto, tente novamente.")
    
