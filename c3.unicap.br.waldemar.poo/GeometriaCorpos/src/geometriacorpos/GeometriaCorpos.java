/*
1. Escreva uma classe abstrata chamada FormaGeometrica. Ela deve ter as
seguintes características:
a. Número de lados
b. Método Concreto getNumeroDeLados, que retorna o numero de lados
c. Métodos Abstratos: getArea() e getPerimetro() OBS métodos abstratos
não implmenta apenas realiza assinatura do método
2. Escreva uma sub-classe chamada retângulo, que terá como parâmetros
somente a altura e o comprimento.
3. Escreva uma sub-classe chamada TrianguloRetangulo, que terá como
parâmetros somente a base e a altura.

4. Escreva uma interface chamada Redimensionavel que possui somente
um método, redimensionar(double x). Esse método redimensiona todas as
dimensões da forma geométrica por um fator x.

5. Escreva um método main na classe que vai executar o código. O main deve:
a. Criar um Retângulo com altura de 2 e comprimento de 3
b. Criar um TrianguloRetangulo com altura de 1 e comprimento de 1
c. Imprima a area e o perimetro do triangulo e do retângulo
d. Redefina o Retângulo para um fator de 0.5
e. Imprima a area e o perimetro do retângulo

*/

public class GeometriaCorpos {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo(2,3);
        TrianguloRetangulo tr = new TrianguloRetangulo(1,1);

        System.out.println("Área Retângulo: "+r1.getArea());
        System.out.println("Perímetro Retângulo: "+r1.getPerimetro());
        System.out.println("Área do Triângulo: "+tr.getArea());
        System.out.println("Perímetro do Triângulo: "+tr.getPerimetro());

        r1.redimensionar(0.5);
    }
}
