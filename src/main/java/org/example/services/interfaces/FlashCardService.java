package org.example.services.interfaces;

import org.example.dtos.SearchFlashCardDto;
import org.example.models.FlashCard;

import java.util.List;

public interface FlashCardService {

    public FlashCard createNewFlashCard(FlashCard flashCard);

    public List<FlashCard> bulkCreateNewFlashCards(List<FlashCard> flashCardList);

    public FlashCard deleteFlashCard(FlashCard flashCard);

    public List<FlashCard> searchFlashCard(SearchFlashCardDto searchFlashCardDto);
}
