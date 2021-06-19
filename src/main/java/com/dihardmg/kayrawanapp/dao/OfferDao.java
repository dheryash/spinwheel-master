package com.dihardmg.kayrawanapp.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.dihardmg.kayrawanapp.entity.Offer;

/**
 * @author : Otorus
 * @since : 1/4/18
 */
@Repository
public interface OfferDao extends PagingAndSortingRepository<Offer, String> {
    Page<Offer> findByOfferIdContainingIgnoreCase(String offerId, Pageable pageable);
}
