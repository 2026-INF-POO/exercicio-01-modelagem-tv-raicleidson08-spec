

1. Edite o arquivo `TV.java` e construa uma modelagem para representar uma TV utilizando as informações abaixo. 

    Uma televisão possui as seguintes características:
    - tamanho de tela (em polegadas);
    - volume: de 100 a 1 iniciando em 5;
    - marca;
    - voltagem (220 e 110);
    - canal.

    A televisão pode realizar as seguintes ações:
    - ligar: ao ligar a televisão deve imprimir seu consumo. O consumo deve ser definido pela voltagem multiplicada pela quantidades de polegadas;
    - desligar;
    - aumentar e diminuir o volume;
    - subir e descer canal.
       class TV{
           int tamanho;
           int volume = 5;
           string marca;
           int voltagem;
           int canal;

           int aumentarvolume(){
               if (volume > 100){
                   volume--;
               }
               return volume;
           }
    }
