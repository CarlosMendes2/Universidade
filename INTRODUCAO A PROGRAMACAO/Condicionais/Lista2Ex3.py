numeroUm = int(input("Insira um número\n"))
numeroDois = int(input("Insira um número\n"))
numeroTres = int(input("Insira um número\n"))


if(numeroUm>numeroDois and numeroUm>numeroTres):
    print("→ O maior número é",numeroUm)
elif(numeroDois>numeroTres and numeroDois>numeroUm):
    print("→ O maior número é",numeroDois)
else:
    print("→ O maior número é",numeroTres)
