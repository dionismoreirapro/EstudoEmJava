/***
 * PrimeiraClasse  = Nome da minha classe
 * public = tipo de acesso da classe
 * class = tipo da classe
 * 
 */
class PrimeiraClasse {

    public static void main(String[] args){
        System.out.println("Hello world");


    // Variaveis 
    int dadoDoTipoInt = 10;
    double dadoDoTipoDouble = 10.56;
    float dadoDoTipoFloat = 10.5f;
    Long dadoDoTipoLong = 1000333434343L;
    String dadoDoTipoString = "essa é uma string";
    Boolean dadoDoTipoBoolean = true; // ou false
 

    //IF e Else
    if (dadoDoTipoInt == 10){
        System.out.println("entrou no loop");
    }else if (dadoDoTipoInt == 12) {
        System.out.println("entrou no if do 12");
    }else {
        System.out.println("Está fora do if");
    }

    //While (Faça enquanto for verdadeiro)

    while (dadoDoTipoInt <= 10) {
        System.out.println("valor do int: " + dadoDoTipoInt);
        dadoDoTipoInt--;
        if(dadoDoTipoInt == 0){
            break;
        }
    }


    //FOR 
    for( int valor = 1; valor < 11; valor++){
        System.out.println(valor );
    }



  }
}