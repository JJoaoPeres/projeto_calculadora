package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 *
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas como soma, subtração,
 * multiplicação e divisão, além de um método principal que realiza a
 * operação desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Este projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca);</li>
 *     <li>Técnicas de revisão (caixa preta);</li>
 *     <li>Aplicação de refatoração em código Java;</li>
 *     <li>Documentação com Javadoc.</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são
 * <strong>métodos puros</strong>, isto é, não possuem efeitos colaterais,
 * o que melhora a legibilidade e facilita a criação de testes unitários.</p>
 *
 * @author João Vitor Peres de Souza
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado de {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado de {@code a * b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * <p><strong>Atenção:</strong> divisão por zero não é permitida. Caso o
     * segundo operando seja igual a zero, uma exceção será lançada.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado de {@code a / b}
     *
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Executa a operação matemática solicitada com base no operador informado.
     *
     * <p><strong>Operadores aceitos:</strong></p>
     * <ul>
     *     <li><code>"+"</code> : soma;</li>
     *     <li><code>"-"</code> : subtração;</li>
     *     <li><code>"*"</code> : multiplicação;</li>
     *     <li><code>"/"</code> : divisão.</li>
     * </ul>
     *
     * <p>Caso o operador informado não seja um dos símbolos válidos,
     * uma exceção será lançada.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação solicitada
     *
     * @throws IllegalArgumentException se o operador não for válido
     */
    public int calcular(int a, int b, String operador) {

        switch (operador) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
