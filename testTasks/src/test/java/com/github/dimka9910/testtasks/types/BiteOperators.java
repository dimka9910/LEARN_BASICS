package com.github.dimka9910.testtasks.types;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.ByteBuffer;

@SpringBootTest
public class BiteOperators {

    byte byby; //  -128 / 127
    short ss;  //-32768 / 32767
    int kk;    // -2^31 2^31-1
    long ll;   // -2^63 2^63-1
    float ff;  // 32bit
    double dd; // 64bit
    boolean bb;//
    char cc;  //	'\u0000'  - '\uffff'   65535 symbols 16bit unicode

    @Test
    void defaultValues() {
        System.out.println(kk);
        System.out.println(bb);
        System.out.println(cc); //	'\u0000'
        System.out.println(ff);
        System.out.println(dd);
        System.out.println(byby);
        System.out.println(ss);
        System.out.println(ll);
    }

    //    & (побитовое и)
//              Бинарный оператор AND копирует бит в результат, если он существует в обоих операндах.
//              (A & B) даст 12, который является 0000 1100

    @Test
    void nameAND() {
        int a = 2;
        Integer b = 3;
        int c;

        a = Integer.parseInt("10101", 2);
        b = Integer.parseInt("1010", 2);
        c = a & b;  //0


        a = -2;
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE)); //10000000000000000000000000000000   // 2147483647
        System.out.println(Integer.toBinaryString(-1));             //11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(1));              //00000000000000000000000000000001
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)); //01111111111111111111111111111111   // -2147483648

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        b = 2;
        c = Integer.MIN_VALUE | Integer.MAX_VALUE;  //0

        long l1 = Long.MAX_VALUE; //9223372036854775807
        long l2 = Long.MIN_VALUE; //-9223372036854775808

        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);

        long l3 = l1 | l2;

    }

    @Test
    void nameOR() {
        int a = 2;
        Integer b = 3;
        int c;  //3

        a = Integer.parseInt("10101", 2); //21
        b = Integer.parseInt("1010", 2); //10
        c = a | b;  //31

    }


    //    ^ (побитовое логическое или)
    //              Бинарный оператор XOR копирует бит, если он установлен в одном операнде, но не в обоих.
    //              (A ^ B) даст 49, которая является 0011 0001
    @Test
    void nameXOR() {
        int a = 2;
        Integer b = 3;
        int c = a & b;  //3

        a = Integer.parseInt("10101", 2); //21
        b = Integer.parseInt("1001", 2); //10
        b = a ^ b;  //28

    }

    //    ~ (побитовое дополнение)
    //              Бинарный оператор дополнения и имеет эффект «отражения» бит.
    //              (~ A) даст -61, которая является формой дополнением 1100 0011 в двоичной записи
    //              (A ^ B) даст 49, которая является 0011 0001
    @Test
    void nameNO() {

        //~   (-x)-1

        int a = 2;
        int b = ~a;  //-3

        a = 3;
        b = ~a; //-4

        a = Integer.MAX_VALUE;
        b = ~a; //-2147483648

        a = Integer.MIN_VALUE;
        b = ~a; //2147483647

        a = 0;
        b = ~a;

        a = -5;
        b = ~a;  // 4

        long l1 = 22147483648L;
        long l2 = ~l1; //-22147483649
    }

    @Test
    void bitShift() {
//    << (сдвиг влево)
//              Бинарный оператор сдвига влево.
//              Значение левых операндов перемещается влево на количество бит, заданных правым операндом.	A << 2 даст 240, который 1111 0000
        int a = 2 << 2; //8
        a = 2 << 1; //4
        a = 3 << 1; //6
        a = 0 << 1; //0
        a = -3 << 1; //-6

        a = Integer.MAX_VALUE << 1; //-2
        a = Integer.MIN_VALUE << 1; // 0
        System.out.println(a);

//    >> (сдвиг вправо)
//              Бинарный оператор сдвига вправо.
//              Значение правых операндов перемещается вправо на количество бит, заданных левых операндом.	A >> 2 даст 15, который является 1111


                     //-7  // 11111111111111111111111111111001
                           //                 \/
        a = -7 >> 1; //-4  // 11111111111111111111111111111100


                     //9  // 1001
                          //  \/
        a = 9 >> 1;  //4  // 0100

        a = -9 >> 1; //-5
        a = -1 >> 1; //-1
        a = 1 >> 1; //0
        a = Integer.MAX_VALUE >> 1; //1073741823
        a = Integer.MIN_VALUE >> 1; //-1073741824

        a = 5 / 2;  //=  2
        a = -5 / 2; //= -2
        a = 5 >> 1; //=  2
        a = -5 >> 1;//= -3


//    >>> (нулевой сдвиг вправо)
//              Нулевой оператор сдвига вправо. Значение левых операндов перемещается вправо на количество бит, заданных правым операндом, а сдвинутые значения заполняются нулями.
//              A >>> 2 даст 15, который является 0000 1111

        System.out.println(Integer.toBinaryString(9));

        a = 8 >>> 1;  //4
        a = -8 >>> 1; //2147483644

        System.out.println(Integer.toBinaryString(9));
        a = 9 >>> 1;  //4    1001 -> 100
        System.out.println(Integer.toBinaryString(a));

        System.out.println(Integer.toBinaryString(-9));
        a = -9 >>> 1; //2147483643      11111111111111111111111111110111 -> 01111111111111111111111111111011
        System.out.println(Integer.toBinaryString(a));


        a = -1 >>> 1; //2147483647
        a = 1 >>> 1; //0
        a = Integer.MAX_VALUE >>> 1; //1073741823
        a = Integer.MIN_VALUE >>> 1; //1073741824

    }

}
