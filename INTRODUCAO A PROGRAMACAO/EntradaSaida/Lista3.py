# Entrada e Saída - Lista de Exercícios 03    #
###############################################
#             Exercício numero 1              #
###############################################
#valorConsultaConvenio = 170
#valorConsultaParticular = 310
#qntConsultaConvenio = int(input("Consultas Convênio\n:"))
#qntConsultaParticular = int(input("Consultas Particular\n:"))
#receberConv = qntConsultaConvenio * valorConsultaConvenio
#receberPart = qntConsultaParticular * valorConsultaParticular
#valorTotal = receberConv+receberPart
#print(f"Valor semanal recebido:\nR${valorTotal:.2f}")
###############################################
#             Exercício numero 2              #
###############################################
#tempoTrabalhoDiario = 480
#tempoRevisao = int(input("Minutos necessários para revisar os processos\n:"))
#totalDeRevisados = tempoTrabalhoDiario//tempoRevisao
#print(f"Você vai conseguir analisar {totalDeRevisados} processos ao fim do dia.")
###############################################
#             Exercício numero 3              #
###############################################
#qntPessoasConvidadas = int(input("Quantidade de pessoas convidadas\n:"))
#precoRodizio = int(input("Preço do Rodizio\n:"))
#precoSemPromo = qntPessoasConvidadas*precoRodizio
#promocaoDezPessoas = (qntPessoasConvidadas//10)*precoRodizio
#precoFinal = precoSemPromo - promocaoDezPessoas
#print(f"Total a pagar\nR${precoFinal:.2f}")
###############################################
#             Exercício numero 4              #
###############################################
#quantidadeTotalDeRevistas = int(input("Quantidade total de revistas\n:"))
#quantidadeDeAmigos = int(input("Quantidade de amigos\n:"))
#revistasRestantes = quantidadeTotalDeRevistas%quantidadeDeAmigos
#revistasDoadas = quantidadeTotalDeRevistas//quantidadeDeAmigos
#print(f"Revistas doadas para cada amigos\n→ {revistasDoadas}\nRevistas restantes\n→ {revistasRestantes}")




b=5
if b>7:
    a=b+4
    c=a*2
a=(b-2)**3
if a<15:
    d=c-a
    print(a)
elif a>29:
    if b>8:
        d = b+c-1
    elif b<6:
        d =  a * c
else:
    a = a+2*b
print(a,b)
