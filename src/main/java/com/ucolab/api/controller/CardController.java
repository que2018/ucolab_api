package com.ucolab.api.controller;

import java.util.Optional;

import com.ucolab.api.common.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.ucolab.api.model.dao.Card;
import com.ucolab.api.repository.CardRepository;

@RestController
@RequestMapping(path="/card")
public class CardController {
	@Autowired
	private CardRepository cardRepository;

	@GetMapping(path="/get/{cardId}")
	public @ResponseBody Result getCard (@PathVariable("cardId") int cardId) {
		Optional<Card> card = cardRepository.findById(cardId);

		if (card.isPresent()) {
			return Result.success(card.get());
		} else {
			return Result.error(2001, "not found");
		}
	}
}
