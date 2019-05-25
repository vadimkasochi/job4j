package ru.job4j.Array;
/**
 * Обертка над строкой.
 */
public class ArrayChar {


    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < pref.length && wrd.length > i; i++) {
             if (pref[i] != wrd[i])
                 result = false;

        }
        return result;
    }
}

