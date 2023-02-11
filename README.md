## Prática de Java e java.lang: programe com a classe Object e String

Material de estudos práticos do Programa ONE da Oracle

### Anotações

* FQN (Full Qualified Name) é nome completo da classe, composto pelo nome do pacote e o nome da classe.
* Packages: são diretórios com significado especial dentro do código fonte Java, a palavra chave package deve ser a primeira declaração no código fonte Java, servem para organização e agrupar as classes e interfaces.
* Boas práticas, seguindo a regra: NOME_DO_SITE_AO_CONTRARIO.NOME_DO_PROJETO
* Estruta de pastas do projeto: br > com > bytebank > banco > modelo > teste.
* Hierarquia: package > import > class.

* Atalho para import: Ctrl + Shift + O

* Quatro modificadores de ordem do MAIS restritivo para o MENOS restritivo é: private, default, protected e public.
* private (visível apenas na classe)
* package private (visível na classe do mesmo pacote, podendo ser chamado de default)
* protected (visível na classe mesmo pacote e para qualquer filho)
* public (visível em qualquer pacote)

* Declarar um javadoc no código fonte:  usar o char / seguidos por 2 chars **

* Lista de tags ou anotações do javadoc:
    * @author (usado na classe ou interface)
    * @version (usado na classe ou interface)
    * @param (usado no método e construtor)
    * @return (usado apenas no método)
    * @exception ou @throws (no método ou construtor)
    * @see
    * @since
    * @serial
    * @deprecated

* Criar biblioteca: Project > Generate Javadoc > Javadoc Generation
* Export Doc: JAR file (cria pasta zip) Java ARchive

* Pacote java.lang: classes essenciais, automaticamente importado. 
* Exemplos do pacote java.lang: Exception, RuntimeException, NullPointerException ou ArithmeticException.
* String: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
* String: objetos da classe String são imutáveis, significa que, uma vez criado, não pode ser alterado, por isso qualquer alteração cria um novo objeto String.
* Métodos da classe String: trim, charAt, contains, isEmpty, length, indexOf, replace. 

