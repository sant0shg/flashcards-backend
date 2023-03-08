package org.example.services.interfaces;

import org.example.dtos.SearchFlashCardDto;
import org.example.models.FlashCard;

import java.util.List;

public interface FlashCardRepository {

    public FlashCard insertFlashCard(FlashCard flashCard);

    public FlashCard deleteFlashCard(FlashCard flashCard);

    public List<FlashCard> getFlashCards(FlashCard flashCard);

    public FlashCard updateFlashCard(FlashCard flashCard);

    public List<FlashCard> searchFlashCard(SearchFlashCardDto searchFlashCardDto);
}
