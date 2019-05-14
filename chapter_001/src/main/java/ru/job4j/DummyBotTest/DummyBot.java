package ru.job4j.DummyBotTest;

    /**
     * @author Vadim Rylkov (inetitv@gmail.com)
     * @version $Id$
     * @since 0.1
     */
    public class DummyBot {
        /**
         * Отвечает на вопросы.
         * @param question Вопрос от клиента.
         * @return Ответ.
         */
        public String answer(String question) {
            String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
            if ("Привет, Бот.".equals(question)) {
                rsl =  "Привет, умник.";
            } else if ("До скорой встречи.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
                // заменить ... на правильный ответ rsl = "ответ по заданию".
                rsl = "До скорой встречи.";
            }
            return rsl;
        }
    }

