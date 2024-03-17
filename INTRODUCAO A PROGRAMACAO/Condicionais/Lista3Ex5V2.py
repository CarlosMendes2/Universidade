precoFilmeDoisD = 8.50
precoFilmeTresD = 14.50
precoComboSimples = 10
precoComboCompleto = 12

entradaTipoFilme = input("Filme 2D ou 3D?\n: ").upper()

if (entradaTipoFilme == "2D"):
    lanche = input("Deseja comprar lanche? Se sim, combo completo ou simples?\n: ").upper()
    if (lanche == "NAO"):
        print(f"R${precoFilmeDoisD:.2f}")
    elif (lanche == "SIMPLES"):
        precoTotal = precoFilmeDoisD+precoComboSimples
        print(f"R${precoTotal:.2f}")
    elif (lanche == "COMPLETO"):
        precoTotal = precoFilmeDoisD+precoComboCompleto
        print(f"R${precoTotal:.2f}")
    else:
        print("Você digitou algo incorreto, tente novamente.")
elif (entradaTipoFilme == "3D"):
    lanche = input("Deseja comprar lanche? Se sim, combo completo ou simples?\n: ").upper()
    if (lanche == "NAO"):
        print(f"R${precoFilmeTresD:.2f}")
    elif (lanche == "SIMPLES"):
        precoTotal = precoFilmeTresD+precoComboSimples
        print(f"R${precoTotal:.2f}")
    elif (lanche == "COMPLETO"):
        precoTotal = precoFilmeTresD+precoComboCompleto
        print(f"R${precoTotal:.2f}")
    else:
        print("Você digitou algo incorreto, tente novamente.")
else:
    print("Você digitou algo incorreto, tente novamente.")
    
