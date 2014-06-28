Projeto UBS+
=======

Repositório da aplicação Web do projeto UBS+

O Projeto UBS é um projeto de Flávia Arrais, Francisco Jardel, Samanta Jacques e Fellipe Soares como Trabalho de Conclusão de Curso do curso de Análise de Sistemas da Universidade Salgado de Oliveira - Campus São Gonçalo, orientado pelo Professor Sérgio Paiva Rodas.

### Utilização do repositório (contribuição)

#### Pré-requisitos

* Git instalado no computador
* Criar uma fork do projetoUBS para seu usuário no GitHub
* Criar uma pasta no computador que receberá os arquivos do projeto

Links úteis:

Tutorial rápido do Git: [http://rogerdudler.github.io/git-guide/index.pt_BR.html]
(http://rogerdudler.github.io/git-guide/index.pt_BR.html)

Instalação e Configuração do Git: [http://git-scm.com/book/pt-br/Primeiros-passos-Instalando-Git]
(http://git-scm.com/book/pt-br/Primeiros-passos-Instalando-Git}

#### Configurando o diretório para utilização no projeto UBS+

**Passo 1:** Dentro da pasta criada em sua máquina, inicie o Git Bash e digite:

`git init`

Este comando irá iniciar o Git no diretório, e criar uma pasta .git

**Passo 2:** Será necessário direcionar a Fork do Projeto criada para seu diretório físico. Para isso, digite:

`git remote add origin git@github.com:[seu-user-no-github]/ubs-web.git`

**Passo 3:** Após direcionado a origem (fork), é necessário direcionar o repositório original. Digite:

`git checkout -b upstream/master`
`git remote add upstream git@github.com:projetoUBS/ubs-web.git`

*Passo 4:** Voltar o usuário para o de origem

`git checkout master`

#### Mantendo seu repositório local atualizado

**IMPORTANTE!** Executar estes comandos abaixo todos os dias, ou ao menos antes de iniciar os trabalhos no projeto.

Puxar atualizações do repositório do projeto:

`git checkout master`

`git pull upstream master`

Mesclando seu repositório local com a branch do repositório do projeto

`git merge upstream/master`

#### Adicionando atualizações de seu repositório local para o Projeto

Cada atualização nos arquivos do seu diretório local deve ser refletida (atualizar & confirmar). Para isso existem comandos executados para este propósito:

Visualizar os arquivos alterados/adicionados/excluídos: `git status`

Adicionar as modificações ao index: `git add *`. Em caso de exclusão de arquivos: `git add -u`

Confirmar as modificações: `git commit -m "confirmação da alteração do processo tal"`

Submeter ao repositório pessoal do GitHub: `git push origin master`

#### Realizando PULL REQUEST

Para que suas alterações sejam refletidas no repositório do Projeto, é necessário um PULL REQUEST. 

Para isso vá a sua página no GitHub e clique em "Pull Request", será aberta uma página para que você descreva algum comentário para o mantenedor, preencha os campos e clique em "send Pull Request".

Pronto sua contribuição foi feita, agora depende no mantenedor aceita-la ou não.
