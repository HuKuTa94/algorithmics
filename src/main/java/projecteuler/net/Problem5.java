package projecteuler.net;

//TODO Задача 5 - Наименьшее кратное
// 2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
// Какое самое маленькое число делится нацело на все числа от 1 до 20?

class Problem5
{
    public static void main( String[] args )
    {
        int from = 1;
        int to = 20;
        int result = getSolution( from, to );

        System.out.format( "%d - самое маленькое число которое делится без остатка на все числа от %d до %d", result, from, to );
    }

    static int getSolution( int from, int to )
    {
        // Начинаем поиск наименьшего кратного с максимального множителя to
        int resultNumber = to;
        while( true )
        {
            // Перемножаем число на все множители от to до from
            for( int i = to; i >= from; i-- )
            {
                // Данное число не поделилось без остатка, переходим к следующему
                if( resultNumber % i != 0 )
                {
                    resultNumber += to;
                    break;
                }

                // Все итерации пройдены для данного числа, значит оно искомое наименьшее кратное
                if( i == from )
                {
                    return resultNumber;
                }
            }
        }
    }
}
