###############################################
# Entrada e Saída - Lista de Exercícios 02    #
###############################################
#             Exercício numero 1              #
###############################################
#precoDuziaLararnja = 9.75;
#valorDaLaranja = precoDuziaLararnja/12;
#infoValorOrange = print(f"Olá, o valor da unidade da Laranja é R${valorDaLaranja:.2f}",);
#qntOrange = float(input("Insira a quantidade desejada de laranjas\n"));
#valorPagamento = valorDaLaranja*qntOrange;
#print(f"Você deve pagar {valorPagamento:.2f}");
###############################################
#             Exercício numero 2              #
###############################################
# 1P = 400g + 6 Latas
# 1p = R$16.4 + R$31.2
#pessoa = input("Quantas pessoas vão para o churras?\n");
#carnePorPessoa = float(pessoa)*16.4;
#cervejaPorPessoa = float(pessoa)*31.2;
#print("----------------------------------\n",pessoa,"Pessoas\n----------------------------------");
#print(f"R${carnePorPessoa:.2f} Total Carne | R${cervejaPorPessoa:.2f} Total Cerveja");
###############################################
#             Exercício numero 3              #
###############################################
#custoBrigadeiro = 1.9;
#custoLittleKiss = 1.7;
#print("-------------------------------------");
#qntBrigadeiros = int(input("-------------------------------------\nQuantidade brigadeiros pedidos\n-------------------------------------\n:"));
#qntBeijinho = int(input("-------------------------------------\nQuantidade beijinhos pedidos \n-------------------------------------\n:"));
#qntCriancas = int(input("-------------------------------------\nQuantas criancas foram convidadas?\n-------------------------------------\n:"));
#docinhosTotal = qntBrigadeiros+qntBeijinho;
#docinhosPorCrianca = (docinhosTotal//qntCriancas);
#valorBrig = float(qntBrigadeiros*custoBrigadeiro);
#valorKiss = float(qntBeijinho*custoLittleKiss);
#totalGasto = valorBrig + valorKiss;
#print(f"Total Gasto: R${totalGasto:.2f}");
#print("Docinhos por Criança:", docinhosPorCrianca);
###############################################
#             Exercício numero 4              #
###############################################
taxaIPVA = float(input("-------------------------------------\n   Valor IPVA\n-------------------------------------\n:"));
taxaTransito = float(input("-------------------------------------\n   Valor Taxa Transito\n-------------------------------------\n:"))
desconto = taxaIPVA * 0.05;
totalPagamento = (taxaIPVA-desconto) + taxaTransito;
print(f"-------------------------------------\n   Valor Total\n-------------------------------------\n:{totalPagamento:.2f}");


# 349+121
# 17.45
