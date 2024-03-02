package personalExercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Array2Test {

//    @Test
//    public void removeVowel(){
//        String[] word = {"i love you"};
//        String[] expected = {" lv y"};
////        System.out.println(Arrays.toString(Array2.removeVowels(word)));
//        assertArrayEquals(expected,Array2.removeVowels(word));

    @Test
    public void removeVowel1(){
        String[] word = {"Praise is a senior dev"};
        String[] expected = {"Prs s  snr dv"};
//        System.out.println(Arrays.toString(Array2.removeVowels(word)));
        assertArrayEquals(expected,Array2.removeVowels(word));

    }

}