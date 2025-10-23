package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
    }
}
/*
Fundamentos de linguagem Java e orientação a Objetos
Conceitos base -> Classe, Objeto, Metodo, Atributo, Variavel, Construtor, Pacote, Interface, Modificador de acesso
    Classe:
        Eh um modelo ou molde que define as caracteristicas e comportamentos de um objeto.
        Ela encapsula dados (atributos) e funcoes (metodos) relacionadas a esses dados.
    Objeto:
        Eh uma instancia de uma classe. Ele representa uma entidade concreta que possui
        estado (valores dos atributos) e comportamento (metodos).
    Metodo:
        Eh uma funcao definida dentro de uma classe que descreve um comportamento do objeto.
        Pode receber parametros e retornar valores.
    Atributo:
        Sao variaveis declaradas dentro de uma classe e fora de metodos que representam caracteristicas e estado do
        objeto. Mais especificos que variaveis comuns.
    Variavel:
        Eh um espaco na memoria que armazena dados temporariamente durante a execucao do programa. O termo eh usado
        de forma mais generica, podendo se referir a qualquer tipo de dado.
    Construtor:
        Eh um metodo especial usado para inicializar objetos de uma classe. Ele tem o mesmo nome
        da classe e nao possui tipo de retorno.
    Modificador de acesso:
        Define a visibilidade dos membros (atributos e metodos) de uma classe. Os principais
        modificadores sao: public, private, protected e default (sem modificador).
        public: acessivel de qualquer lugar.
        private: acessivel apenas dentro da propria classe.
        protected: acessivel dentro do mesmo pacote e por subclasses.
        default: acessivel apenas dentro do mesmo pacote.

------------------------------------------------------------------------------------------------------------------------

A orientacao a objetos eh sustentada por quatro pilares principais: encapsulamento, heranca, polimorfismo e abstracao.
    Heranca:
        Permite que uma classe (subclasse) herde atributos e metodos de outra classe (superclasse),
        promovendo a reutilizacao de codigo e a criacao de hierarquias de classes.
    Polimorfismo:
        Permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum.
        Isso possibilita a implementacao de metodos que podem operar em diferentes tipos de objetos,
        aumentando a flexibilidade e a extensibilidade do codigo.
    Encapsulamento:
        Refere-se a ocultacao dos detalhes internos de uma classe e a exposicao apenas do necessario
        por meio de metodos publicos (Contrutores, getters, setters). Isso ajuda a proteger o estado
        interno do objeto e a controlar o acesso aos seus dados.
    Abstracao:
        Eh a capacidade de representar conceitos complexos por meio de modelos simplificados.
        Em Java, isso pode ser alcançado por meio de classes abstratas e interfaces,
        que definem contratos para as subclasses implementarem, sem expor os detalhes de implementacao.
 */