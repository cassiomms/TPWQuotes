TPWQuotes
==========
## Authors

5890121 
Thiago Camargo Kronig 
kronig@grad.icmc.usp.br

5909002
Cássio de Matos Silva
cassiomms@grad.icmc.usp.br

5890326
Gabriel de Oliveira Gonçalves
gabrielcdc@grad.icmc.usp.br

6426750
Gabriel Cantareira
gabrieldc@grad.icmc.usp.br

## Get Dependencies, Build and Deploy
   
    $ chmod +x fetch-lib.sh
    $ ./fetch-lib.sh
    $ ant war deploy

## Description

-> especificacao.pdf

## Diagrama do modelo

-> modelo.jpg

## Iniciando repositório

Instalando os pacotes do git (Ubuntu):
apt-get install git-core gitk

Configurando algumas coisas:
	$ git config --global user.name 'Meu nome completo'
	$ git config --global user.email 'emailcadastrado@nogithub.com'
	$ git config --global core.editor 'gedit'

Blz, depois de configurado, precisamos clonar o repositório que está na conta do kronig pro pc local, isso deve ser feito em um diretório vazio e precisa de uma chave pública ssh pra poder fazer isso, essa parte da chave ssh eu fiz seguindo esse tutorial:

http://help.github.com/linux-set-up-git/

Depois do ssh funcionando, é só clonar o repositório:

	$ git clone git@github.com:cassiomms/TPWQuotes.git

Depois de clonado, só usar os comandos abaixo, não esquecer de sempre dar pull qdo for começar a trabalhar, commit qdo terminar e push pra mandar para o repositório remoto...

## Uso do Git

Acabou de abrir o pc? Então, primeira coisa a fazer:
    
    $ git pull
    
Isso garante que você trabalhe no último commit pushed no github.

Você deve adicionar os arquivos que deseja controlar com o Git. Se criarmos
um novo bean NovoBean.java em src/ecommerce/model/NovoBean.java, ele não 
estará sob controle do Git ainda! Para tanto, faça:
   
    $ git add src/ecommerce/model/NovoBean.java

Beleza! Agora suponha que você modificou o conteúdo de outros arquivos, por 
exemplo, corrigiu um bug foda no src/ecommerce/model/Usuario.java. Ele já 
está sob controle do Git, entretanto a sua alteração não foi instanciada 
pro Git ainda. Ou seja, ele não vai commitar essa alteração enquanto você 
não explicitar pra ele. Você o faz com o mesmo comando add:
    
    $ git add src/ecommerce/model/Usuario.java

Um saco, não? Mas beleza, isso permite que você altere uma pancada de arquivos 
e depois faça o commit de pequenas porções, por exemplo:

    $ git add src/ecommerce/model/*
    $ git commit -m 'Correções do model.'
    $ git add web/static/*.css  
    $ git commit -m 'Novas classes para o css.'

Alterações dentro da árvore de diretório devem ser feitas sempre que possível
pelo Git. Para alterar o nome/caminho de um arquivo, por exemplo, faça:

    $ git mv src/ecommerce/model/Account.java src/ecommerce/model/Usuario.java

E pra deletar, faça:

    $ git rm conf/application.xml
    $ git commit -m 'Não precisamos de application.xml.'

No fim de tudo, dê push no repositório do github assim:

    $ git push

