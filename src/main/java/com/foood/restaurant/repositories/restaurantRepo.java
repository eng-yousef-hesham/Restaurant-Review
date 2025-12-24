package com.foood.restaurant.repositories;

import com.foood.restaurant.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restaurantRepo extends ElasticsearchRepository<Restaurant, String> {
}
