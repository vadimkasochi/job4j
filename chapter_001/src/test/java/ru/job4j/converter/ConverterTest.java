package ru.job4j.converter;

import org.junit.Test;
import ru.job4j.Converter.Converter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {




        @Test
        public void when60RubleToDollarThen1() {
            Converter converter = new Converter();
            int result = converter.rubleToDollar(60);
            assertThat(result, is(1));
        }

        @Test
        public void when70RubleToEuroThen1() {
            Converter converter = new Converter();
            int result =  converter.rubleToEuro(70);
            assertThat(result, is(1));
        }
        @Test
        public void when1EuroToRubleThen70(){
            Converter converter = new Converter();
            int result = converter.euroToRuble(1);
            assertThat(result, is(1));
        }

        @Test
        public void when1DollarToRubleThen0(){
            Converter converter = new Converter();
            int result = converter.dollarToRuble(60);
            assertThat(result, is(1));
        }

    }


