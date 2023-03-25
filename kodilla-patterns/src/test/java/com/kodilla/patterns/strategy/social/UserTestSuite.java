package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User millenials = new Millenials("Koko");
        User yGen = new YGeneration("Jojo");
        User zGen = new ZGeneration("Bobo");

        //When
        String kokoShare = millenials.sharePost();
        String jojoShare = yGen.sharePost();
        String boboShare = zGen.sharePost();

        //Then
        assertEquals("Facebook", kokoShare);
        assertEquals("Twitter", jojoShare);
        assertEquals("Snapchat", boboShare);
    }
    @Test
    void testIndividualSharingStrategy() {

        //Given
        User youngSpiritMillenials = new Millenials("Fufu");

        //When
        String fufuBasicShare = youngSpiritMillenials.sharePost();
        youngSpiritMillenials.setSocialPublisher(new SnapchatPublisher());
        String fufuNewShare = youngSpiritMillenials.sharePost();

        //Then
        assertEquals("Snapchat", fufuNewShare);
    }
}
