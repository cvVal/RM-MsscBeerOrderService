package guru.microservices.beer.order.service.web.mappers;

import guru.microservices.beer.order.service.web.model.BeerOrderDto;
import guru.microservices.beer.order.service.domain.BeerOrder;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
