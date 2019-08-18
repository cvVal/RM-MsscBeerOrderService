package guru.microservices.beer.order.service.services.beer;

import guru.microservices.beer.order.service.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID beerId);
    Optional<BeerDto> getBeerByUpc(String upc);
}
