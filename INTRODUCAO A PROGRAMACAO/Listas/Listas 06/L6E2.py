funcionariosHotel = [ [ "Guilherme Sá", 26, "Segurança", 852.30 ],[ "Laura Dias", 31, "Recepção", 715.00 ],[ "Sônia Lopes", 44, "Lavanderia", 807.90 ],[ "Roberto Reis", 22, "Garagem", 475.69 ] ]
print(funcionariosHotel)

#A - Alterar o valor do salário da funcionária Laura Dias para R$ 950,14.
print("-----------------------------")
funcionariosHotel[1][3] = 950.14
print(funcionariosHotel)

#B - Acrescentar na lista o funcionário Anísio Nunes, que trabalha no setor Garagem,tem 38 anos e ganha R$ 760,00.
print("-----------------------------")
funcionariosHotel.append(["Anísio Nunes",38,"Garagem",760.00])
print(funcionariosHotel)

#C - Aumentar o salário de todos os funcionários do setor Lavanderia em 10%.
print("-----------------------------")
tamanho = len(funcionariosHotel)
for i in range(tamanho):
    funcionariosHotel[i][3] = funcionariosHotel[i][3] * 1.1
print(funcionariosHotel)

#D - Exibir a idade e o salário do terceiro funcionário da lista.
print("-----------------------------")
print(f"Idade: {funcionariosHotel[2][1]} | Salário: {funcionariosHotel[2][3]}")

#E - Exibir nome e setor de todos os funcionários com menos de 30 anos.
print("-----------------------------")
for i in range(tamanho):
    if(funcionariosHotel[i][1]<30):
        print(f"Funcionario com mais de 30 anos: {funcionariosHotel[i][0]}")
#F - Exibir o nome de todos os funcionários do setor de Lavanderia.
print("-----------------------------")
for i in range(tamanho):
    if(funcionariosHotel[i][2] == "Lavanderia"):
        print(f"Funcionários da Lavanderia: {funcionariosHotel[i][0]}")
#G - Exibir a média de idade dos funcionários do setor Garagem.
print("-----------------------------")
garagemIdadeSoma = 0
garagemQuantidadeFunc = 0
for i in range(tamanho):
    if(funcionariosHotel[i][2] == "Garagem"):
        garagemIdadeSoma += funcionariosHotel[i][1]
        garagemQuantidadeFunc += 1
        
mediaIdadesGaragem = garagemIdadeSoma/garagemQuantidadeFunc
print("Média de idades da Garagem: ",mediaIdadesGaragem)


#H - Exibir o nome do funcionário que ganha o maior salário.
print("-----------------------------")
maiorSalario = funcionariosHotel[0][3]
nomeMaiorSalario = ""
for i in range(tamanho):
    if(funcionariosHotel[i][3]>maiorSalario):
        maiorSalario = funcionariosHotel[i][3]
        nomeMaiorSalario = funcionariosHotel[i][0]
print(f"Maior Salário é da: {nomeMaiorSalario}")

#I - Exibir a quantidade de funcionários que ganham mais de R$ 700 e têm menos de 40 anos.
print("-----------------------------")
quantidadeMaisMenos = 0
for i in range(tamanho):
    if(funcionariosHotel[i][3] > 700 and funcionariosHotel[i][1] < 40):
        quantidadeMaisMenos += 1
print(f"Ganha mais de R$700 e tem menos de 40 anos: {quantidadeMaisMenos}")


#J - Exibir o nome do setor que tem o funcionário mais velho.
print("-----------------------------")
setorMaisOld = ""
maisVelho = funcionariosHotel[0][1]
for i in range(tamanho):
    if(funcionariosHotel[i][1] > maisVelho):
        maisVelho = funcionariosHotel[i][1]
        setorMaisOld = funcionariosHotel[i][2]
print(f"Setor mais velho {setorMaisOld}")

#K - Exibir uma lista com o nome dos funcionários que ganham acima da média salarial da empresa.
salarioSoma = 0
for i in range(tamanho):
    salarioSoma += funcionariosHotel[i][3]
media = salarioSoma / tamanho

maisQueMedia = []
for i in range(tamanho):
    if(funcionariosHotel[i][3] > media):
        maisQueMedia.append(funcionariosHotel[i][0])
print(f"Ganham acima da média {maisQueMedia}")














