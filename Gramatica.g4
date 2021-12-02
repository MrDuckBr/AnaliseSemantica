grammar Gramatica;

tLinha : linha #fimLinha;
linha : (atribuicao|operacao|declaracao)*  #nLinha;
operacao : (Numero | Variavel) operadores (Numero | Variavel) EoF  #nOperacao;
atribuicao : Variavel TAtribuicao ((Variavel|Numero) EoF | operacao)  #nAtribuicao;
declaracao : Tipos Variavel EoF  #nDeclaracao;
operadores : (Soma | Subtracao | Multiplicacao | Divisao) #nOperadores;
impressao : (Impressao Variavel) #nImpressao;



Soma : '+' ;
Subtracao : '-' ;
Multiplicacao : '*' ;
Divisao : '/' ;
EoF : ';' ;
Space : ('\n'|' '|'\t'|'\r') -> skip;
Bool : ('false'|'true') ;
TAtribuicao : '=' ;
Tipos : 'int'|'string'|'bool' ;
Impressao : 'imprima';
Variavel : (([a-z]| [A-Z])([a-z]| [A-Z]|[0-9])+) ;
Numero : (([0-9])+ ('.'([0-9]))?) ;


