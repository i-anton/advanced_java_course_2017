package main.java.edu.technopolis;


/**
 * Интрефейс, который следует унаследовать при решении домашнего задания.<br/>
 * <h1>!!!Важно!!!</h1>
 * Нельзя использовать {@link java.math.BigInteger}/{@link java.math.BigDecimal} при вычислениях чисел.
 * Допускается использовать эти классе при выводе конечного результата.
 */
public interface FibonacciAlgorithm {
    /**
     * Получение числа фибоначчи в десятичном виде по индексу. Например, F(1)=1, F(2)=1, F(3)=2, F(5)=5 и т.д.
     * @see edu.technopolis.Test
     */
    String evaluate(int index);
}
