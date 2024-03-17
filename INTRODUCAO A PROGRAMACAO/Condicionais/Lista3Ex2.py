# Entrada
# Xerox → preto||branco → nPag → print
# Encadernacao → nFolhas → +100?||-100? → print

precoXeroxPB = 0.06
precoXeroxCor = 0.29
precoEncadernaCem = 2.00
precoEncadernaMaisCem = 4.00 

entrada = input("Desejas Xérox ou Encadernação?\n:").upper()

if(entrada == "XEROX"):
    numeroPaginas = int(input("Numero de paginas?\n:"))
    escolhaXerox = input("A Xérox será Colorida ou Preto e Branco(PB)\n:").upper()
    if (escolhaXerox == "PB"):
        precoTotalXerox = numeroPaginas*precoXeroxPB
        print(f"R${precoTotalXerox:.2f}")
    elif(escolhaXerox == "COLORIDA" or escolhaXerox == "COLORIDO"):
        precoTotalXerox = numeroPaginas*precoXeroxCor
        print(f"R${precoTotalXerox:.2f}")
    else:
        print("Você digitou algo errado, tente novamente.")
elif(entrada == "ENCADERNAÇAO"):
    numeroDeFolhas = int(input("Quantas folhas deseja encadernar?\n:"))
    if (numeroDeFolhas > 100):
        precoTotalEncaderna = numeroDeFolhas * precoEncadernaMaisCem
        print(f"R$:{precoEncadernaMaisCem:.2f}")
    elif (numeroDeFolhas<=100):
        precoTotalEncaderna = numeroDeFolhas * precoEncadernaCem
        print(f"R$:{precoEncadernaCem:.2f}")
    else:
        print("Você digitou algo errado, tente novamente.")
else:
    print("Você digitou algo errado, tente novamente.")
        
    
