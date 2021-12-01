grammar modelo;




tLinha : linha+ #fimLinha ;

linha : (declaracao
        |atribuicao
        |operacao)  #nLinha;

operacao : (Numero | Variavel)+ operadores (Numero | Variavel)+ #nOperacao;

atribuicao : Variavel TAtribuicao (Variavel | Numero| operacao)+ #nAtribuicao;

tipos : (InteiroTipo | StringTipo | BoolTipo)+ #nTipos;

declaracao : tipos (Variavel)  #nDeclaracao;

operadores : (Soma | Subtracao | Multiplicacao | Divisao) #nOperadores;




Soma : '+' ;
Subtracao : '-' ;
Multiplicacao : '*' ;
Divisao : '/' ;
EoF : ';' ;
Space : ('\n'|' '|'\t'|'\r') -> skip;
Bool : ('false'|'true') ;
TAtribuicao : '=' ;
InteiroTipo : 'int' ;
StringTipo : 'string' ;
BoolTipo : 'bool' ;
Impressao : 'imprima';
Variavel : (([a-z])([a-z]| [A-Z]|[0-9])+) ;
Numero : (([0-9])+ ('.'([0-9]))?) ;