package ru.job4j.Ideal_Weight;

/**
 * Программа расчета идеального веса.
 */
public class IdealWeight {

        /**
         * Идеальный вес для мужщины.
         * @param height Рост.
         * @return идеальный вес.
         */
        public double manWeight(double height) {
            return height * 1.15;
        }

        /**
         * Идеальный вес для женщины.
         * @param height Рост.
         * @return идеальный вес.
         */
        public double womanWeight(double height) {
            return height * 1.15;
        }
    }

