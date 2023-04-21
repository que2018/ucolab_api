package com.ucolab.api.controller;

import com.ucolab.api.model.dao.Merchant;
import com.ucolab.api.model.dto.MerchantDTO;
import com.ucolab.api.repository.MerchantRepository;
import com.ucolab.api.common.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/merchant")
public class MerchantController {
    @Autowired
    private MerchantRepository merchantRepository;

    @PostMapping(path="/add", produces="application/json")
    public @ResponseBody Result<Merchant> addMerchant (@RequestBody MerchantDTO merchantDTO) {
        Merchant merchant = new Merchant();
        merchant.setUsername(merchantDTO.getUsername());
        merchant.setFirstname(merchantDTO.getFirstname());
        merchant.setLastname(merchantDTO.getLastname());
        merchant.setStatus(merchantDTO.getStatus());
        merchant.setEmail(merchantDTO.getEmail());

        merchantRepository.save(merchant);

        return Result.success(merchant);
    }

    @GetMapping(path="/get_list")
    public @ResponseBody Iterable<Merchant> getMerchants() {
        return merchantRepository.findAll();
    }

    @GetMapping(path="/get_total")
    public @ResponseBody long getTotalMerchant() {
        return merchantRepository.getTotalMerchant();
    }
}
