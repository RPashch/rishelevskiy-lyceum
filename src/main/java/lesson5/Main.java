package lesson5;

public class Main {
    public static void main(String[] args) {
        /**
         * Задание:
         *
         * Создать класс Пользователя(User) с полями String firstName, String lastName, int age
         * Создать два конструктора:
         *      Первый - с указанием всех полей
         *      Второй - с указанием только имени и фамилии, возраст в данном случае должен быть по умолчанию 0
         *      При написании второго конструктора, Вы должны вызывать первый через this(..)
         *
         * У User'a должен быть нестатический void метод, который будет выводить в консоль "My name is " + его имя
         * И метод возвращать год, в котором родился пользователь
         * То есть если текущий год 2020, а возвраст пользователя 15 лет, то он родился в 2005 году
         *
         * Задание со звездочкой: сделать этот метод гибким, то есть, если у вас явно сейчас будет прописано, что
         * текущий возраст 2020, то в 2021 году ваша программа будет работать некорректно
         *
         * Вам нужно с помощью встроенных классов Java реализовать логику так, что Java сама будет доставать текущий год, а
         * вы уже будете отнимать от этого его возраст, погуглите как в Java достать текущий год и все станет достаточно просто)
         *
         *
         *
         * Создать класс UserGenerator, который должен уметь генерировать рандомных пользователей, то есть у вас должен
         * быть метод .generateRandomUsers(), в который вы передаете сколько пользователей хотите, а метод должен вернуть
         * массив с вашими пользователями
         * Чтобы генерировать псевдно-рандомные имена и фамиили, создайте массив для имен и фамилий, и каждый заполните
         * до 10 разными именами и фамилиями соответсвенно
         *
         * Для работы вам понадобится класс стандартной библиотеки Java - Random, погуглите как пользоваться объектами данного класа и тд
         *
         * Конструктор UserGenerator должен принимать 4 параметра, которые вы будете использовать при генерации пользователей
         *      1. массив допустипых имен
         *      2. массив допустимых фамилий
         *      3. нижняя граница возрастов
         *      4. вернхняя граница возрастов
         *
         *
         *
         * в методе main() создайте объект UserGenerator, передав все нужные аргументы в конструктор
         * с помощью этого объекта создайте 10 рандомных пользователей
         *
         * с помощью for пройдитесь по каждому из них и выведите Имя Фамилия Возраст
         * с помощью того же цикла найдите самого старого пользователя и выведите его Имя Фамилию Возраст и надпись "I'm the oldest user here"
         * и выведите в каком году родился данный пользователь, используя метод, который вы написали в классе User'a
         *
         *
         * Создайте ещё один объект типа UserGenerator, но уже с другими входными аргументами
         * с помощью уже этого объекта создайте 10 рандомных пользователей
         * повторите операции описанные выше, но уже с этими пользователями
         *
         *
         * Задание со звездочкой:
         *      1. Обработка пользователей(вывод на экран и нахождение самого старого) должна быть в отдельном методе
         *      2. Сделайте табличку при выводе пользоветелй типа такой:
         *      -------------------------------------
         *      | First Name     | Last Name  | Age |
         *      -------------------------------------
         *      | Artyom         | Kazlanzhy  | 19  |
         *      | Nikita         | Satyr      | 20  |
         *      | Anna           | Perederii  | 19  |
        */
    }
}
