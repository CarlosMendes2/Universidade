# Receber nome e pontuação ded cada competidor
# Exibir o nome e a pontuação do maior pontuador

nomeMaior = ""
pontuacaoMaior = 0
controle = 4

while(controle > 0):
    entradaNome = input("Nome do competidor: \n→ ")
    entradaPontuacao = int(input("Pontuação: \n→ "))
    if(entradaPontuacao > pontuacaoMaior):
        pontuacaoMaior = entradaPontuacao
        nomeMaior = entradaNome
    controle-=1
if(controle == 0): print(f"{nomeMaior} venceu a competição com {pontuacaoMaior} pontos.")

