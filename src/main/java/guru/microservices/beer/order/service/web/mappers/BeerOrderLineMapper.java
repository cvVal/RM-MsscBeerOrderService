package guru.microservices.beer.order.service.web.mappers;

import guru.microservices.beer.order.service.web.model.BeerOrderLineDto;
import guru.microservices.beer.order.service.domain.BeerOrderLine;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
