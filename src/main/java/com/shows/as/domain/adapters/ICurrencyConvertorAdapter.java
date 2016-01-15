package com.shows.as.domain.adapters;

import com.shows.as.domain.enums.Moneda;

//interficie de classe adaptadora del servei de conversió de moneda
public interface ICurrencyConvertorAdapter {

    Double conversionRate(Moneda divisa, Moneda moneda);

}
