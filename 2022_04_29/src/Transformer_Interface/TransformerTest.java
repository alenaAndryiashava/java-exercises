package Transformer_Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {

        private Transformer transformer = new Transformer();

        @Test
        public void test_transform_zero_length(){
            String zero = "";
            assertEquals(zero, transformer.transform(zero,new ToLowerCaseChecker()));
            assertEquals(zero, transformer.transform(zero,new ToUpperCaseChecker()));

        }


        @Test
        public void test_transformer_lower_case() {
            String actual = "aaa BB dEFrt";
            String expected = "aaa bb dEFrt";

            assertEquals(expected,transformer.transform(actual,new ToLowerCaseChecker()));
        }


        @Test
        public void test_transformer_upper_case() {
            String actual = "aaa BBBB dEFrt";
            String expected = "AAA BBBB dEFrt";
            assertEquals(expected,transformer.transform(actual,new ToUpperCaseChecker()));
        }

        @Test
        public void test_transformer_no_change() {
            String expected = "aaaaa BBBBB dEFrt";
            assertEquals(expected, transformer.transform(expected, new ToUpperCaseChecker()));
        }

}