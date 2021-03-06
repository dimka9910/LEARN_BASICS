package com.github.dimka9910.testtasks.types;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BooleanTest {

    @Test
    void booleanTest() {
        int a = 1;
        int b = 0;
        int c = -1;
        int d = -2;
        int e = 2;

        boolean b1 = (a | b) == 3;
        boolean b2 = a == b;

        System.out.println((a ^ e));
    }

//    & (побитовое и)
//              Бинарный оператор AND копирует бит в результат, если он существует в обоих операндах.
//              (A & B) даст 12, который является 0000 1100
//    | (побитовое или)
//              Бинарный оператор OR копирует бит, если он существует в любом из операндов.
//              (A | B) даст 61 который равен 0011 1101
//    ^ (побитовое логическое или)
//              Бинарный оператор XOR копирует бит, если он установлен в одном операнде, но не в обоих.
//              (A ^ B) даст 49, которая является 0011 0001
//    ~ (побитовое дополнение)
//              Бинарный оператор дополнения и имеет эффект «отражения» бит.
//              (~ A) даст -61, которая является формой дополнением 1100 0011 в двоичной записи
//    << (сдвиг влево)
//              Бинарный оператор сдвига влево.
//              Значение левых операндов перемещается влево на количество бит, заданных правым операндом.	A << 2 даст 240, который 1111 0000
//    >> (сдвиг вправо)
//              Бинарный оператор сдвига вправо.
//              Значение правых операндов перемещается вправо на количество бит, заданных левых операндом.	A >> 2 даст 15, который является 1111
//    >>> (нулевой сдвиг вправо)
//              Нулевой оператор сдвига вправо. Значение левых операндов перемещается вправо на количество бит, заданных правым операндом, а сдвинутые значения заполняются нулями.
//              A >>> 2 даст 15, который является 0000 1111
}
