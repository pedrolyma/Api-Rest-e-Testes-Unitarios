package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLessThanZeroException extends Exception {

    public BeerStockLessThanZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beer stock cannot be lesser than zero.", id, quantityToDecrement));
    }
}
