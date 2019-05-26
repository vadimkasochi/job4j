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
        for (int i = 0; i < wrd.length && pref.length > i; i++) {
             if (wrd[i] != pref[i])
                 result = false;
                 break;

        }
        return result;
    }
}

