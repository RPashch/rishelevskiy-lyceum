package lesson6;

public class Task1 {

    public static void main(String[] args) {
        String str = "some string".indent(20);
        System.out.println("indent(20)");
        System.out.println(str);

        String newStr = str.trim();
        System.out.println("trim()");
        System.out.println(newStr);

        System.out.println("toUpperCase()");
        System.out.println(newStr.toUpperCase());

        System.out.println("length()");
        System.out.println(newStr.length());

        System.out.println("charAt(2)");
        System.out.println(newStr.charAt(2));

        System.out.println("indexOf(\"o\")");
        System.out.println(newStr.indexOf("o"));

        System.out.println("replace");
        System.out.println(newStr.replace("o", "bla-bla-blaaa"));

        System.out.println("split");
        String[] array = newStr.split(" ");
        System.out.println(array[0]);
        System.out.println(array[1]);


        String number = String.valueOf(6);
        System.out.println(number);

//        https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html

//        concat(): объединяет строки
//
//        valueOf(): преобразует объект в строковый вид
//
//        join(): соединяет строки с учетом разделителя
//
//        сompare(): сравнивает две строки
//
//        charAt(): возвращает символ строки по индексу
//
//        getChars(): возвращает группу символов
//
//        equals(): сравнивает строки с учетом регистра
//
//        equalsIgnoreCase(): сравнивает строки без учета регистра
//
//        regionMatches(): сравнивает подстроки в строках
//
//        indexOf(): находит индекс первого вхождения подстроки в строку
//
//        lastIndexOf(): находит индекс последнего вхождения подстроки в строку
//
//        startsWith(): определяет, начинается ли строка с подстроки
//
//        endsWith(): определяет, заканчивается ли строка на определенную подстроку
//
//        replace(): заменяет в строке одну подстроку на другую
//
//        trim(): удаляет начальные и конечные пробелы
//
//        substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
//
//        toLowerCase(): переводит все символы строки в нижний регистр
//
//        toUpperCase(): переводит все символы строки в верхний регистр


//        https://metanit.com/java/tutorial/7.2.php
    }

}
