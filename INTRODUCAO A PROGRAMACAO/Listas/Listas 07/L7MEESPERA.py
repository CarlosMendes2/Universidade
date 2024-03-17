filmesNetflix = [ ["Os Miseráveis", "Musical", 2012, 158, "Português"],["Gravidade", "Aventura", 2013, 91, "Inglês"],["Frozen", "Infantil", 2013, 102, "Português"],["O Artista", "Comédia", 2011, 100, "Inglês"],["Os Smurfs", "Infantil", 2011, 86, "Português"]]

print(filmesNetflix)
# A - Alterar a duração do filme Gravidade para 95 minutos.
print("------------------------")
filmesNetflix[1][3] = 95
print(filmesNetflix)

# B -  Para cada filme de 2011, exibir título, duração e idioma.
print("------------------------")
tamanho = len(filmesNetflix)

for i in range(tamanho):
    if(filmesNetflix[i][2] == 2011):
        print(filmesNetflix[i][0],filmesNetflix[i][3],filmesNetflix[i][4])
### PRESTAR ATENÇÃO NO QUE A QUESTÃO TA PEDINDO!

# C - Exibir o nome do filme mais curto com idioma Inglês.
print("------------------------")
duracaoMaisCurta = filmesNetflix[0][3]
nomeMaisCurto = ""
for i in range(tamanho):
    if(filmesNetflix[i][3]<duracaoMaisCurta and filmesNetflix[i][4] == "Inglês"):###
        duracaoMaisCurta = filmesNetflix[i][3]
        nomeMaisCurto = filmesNetflix[i][0]
print(nomeMaisCurto)

#D - Exibir o total em minutos que alguém levaria para assistir todos os filmes infantis.
print("------------------------")
totalMinutosInfantil = 0
for i in range(tamanho):
    if(filmesNetflix[i][1] == "Infantil"):
        totalMinutosInfantil += filmesNetflix[i][3]
print(totalMinutosInfantil)
    
#E - Exibir o título e o ano dos filmes disponíveis em inglês.
print("------------------------")
for i in range(tamanho):
    if(filmesNetflix[i][4] == "Inglês"):
        print(filmesNetflix[i][0],filmesNetflix[i][2])
#F - Exibir a quantidade de filmes com menos de 100 minutos.
print("------------------------")
menosDeDoisMinutos = 0
for i in range(tamanho):
    if(filmesNetflix[i][3]<100):
        menosDeDoisMinutos += 1
print(menosDeDoisMinutos)
#G - Exibir o título de todos os filmes disponíveis em português lançados em 2011.
print("------------------------")
for i in range(tamanho):
    if(filmesNetflix[i][4] == "Português" and filmesNetflix[i][2] == 2011):
        print(filmesNetflix[i][0])
#H - Exibir a duração média dos filmes infantis.
print("------------------------")
quantidadeInfantis = 0
for i in range(tamanho):
    if(filmesNetflix[i][1] == "Infantil"):
        quantidadeInfantis += 1
mediaInfantis = totalMinutosInfantil // quantidadeInfantis
print(mediaInfantis)
#I - Exibir uma lista com os gêneros de filmes lançados entre 2012 e 2015.
entreQuinzeDezoito = []
for i in range(tamanho):
    if(filmesNetflix[i][2] >= 2012 and filmesNetflix[i][2] <= 2015):
        entreQuinzeDezoito.append(filmesNetflix[i][1])
print(entreQuinzeDezoito)














