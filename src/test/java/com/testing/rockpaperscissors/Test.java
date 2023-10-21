package com.testing.rockpaperscissors;

import com.training.corecom.rockpaperscissors.OpponentMove;
import com.training.corecom.rockpaperscissors.PlayAgain;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.internal.matchers.Equals;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

@org.junit.jupiter.api.Test
    public void testOpponentMove(){
                 assertEquals("Rock", OpponentMove.getMove());


    }
@org.junit.jupiter.api.Test
    public void testPlayAgain(){
    assertEquals("y", PlayAgain.getChoiceForTest());

}
@org.junit.jupiter.api.Test
    public void testGetTestString(){
    assertEquals("Hello, my name is Tom.", PlayAgain.getTestString());
}






}
