package calculadora;

/**
 * <p><strong>Classe de Testes da Calculadora</strong></p>
 *
 * <p>Esta classe tem como objetivo validar o correto funcionamento da classe
 * {@link Calculadora}, executando uma série de testes com operações válidas e
 * também verificando o tratamento de exceções.</p>
 *
 * <p>Os testes incluem:</p>
 * <ul>
 *     <li>Operações válidas: soma, subtração, multiplicação e divisão</li>
 *     <li>Teste de divisão por zero</li>
 *     <li>Teste de operador inválido</li>
 * </ul>
 *
 * <p>A classe utiliza blocos <code>try/catch</code> para capturar e exibir
 * mensagens de exceções lançadas pela classe Calculadora.</p>
 *
 * <p>Este arquivo serve como demonstração prática de:</p>
 * <ul>
 *     <li>Execução de métodos</li>
 *     <li>Tratamento de exceções em Java</li>
 *     <li>Validação de entrada de dados</li>
 *     <li>Testes manuais de unidade</li>
 * </ul>
 *
 * @author João Vitor Peres de Souza
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal responsável por executar os testes da classe Calculadora.</p>
     *
     * <p>Este método:</p>
     * <ul>
     *     <li>Instancia a classe {@link Calculadora}</li>
     *     <li>Executa operações válidas, exibindo seus resultados</li>
     *     <li>Realiza testes com exceções esperadas</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Testes de operações válidas
        System.out.println(calc.calcular(2, 3, "+")); // 5
        System.out.println(calc.calcular(10, 4, "-")); // 6
        System.out.println(calc.calcular(3, 5, "*")); // 15
        System.out.println(calc.calcular(8, 2, "/")); // 4

        // Teste de exceção: divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de exceção: operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
