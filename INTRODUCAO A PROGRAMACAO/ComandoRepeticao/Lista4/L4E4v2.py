# 4 entradas de notas de 4 alunos diferente
# imprimir a média de cada aluno e reprovado ou aprovado (media>8)
# imprimir a quantidade de alunos aprovados
# imprimir a media da turma  X
# imprimir maior media

alunosAprovados = 0
mediaTurma = 0
maiorMedia = 0
quantidadeAprovados = 0
resultadoAlunos = ""

quantidadeAlunos = 4
quantidadeProvas = 4


controleA = 0
while(controleA < 4): 
    mediaTemp = 0
    controleB = 0 
    aprovado = "Reprovado"
    while(controleB < 4): 
        notaIndividual = float(input(f"Informe a nota {controleB+1} do aluno {controleA+1}: "))
        mediaTemp += notaIndividual
        mediaTurma += notaIndividual
        controleB+=1
    controleA+=1
    media = mediaTemp / 4
    if(media>=8):
        aprovado = "Aprovado"
        quantidadeAprovados += 1
    resultadoAlunos+= f"O aluno {controleA} teve média {media:.2f} e foi {aprovado}.\n"
    if(media > maiorMedia): maiorMedia = media
    print("--")

mediaFTurma = mediaTurma / (quantidadeAlunos*quantidadeProvas)

print(resultadoAlunos)
print(f"Alunos aprovados: {quantidadeAprovados}")
print(f"Média da turma: {mediaFTurma:.2f}")
print(f"Maior média obtida: {maiorMedia:.2f}")

